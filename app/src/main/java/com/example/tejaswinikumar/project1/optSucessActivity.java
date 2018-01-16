package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class optSucessActivity extends AppCompatActivity {
TextView motp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opt_sucess);

        motp=findViewById(R.id.otppp);

    }
}
