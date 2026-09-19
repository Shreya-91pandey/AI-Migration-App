package com.assistant.gemini;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends Activity {
    private EditText inputApiKey, inputMessage;
    private TextView chatLog;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("GeminiPrefs", MODE_PRIVATE);

        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setBackgroundColor(Color.parseColor("#121212"));
        rootLayout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("Gemini AI Assistant Pro");
        title.setTextColor(Color.parseColor("#00E676"));
        title.setTextSize(20);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 20);
        rootLayout.addView(title);

        inputApiKey = new EditText(this);
        inputApiKey.setHint("Enter Gemini API Key");
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

        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1.0f);
        scrollView.setLayoutParams(scrollParams);

        chatLog = new TextView(this);
        chatLog.setText("Welcome! Enter your Gemini API key above and start chatting.\n\n");
        chatLog.setTextColor(Color.WHITE);
        scrollView.addView(chatLog);
        rootLayout.addView(scrollView);

        LinearLayout inputLayout = new LinearLayout(this);
        inputLayout.setOrientation(LinearLayout.HORIZONTAL);
        inputLayout.setPadding(0, 20, 0, 0);

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
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apiKey = prefs.getString("api_key", "");
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

                String jsonBody = "{\"contents\":[{\"parts\":[{\"text\":\"" + prompt.replace("\"", "\\\"") + "\"}]}]}";
                OutputStream os = conn.getOutputStream();
                os.write(jsonBody.getBytes("UTF-8"));
                os.close();

                Scanner scanner = new Scanner(conn.getInputStream());
                StringBuilder response = new StringBuilder();
                while (scanner.hasNext()) {
                    response.append(scanner.nextLine());
                }
                scanner.close();
                return response.toString();
            } catch (Exception e) {
                return "Error: " + e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            chatLog.append("\nGemini: " + result + "\n-------------------\n");
        }
    }
}
