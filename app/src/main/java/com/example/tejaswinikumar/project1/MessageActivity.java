package com.example.tejaswinikumar.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {
    EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        mEditText = findViewById(R.id.editText_message);

    }

    public void onSend(View view){
        String message = mEditText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("message",message);
        setResult(RESULT_OK,intent);
        finish();
    }
}
