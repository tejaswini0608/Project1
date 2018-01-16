package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScientificCalci2Activity extends AppCompatActivity implements View.OnClickListener{
    Button mbutton1,mbutton2,mbutton3,mbutton4,mbutton5,mbutton6,mbutton7,mbutton8,mbutton9,mbutton10,mbutton11,mbutton12,mbutton13,mbutton14,mbutton15,mbutton16;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calci2);

        mbutton1 = findViewById(R.id.b1);
        mbutton2 = findViewById(R.id.b2);
        mbutton3 = findViewById(R.id.b3);
        mbutton4 = findViewById(R.id.b4);
        mbutton5 = findViewById(R.id.b5);
        mbutton6 = findViewById(R.id.b6);
        mbutton7 = findViewById(R.id.b7);
        mbutton8 = findViewById(R.id.b8);
        mbutton9 = findViewById(R.id.b9);
        mbutton10 = findViewById(R.id.b0);
        mbutton11 = findViewById(R.id.b_);
        mbutton12 = findViewById(R.id.b_eql);
        mbutton13 = findViewById(R.id.b_div);
        mbutton14 = findViewById(R.id.b_mul);
        mbutton15 = findViewById(R.id.b_sub);
        mbutton16 = findViewById(R.id.b_add);

        textview=findViewById(R.id.textView_enter);

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
        mbutton13.setOnClickListener(this);
        mbutton14.setOnClickListener(this);
        mbutton15.setOnClickListener(this);
        mbutton16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      String n;

        if(view == mbutton1){
            textview.append("1");
        }
        else if(view == mbutton2){
            textview.append("2");
        }

        else if(view == mbutton3){
            textview.append("3");
        }

        else if(view == mbutton4){
            textview.append("4");
        }

        else if(view == mbutton5){
            textview.append("5");
        }

        else if(view == mbutton6){
            textview.append("6");
        }

        else if(view == mbutton7){
            textview.append("7");
        }

        else if(view == mbutton8){
            textview.append("8");
        }

        else if(view == mbutton9){
            textview.append("9");
        }
        else if(view == mbutton10){
            textview.append("0");
        }

        else if(view == mbutton11){
            textview.append(".");

        }

        else if(view == mbutton12){
            textview.append("=");

        }
        else if(view == mbutton13){
            textview.append(" \\ ");

        }
        else if(view == mbutton14){
            textview.append(" * ");

        }
        else if(view == mbutton15){
            textview.append(" - ");

        }
        else if(view == mbutton16){
            n="textview.getText()"+"";
            textview.clearComposingText();

        }

    }
}
