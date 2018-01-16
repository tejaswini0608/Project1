package com.example.tejaswinikumar.project1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class Homework1Activity extends AppCompatActivity {

    Switch mSwitch;
    TextView mTextView;
    SensorManager mSensorManager;
    Sensor mSensor;
    SensorEventListener mSensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);

        mSwitch=(Switch) findViewById(R.id.switch_sensor);
        mTextView=findViewById(R.id.textView_sensor);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mSensorEventListener = new MySensorEventListener();

        mSensor = mSensorManager.getDefaultSensor(SensorManager.SENSOR_ACCELEROMETER);

        mSensorManager.registerListener(mSensorEventListener,mSensor,10);


    }
    class MySensorEventListener implements SensorEventListener{


        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {

        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    }


    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {




        }
    }

}
