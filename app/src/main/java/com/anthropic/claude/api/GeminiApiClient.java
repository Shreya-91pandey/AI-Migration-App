package com.anthropic.claude.api;

import android.os.AsyncTask;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GeminiApiClient {

    public interface GeminiCallback {
        void onSuccess(String response);
        void onError(String error);
    }

    public static void sendPrompt(final String apiKey, final String prompt, final GeminiCallback callback) {
        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                try {
                    URL url = new URL("https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + apiKey);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-Type", "application/json");
                    conn.setDoOutput(true);

                    String escapedPrompt = prompt.replace("\"", "\\\"").replace("\n", "\\n");
                    String jsonBody = "{\"contents\":[{\"parts\":[{\"text\":\"" + escapedPrompt + "\"}]}]}";

                    OutputStream os = conn.getOutputStream();
                    os.write(jsonBody.getBytes("UTF-8"));
                    os.close();

                    if (conn.getResponseCode() != 200) {
                        return "Error: HTTP Code " + conn.getResponseCode();
                    }

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
                if (result.startsWith("Error")) {
                    callback.onError(result);
                } else {
                    callback.onSuccess(result);
                }
            }
        }.execute();
    }
}
