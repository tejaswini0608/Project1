package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity implements View.OnClickListener{
    Button mButton_add,mButton_sub,mButton_mul,mButton_div,mButton_mod;
    EditText mEditText_n1,mEditText_n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        mButton_add = findViewById(R.id.button_add);
        mButton_sub = findViewById(R.id.button_sub);
        mButton_mul = findViewById(R.id.button_mul);
        mButton_div = findViewById(R.id.button_div);
        mButton_mod = findViewById(R.id.button_mod);


        mEditText_n1 = findViewById(R.id.editText_n1);
        mEditText_n2 = findViewById(R.id.editText_n2);

        mButton_add.setOnClickListener(this);
        mButton_sub.setOnClickListener(this);
        mButton_mul.setOnClickListener(this);
        mButton_div.setOnClickListener(this);
        mButton_mod.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int n1 = Integer.parseInt(mEditText_n1.getText().toString());
        int n2 = Integer.parseInt(mEditText_n2.getText().toString());

        int n3 = 0;

        if(view == mButton_add){
            n3=n1+n2;
        }
        else if(view == mButton_sub){
            n3=n1-n2;
        }

        else if(view == mButton_mul){
            n3=n1*n2;
        }

        else if(view == mButton_div){
            n3=n1/n2;
        }

        else {
            n3=n1%n2;
        }

        Toast.makeText(this, "The result = "+n3, Toast.LENGTH_SHORT).show();
    }
}
