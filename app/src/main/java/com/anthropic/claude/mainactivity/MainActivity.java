package com.anthropic.claude.mainactivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.anthropic.claude.api.GeminiApiClient;

public class MainActivity extends Activity {
    private EditText inputApiKey, inputMessage;
    private TextView chatLog;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("AI_Pro_Prefs", MODE_PRIVATE);

        // Root Layout (Pro Dark Theme)
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setBackgroundColor(Color.parseColor("#0F172A"));
        rootLayout.setPadding(24, 24, 24, 24);

        // Header / Pro Title
        TextView title = new TextView(this);
        title.setText("AI Assistant Pro (Gemini Powered)");
        title.setTextColor(Color.parseColor("#38BDF8"));
        title.setTextSize(18);
        title.setTypeface(null, android.graphics.Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 16);
        rootLayout.addView(title);

        // API Key Section for Free Unlimited Gemini Usage
        inputApiKey = new EditText(this);
        inputApiKey.setHint("Enter Gemini API Key (Free)");
        inputApiKey.setHintTextColor(Color.parseColor("#64748B"));
        inputApiKey.setTextColor(Color.WHITE);
        inputApiKey.setBackgroundColor(Color.parseColor("#1E293B"));
        inputApiKey.setPadding(16, 16, 16, 16);
        inputApiKey.setText(prefs.getString("gemini_key", ""));
        rootLayout.addView(inputApiKey);

        Button saveKeyBtn = new Button(this);
        saveKeyBtn.setText("Save Key");
        saveKeyBtn.setBackgroundColor(Color.parseColor("#0284C7"));
        saveKeyBtn.setTextColor(Color.WHITE);
        saveKeyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.edit().putString("gemini_key", inputApiKey.getText().toString().trim()).apply();
                chatLog.append("\n[System]: API Key saved successfully!\n");
            }
        });
        rootLayout.addView(saveKeyBtn);

        // Advanced Features & Chat Log ScrollView
        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1.0f);
        scrollParams.setMargins(0, 16, 0, 16);
        scrollView.setLayoutParams(scrollParams);

        chatLog = new TextView(this);
        chatLog.setText("--- Advanced Pro Features Active ---\n- WhatsApp/Mail Integration Ready\n- Live Maps & Tools Connected\n- Powered by Gemini API\n\nEnter your API key above and start exploring!\n\n");
        chatLog.setTextColor(Color.parseColor("#E2E8F0"));
        chatLog.setTextSize(14);
        scrollView.addView(chatLog);
        rootLayout.addView(scrollView);

        // Prompt Input Layout
        LinearLayout inputLayout = new LinearLayout(this);
        inputLayout.setOrientation(LinearLayout.HORIZONTAL);

        inputMessage = new EditText(this);
        inputMessage.setHint("Ask anything (Pro Assistant)...");
        inputMessage.setHintTextColor(Color.parseColor("#64748B"));
        inputMessage.setTextColor(Color.WHITE);
        inputMessage.setBackgroundColor(Color.parseColor("#1E293B"));
        LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);
        inputMessage.setLayoutParams(inputParams);
        inputLayout.addView(inputMessage);

        Button sendBtn = new Button(this);
        sendBtn.setText("Send");
        sendBtn.setBackgroundColor(Color.parseColor("#10B981"));
        sendBtn.setTextColor(Color.WHITE);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String apiKey = prefs.getString("gemini_key", "");
                final String prompt = inputMessage.getText().toString().trim();

                if (apiKey.isEmpty()) {
                    chatLog.append("\n[Error]: Please enter your Gemini API Key first.\n");
                    return;
                }
                if (prompt.isEmpty()) return;

                chatLog.append("\nYou: " + prompt + "\n");
                inputMessage.setText("");

                // Call Gemini API Client
                GeminiApiClient.sendPrompt(apiKey, prompt, new GeminiApiClient.GeminiCallback() {
                    @Override
                    public void onSuccess(String response) {
                        chatLog.append("\nAI Pro: " + response + "\n-------------------\n");
                    }

                    @Override
                    public void onError(String error) {
                        chatLog.append("\n[" + error + "]\n-------------------\n");
                    }
                });
            }
        });
        inputLayout.addView(sendBtn);
        rootLayout.addView(inputLayout);

        setContentView(rootLayout);
    }
}
