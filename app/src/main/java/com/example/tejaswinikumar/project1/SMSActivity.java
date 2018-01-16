package com.example.tejaswinikumar.project1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.icu.text.CompactDecimalFormat;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {

    EditText mEditText_msg,mEditText_phone;
    Button mButton;
    MyOnClickListener mMyOnClickListener;
    SmsManager mSmsManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        mEditText_msg=findViewById(R.id.editText_sms);
        mEditText_phone=findViewById(R.id.editText_phonenumbar);
        mButton=findViewById(R.id.button_send_sms);

        mMyOnClickListener = new MyOnClickListener();
        mButton.setOnClickListener(mMyOnClickListener);

        mSmsManager = SmsManager.getDefault();
    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            String message = mEditText_msg.getText().toString();
            String phoneno = mEditText_phone.getText().toString();
            if(checkPermission())
            mSmsManager.sendTextMessage(phoneno,null,message,null,null);

        }
    }

    private boolean checkPermission(){
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},100);

            return false;
        }
        return true;
    }
}
