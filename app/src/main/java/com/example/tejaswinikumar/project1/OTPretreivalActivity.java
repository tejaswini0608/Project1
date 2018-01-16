package com.example.tejaswinikumar.project1;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class OTPretreivalActivity extends AppCompatActivity {


    EditText mEditText_phone;
    Button mButton;
    MyOnClickListener mMyOnClickListener;
    SmsManager mSmsManager;
    SharedPreferences mSharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpretreival);

        mEditText_phone=findViewById(R.id.editText_phonenumbar);
        mButton=findViewById(R.id.button_send_sms);

        mMyOnClickListener = new MyOnClickListener();
        mButton.setOnClickListener(mMyOnClickListener);

        mSmsManager = SmsManager.getDefault();
        mSharedPreferences = getSharedPreferences("otp storage",MODE_PRIVATE);
    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Random ran=new Random();
            int OTP=ran.nextInt(10000);
            Toast.makeText(OTPretreivalActivity.this,OTP+"",Toast.LENGTH_SHORT).show();


            String phoneno = mEditText_phone.getText().toString();
            if(checkPermission())
                mSmsManager.sendTextMessage(phoneno,null,OTP+"",null,null);

            SharedPreferences.Editor editor = mSharedPreferences.edit();
            editor.putString("opt sent",OTP+"");
            editor.apply();

            Intent intent = new Intent();
            intent.setClass(OTPretreivalActivity.this,verifyOTPActivity.class);

            startActivity(intent);
            finish();

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
