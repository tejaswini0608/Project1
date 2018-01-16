package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButton_Internet_Activity extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup mRadioGroup;
    private RadioButton r_button;
    private Button clear,submit;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button__internet_);
        mRadioGroup = (RadioGroup) findViewById(R.id.radiogp);
        clear=findViewById(R.id.clear);
        submit=findViewById(R.id.button_submit);
        mTextView=findViewById(R.id.textView);


        clear.setOnClickListener(this);
        submit.setOnClickListener(this);



    }
    public void onClick(View v) {
        if (v == clear)
            mRadioGroup.clearCheck();

        else {
            int selectedId = mRadioGroup.getCheckedRadioButtonId();
            // find the radiobutton by returned id
            r_button = findViewById(selectedId);

            Toast.makeText(this, r_button.getText(), Toast.LENGTH_SHORT).show();

        }


}}
