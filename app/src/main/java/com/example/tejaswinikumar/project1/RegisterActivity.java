package com.example.tejaswinikumar.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mEditText_mailId,mEditText_password;
    Button mButton_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mEditText_mailId = findViewById(R.id.editText_mailID);
        mEditText_password = findViewById(R.id.editText_password);
        mButton_register = findViewById(R.id.button_register);
        mButton_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String mailId = mEditText_mailId.getText().toString();
        String password = mEditText_password.getText().toString();

        Intent intent = new Intent();
        intent.setClass(this,HomeActivity.class);
        intent.putExtra("mailId",mailId);
        intent.putExtra("password",password);
        startActivity(intent);
        finish();
    }
}
