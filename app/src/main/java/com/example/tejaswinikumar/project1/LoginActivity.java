package com.example.tejaswinikumar.project1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mEditText_mailId,mEditText_password;
    Button mButton_login;

    SharedPreferences mSharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mEditText_mailId = findViewById(R.id.editText_mailID);
        mEditText_password = findViewById(R.id.editText_password);
        mButton_login = findViewById(R.id.button_login);
        mButton_login.setOnClickListener(this);

        mSharedPreferences = getSharedPreferences("user_details",MODE_PRIVATE);
        if(isLoggedIn()){
            Intent intent = new Intent();
            intent.setClass(this,InboxActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private boolean isLoggedIn(){
        String username = mSharedPreferences.getString("username","");
        return !username.equals("");
    }

    @Override
    public void onClick(View view) {
        String mailId = mEditText_mailId.getText().toString();
        String password = mEditText_password.getText().toString();

        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString("username",mailId);
        editor.putString("password",password);
        editor.apply();
        Intent intent = new Intent();
        intent.setClass(this,InboxActivity.class);
        startActivity(intent);
        finish();

    }
}
