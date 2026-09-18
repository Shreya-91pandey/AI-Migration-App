package com.anthropic.claude.mainactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("AI Migration App (Gemini Connected)");
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        setContentView(tv);
    }
}
