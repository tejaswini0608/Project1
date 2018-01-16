package com.example.tejaswinikumar.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {
    int MESSAGE_REQUEST = 100;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        mTextView = findViewById(R.id.textView_message);
    }

    public void getMessage(View view){
        Intent intent = new Intent();
        intent.setClass(this,MessageActivity.class);
        startActivityForResult(intent,MESSAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            if(requestCode == MESSAGE_REQUEST){
                String message  = data.getExtras().getString("message");
                mTextView.setText(message);
            }
        }
    }
}
