package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewPractise extends AppCompatActivity {

    String[] country = {"India","Nepal","Srilanka","Bhutan","China"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_practise);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,country);
        ListView lv;
        lv = findViewById(R.id.lv);
        lv.setAdapter(adapter);
    }
}
