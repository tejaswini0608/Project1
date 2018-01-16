package com.example.tejaswinikumar.project1;

import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by tejaswinikumar on 31/12/17.
 */

public class ContextMenu extends AppCompatActivity {
    ImageView mImageView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        mImageView = findViewById(R.id.imageView_img);
        registerForContextMenu(mImageView);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.activity_main,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.item_call){
            Toast.makeText(ContextMenu.this, "Call Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_sms){
            Toast.makeText(ContextMenu.this, "SMS Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_delete){
            Toast.makeText(ContextMenu.this, "Delete Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_edit){
            Toast.makeText(ContextMenu.this, "Edit Menu Selected", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item_send){
            Toast.makeText(ContextMenu.this, "Send Menu Selected", Toast.LENGTH_SHORT).show();
        }
        return true;


    }
}
