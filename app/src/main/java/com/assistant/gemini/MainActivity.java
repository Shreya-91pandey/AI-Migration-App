package com.assistant.gemini;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends Activity {
    private EditText inputApiKey, inputMessage;
    private TextView chatLog;
    private SharedPreferences prefs;
    private static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("GeminiPrefs", MODE_PRIVATE);

        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setBackgroundColor(Color.parseColor("#121212"));
        rootLayout.setPadding(20, 20, 20, 20);

        TextView title = new TextView(this);
        title.setText("Gemini AI Assistant Pro");
        title.setTextColor(Color.parseColor("#00E676"));
        title.setTextSize(18);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 5, 0, 10);
        rootLayout.addView(title);

        inputApiKey = new EditText(this);
        inputApiKey.setHint("Enter Gemini API Key (AIzaSy...)");
        inputApiKey.setHintTextColor(Color.GRAY);
        inputApiKey.setTextColor(Color.WHITE);
        inputApiKey.setText(prefs.getString("api_key", ""));
        rootLayout.addView(inputApiKey);

        Button saveKeyBtn = new Button(this);
        saveKeyBtn.setText("Save API Key");
        saveKeyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("api_key", inputApiKey.getText().toString().trim()).apply();
                chatLog.append("\n[System]: API Key Saved Successfully!\n");
            }
        });
        rootLayout.addView(saveKeyBtn);

        // Advanced Feature Buttons Bar (Camera & Tools)
        LinearLayout toolsLayout = new LinearLayout(this);
        toolsLayout.setOrientation(LinearLayout.HORIZONTAL);
        toolsLayout.setPadding(0, 10, 0, 10);

        Button cameraBtn = new Button(this);
        cameraBtn.setText("Open Camera");
        cameraBtn.setBackgroundColor(Color.parseColor("#333333"));
        cameraBtn.setTextColor(Color.WHITE);
        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                } else {
                    Toast.makeText(MainActivity.this, "Camera not available", Toast.LENGTH_SHORT).show();
                }
            }
        });
        toolsLayout.addView(cameraBtn);

        Button clearBtn = new Button(this);
        clearBtn.setText("Clear Log");
        clearBtn.setBackgroundColor(Color.parseColor("#333333"));
        clearBtn.setTextColor(Color.WHITE);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatLog.setText("Log cleared.\n\n");
            }
        });
        toolsLayout.addView(clearBtn);

        rootLayout.addView(toolsLayout);

        // Chat Log ScrollView
        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1.0f);
        scrollView.setLayoutParams(scrollParams);

        chatLog = new TextView(this);
        chatLog.setText("Welcome! Camera and Pro features are ready.\n\n");
        chatLog.setTextColor(Color.WHITE);
        scrollView.addView(chatLog);
        rootLayout.addView(scrollView);

        // Input & Send Layout
        LinearLayout inputLayout = new LinearLayout(this);
        inputLayout.setOrientation(LinearLayout.HORIZONTAL);
        inputLayout.setPadding(0, 10, 0, 0);

        inputMessage = new EditText(this);
        inputMessage.setHint("Type your message...");
        inputMessage.setHintTextColor(Color.GRAY);
        inputMessage.setTextColor(Color.WHITE);
        LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);
        inputMessage.setLayoutParams(inputParams);
        inputLayout.addView(inputMessage);

        Button sendBtn = new Button(this);
        sendBtn.setText("Send");
        sendBtn.setBackgroundColor(Color.parseColor("#00E676"));
        sendBtn.setTextColor(Color.BLACK);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apiKey = prefs.getString("api_key", "").trim();
                String prompt = inputMessage.getText().toString().trim();
                if(apiKey.isEmpty()) {
                    chatLog.append("\n[Error]: Please enter and save your API Key first!\n");
                    return;
                }
                if(prompt.isEmpty()) return;

                chatLog.append("\nYou: " + prompt + "\n");
                inputMessage.setText("");
                new CallGeminiTask().execute(apiKey, prompt);
            }
        });
        inputLayout.addView(sendBtn);
        rootLayout.addView(inputLayout);

        setContentView(rootLayout);
    }

    private class CallGeminiTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            String apiKey = params[0];
            String prompt = params[1];
            try {
                URL url = new URL("https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + apiKey);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setDoOutput(true);

                String escapedPrompt = prompt.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
                String jsonBody = "{\"contents\":[{\"parts\":[{\"text\":\"" + escapedPrompt + "\"}]}]}";
                
                OutputStream os = conn.getOutputStream();
                os.write(jsonBody.getBytes("UTF-8"));
                os.close();

                int responseCode = conn.getResponseCode();
                BufferedReader reader;
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                } else {
                    reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                }

                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                if (responseCode != HttpURLConnection.HTTP_OK) {
                    return "API Error Code " + responseCode + ": " + response.toString();
                }
                return response.toString();
            } catch (Exception e) {
                return "Exception: " + e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            chatLog.append("\nGemini Response:\n" + result + "\n-------------------\n");
        }
    }
}
