package com.example.tejaswinikumar.project1;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LocationActivity extends AppCompatActivity {
    LocationListener mLocationListener = new MyLocationListener();
    LocationManager  mLocationManager;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        mTextView = (TextView) findViewById(R.id.textView_location);
        mLocationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        /*if(mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
            if(checkPermission())
            {
                mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,mLocationListener);
            }
        }*/
        if(mLocationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)){
            if(checkPermission())
            {
                mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,mLocationListener);
            }
        }
    }

    private boolean checkPermission(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},1000);
            return false;
        }
        return true;
    }

    class MyLocationListener implements LocationListener{

        @Override
        public void onLocationChanged(Location location) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            double altitude = location.getAltitude();

            String data = "Latitude : "+latitude
                    +"\nLongitude : "+longitude
                    +"\nAltitude : "+altitude;
            mTextView.setText(data);
            mLocationManager.removeUpdates(mLocationListener);
        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    }
}
