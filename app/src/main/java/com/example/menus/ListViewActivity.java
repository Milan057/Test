package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView itemsLV= findViewById(R.id.itemsLV);

        String names[]={"Milan","Diksha","Sanjipu","Dhiraj"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_view_item,R.id.listText,names);
        itemsLV.setAdapter(adapter);

    }
}