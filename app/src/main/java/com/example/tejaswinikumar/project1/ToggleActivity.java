package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity implements View.OnClickListener {
    ToggleButton t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        t=findViewById(R.id.toggleButton);

        t.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

     boolean on =((ToggleButton)view).isChecked();
     if(on){

         Toast.makeText(this,"The button is ON",Toast.LENGTH_SHORT).show();
     }
     else
         Toast.makeText(this,"The button is OFF",Toast.LENGTH_SHORT).show();


    }
}
