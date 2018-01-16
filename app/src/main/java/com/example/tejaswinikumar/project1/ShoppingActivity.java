package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class ShoppingActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox mCheckBox_pen,mCheckBox_book,mCheckBox_bag;
    TextView mTextView_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        mCheckBox_bag = findViewById(R.id.checkBox_bag);
        mCheckBox_book = findViewById(R.id.checkBox_book);
        mCheckBox_pen = findViewById(R.id.checkBox_pen);

        mTextView_total = findViewById(R.id.textView_total);

        mCheckBox_pen.setOnCheckedChangeListener(this);
        mCheckBox_book.setOnCheckedChangeListener(this);
        mCheckBox_bag.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        int total = 0;

        if(mCheckBox_bag.isChecked()){
            total += 1000;
        }
        if(mCheckBox_book.isChecked()){
            total += 1500;
        }
        if(mCheckBox_pen.isChecked()){
            total += 200;
        }

        mTextView_total.setText("TOtal : "+total);
    }
}
