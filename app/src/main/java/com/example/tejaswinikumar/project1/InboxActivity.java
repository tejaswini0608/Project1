package com.example.tejaswinikumar.project1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InboxActivity extends AppCompatActivity {
    SharedPreferences mSharedPreferences;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);
        mTextView = findViewById(R.id.textView_welcome);

        mSharedPreferences = getSharedPreferences("user_details",MODE_PRIVATE);
        String username = mSharedPreferences.getString("username","");
        mTextView.append(username);
    }
}
