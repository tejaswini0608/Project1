package com.example.tejaswinikumar.project1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SensorActivity extends AppCompatActivity {
    TextView mTextView;
    SensorManager mSensorManager;
    Sensor mSensor;
    SensorEventListener mSensorEventListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        mTextView = findViewById(R.id.textView_sensor);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mSensorEventListener = new MySensorEventListener();

        mSensor = mSensorManager.getDefaultSensor(SensorManager.SENSOR_ACCELEROMETER);

        mSensorManager.registerListener(mSensorEventListener,mSensor,0);
    }

    class MySensorEventListener implements SensorEventListener{

        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            float values[] = sensorEvent.values;
            String data = "X axis : "+values[0]
                    +"\nY axis : "+values[1]
                    +"\nZ axis : "+values[2];
            mTextView.setText("Sensor Values : \n"+data);
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    }
}
