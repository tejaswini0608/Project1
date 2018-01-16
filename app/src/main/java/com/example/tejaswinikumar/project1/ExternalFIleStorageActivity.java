package com.example.tejaswinikumar.project1;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tejaswinikumar on 04/01/18.
 */

public class ExternalFIleStorageActivity extends AppCompatActivity {
    Button mButton_save,mButton_view;
    EditText mEditText_filename,mEditText_filecontents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_storage);
        mButton_save=findViewById(R.id.button_save);
        mButton_view=findViewById(R.id.button_view);
        mEditText_filecontents=findViewById(R.id.editText_filecontents);
        mEditText_filename=findViewById(R.id.editText_filename);

        mButton_view.setOnClickListener(viewCLickOnClickListener);
        mButton_save.setOnClickListener(saveClickListener);
        checkPermission();
    }

    private boolean checkPermission(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1000);
            return false;
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]!=PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Cannot Access the application without permission", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    View.OnClickListener saveClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String filename = Environment.getExternalStorageDirectory()+"/"+mEditText_filename.getText().toString();
            String data = mEditText_filecontents.getText().toString();
            String message = "Unable to Save";


            try {
                FileOutputStream fos = new FileOutputStream(filename);
                fos.write(data.getBytes());
                fos.close();
                message = "File Saved...";
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                mEditText_filecontents.setText("");
                mEditText_filename.setText("");
                Toast.makeText(ExternalFIleStorageActivity.this, message, Toast.LENGTH_SHORT).show();
            }

        }
    };

    View.OnClickListener viewCLickOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String filename = Environment.getExternalStorageDirectory()+"/"+mEditText_filename.getText().toString();
            String data = "";
            String lineData = "";
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
                while((lineData=bufferedReader.readLine())!=null)
                {
                    data+=lineData;
                }
                bufferedReader.close();
                Toast.makeText(ExternalFIleStorageActivity.this, data, Toast.LENGTH_SHORT).show();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(ExternalFIleStorageActivity.this, "Invalid Filename", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(ExternalFIleStorageActivity.this, "Unable Read Data", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
