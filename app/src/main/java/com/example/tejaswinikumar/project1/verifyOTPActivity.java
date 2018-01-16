package com.example.tejaswinikumar.project1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class verifyOTPActivity extends AppCompatActivity {

    SharedPreferences mSharedPreferences;
    static Button mButton_verify;
    static EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);

        mButton_verify=findViewById(R.id.button_verify);
        mEditText=findViewById(R.id.editText_otp);
        mSharedPreferences = getSharedPreferences("otp storage",MODE_PRIVATE);


        mButton_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sent = mSharedPreferences.getString("opt sent","");
               // String receive = mSharedPreferences.getString("opt receive","");
                 String receive=mEditText.getText().toString();

                if((sent).equals(receive)) {


                    Intent intent = new Intent();
                    intent.setClass(verifyOTPActivity.this,optSucessActivity.class);
                    startActivity(intent);
                    finish();
                }

                else{
                    Toast.makeText(verifyOTPActivity.this,"error",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public static  void callButtonClick(){
        mButton_verify.callOnClick();
    }


}
