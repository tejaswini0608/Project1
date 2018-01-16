package com.example.tejaswinikumar.project1;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }

    public void onALert(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Custom Alert");
        builder.setMessage("Select one option...");
        builder.setPositiveButton("Yes", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertActivity.this, "Clicked on Yes", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("No", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertActivity.this, "Cicked on No", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}
