package com.example.tejaswinikumar.project1;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MobileCallActivity extends AppCompatActivity {
    EditText mEditText;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_call);

        mEditText=findViewById(R.id.editText_phoneno);
        mButton=findViewById(R.id.button_call);
        mButton.setOnClickListener(mOnClickListener);
    }

    View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String phoneno = mEditText.getText().toString();

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+phoneno));
            if(checkPermission())
            {
                startActivity(intent);
            }
        }
    };

    @TargetApi(Build.VERSION_CODES.M)
    private boolean checkPermission(){
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1000);
            return false;
        }
        return true;
    }
}
