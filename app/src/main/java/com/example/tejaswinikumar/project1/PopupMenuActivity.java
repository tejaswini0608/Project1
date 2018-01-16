package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        mImageView = findViewById(R.id.imageView_img);
        mImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        PopupMenu popupMenu = new PopupMenu(this,mImageView);
        popupMenu.getMenuInflater().inflate(R.menu.activity_main,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if(id == R.id.item_call){
                    Toast.makeText(PopupMenuActivity.this, "Call Menu Selected", Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.item_sms){
                    Toast.makeText(PopupMenuActivity.this, "SMS Menu Selected", Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.item_delete){
                    Toast.makeText(PopupMenuActivity.this, "Delete Menu Selected", Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.item_edit){
                    Toast.makeText(PopupMenuActivity.this, "Edit Menu Selected", Toast.LENGTH_SHORT).show();
                }
                if(id == R.id.item_send){
                    Toast.makeText(PopupMenuActivity.this, "Send Menu Selected", Toast.LENGTH_SHORT).show();
                }
                return true;


            }
        });
        popupMenu.show();
    }
}
