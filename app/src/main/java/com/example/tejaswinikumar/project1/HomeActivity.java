package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView mTextView_mailId,mTextView_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTextView_mailId = findViewById(R.id.textView_mailId);
        mTextView_password = findViewById(R.id.textView_password);

        Bundle bundle = getIntent().getExtras();
        String mailID = bundle.getString("mailId");
        String password = bundle.getString("password");

        mTextView_password.append(password);
        mTextView_mailId.append(mailID);
    }
}
