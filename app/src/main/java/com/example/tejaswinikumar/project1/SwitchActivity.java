package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
  Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        s.findViewById(R.id.switch1);
        s.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(compoundButton.isChecked()){
            Toast.makeText(this,"The button is ON",Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this,"The button is OFF",Toast.LENGTH_SHORT).show();
    }
}
