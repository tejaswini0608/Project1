package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.item_call){
            Toast.makeText(this, "Call Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_sms){
            Toast.makeText(this, "SMS Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_delete){
            Toast.makeText(this, "Delete Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_edit){
            Toast.makeText(this, "Edit Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_send){
            Toast.makeText(this, "Send Menu Selected", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
