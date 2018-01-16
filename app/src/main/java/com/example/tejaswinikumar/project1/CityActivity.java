package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner mSpinner_city;
    String cities[] = {"Select City","Mysuru","Bengaluru","Mangaluru","Hubli","Dharwad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        mSpinner_city = findViewById(R.id.spinner_city);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cities);
        mSpinner_city.setAdapter(stringArrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i!=0){
            Toast.makeText(this, "Selected City : "+cities[i], Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
