package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView mTextView_toggle;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1="Welcome to Android";
        s2="Good Bye";
        mTextView_toggle = (TextView) findViewById(R.id.textView_toggle);
        mTextView_toggle.setText(s1);
        mTextView_toggle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        s1 = mTextView_toggle.getText().toString();
        mTextView_toggle.setText(s2);
        s2 = s1;
    }
}
