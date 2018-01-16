package com.example.tejaswinikumar.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomListActivity extends AppCompatActivity {
    ListView mListView;
    String names[]={"bruce","job","nrn","pc","quote"};
    int ids[] = {R.drawable.bruce,R.drawable.job,R.drawable.nrn,R.drawable.pc,R.drawable.quote};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        mListView = findViewById(R.id.listView_contacts);

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        for(int i=0;i<names.length;i++){
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("name",names[i]);
            hashMap.put("image",ids[i]+"");

            arrayList.add(hashMap);
        }

        String keys[] = {"name","image"};
        int id[] = {R.id.textView_contact,R.id.imageView_contact};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.template_contact,keys,id);
        mListView.setAdapter(simpleAdapter);
    }
}
