package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ScientificCalculator extends AppCompatActivity implements View.OnClickListener{
   Button mbutton1,mbutton2,mbutton3,mbutton4,mbutton5,mbutton6,mbutton7,mbutton8,mbutton9,mbutton10,mbutton11,mbutton12;
    EditText EditText_1,EditText_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        mbutton1 = findViewById(R.id.button1);
        mbutton2 = findViewById(R.id.button2);
        mbutton3 = findViewById(R.id.button3);
        mbutton4 = findViewById(R.id.button4);
        mbutton5 = findViewById(R.id.button5);
        mbutton6 = findViewById(R.id.button6);
        mbutton7 = findViewById(R.id.button7);
        mbutton8 = findViewById(R.id.b8);
        mbutton9 = findViewById(R.id.button9);
        mbutton10 = findViewById(R.id.button10);
        mbutton11 = findViewById(R.id.button11);
        mbutton12 = findViewById(R.id.button12);


        EditText_1 = findViewById(R.id.editText_n1);
        EditText_2 = findViewById(R.id.editText_n2);

        mbutton1.setOnClickListener(this);
        mbutton2.setOnClickListener(this);
        mbutton3.setOnClickListener(this);
        mbutton4.setOnClickListener(this);
        mbutton5.setOnClickListener(this);
        mbutton6.setOnClickListener(this);
        mbutton7.setOnClickListener(this);
        mbutton8.setOnClickListener(this);
        mbutton9.setOnClickListener(this);
        mbutton10.setOnClickListener(this);
        mbutton11.setOnClickListener(this);
        mbutton12.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        int n1 = Integer.parseInt(EditText_1.getText().toString());
        int n2 = Integer.parseInt(EditText_2.getText().toString());

        int n3 = 0;

        if(view == mbutton1){
            n3=n1+n2;
        }
        else if(view == mbutton2){
            n3=n1-n2;
        }

        else if(view == mbutton3){
            n3=n1*n2;
        }

        else if(view == mbutton4){
            n3=n1/n2;
        }

        else if(view == mbutton5){
            n3=n1%n2;
        }

        else if(view == mbutton6){
            n3= (int)Math.asin(n1);
        }

        else if(view == mbutton7){
            n3= (int)Math.acos(n1);
        }

        else if(view == mbutton8){
            n3= (int)Math.atan(n1);
        }

        else if(view == mbutton9){
            n3= (int) Math.pow(n1,n2);
        }
        else if(view == mbutton10){
            n3=(int) Math.log(n1);
        }

        else if(view == mbutton11){
            n3=(n1+n2)/2;
        }

        else if(view == mbutton12){
            if(n1>n2){
                n3=n1;
            }
            else
                n3=n2;
        }

        Toast.makeText(this, "The result = "+n3, Toast.LENGTH_SHORT).show();
    }


}
