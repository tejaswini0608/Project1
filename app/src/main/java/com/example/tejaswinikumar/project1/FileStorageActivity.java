package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStorageActivity extends AppCompatActivity {
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
    }

    View.OnClickListener saveClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           String filename = mEditText_filename.getText().toString();
           String data = mEditText_filecontents.getText().toString();
           String message = "Unable to Save";

            try {
                FileOutputStream fos = openFileOutput(filename,MODE_PRIVATE);
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
                Toast.makeText(FileStorageActivity.this, message, Toast.LENGTH_SHORT).show();
            }

        }
    };

    View.OnClickListener viewCLickOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String filename = mEditText_filename.getText().toString();
            String data = "";
            String lineData = "";
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput(filename)));
                while((lineData=bufferedReader.readLine())!=null)
                {
                    data+=lineData;
                }
                bufferedReader.close();
                Toast.makeText(FileStorageActivity.this, data, Toast.LENGTH_SHORT).show();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(FileStorageActivity.this, "Invalid Filename", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(FileStorageActivity.this, "Unable Read Data", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
