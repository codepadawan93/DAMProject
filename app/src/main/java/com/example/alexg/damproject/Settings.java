package com.example.alexg.damproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        String[] settings = {"Language", "Sound Effects", "In-Game Music", "Edit Profile", "Privacy", "Log Out"};
        ListAdapter settingsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, settings);
        ListView listviewSettings = (ListView) findViewById(R.id.listviewSettings);
        listviewSettings.setAdapter(settingsAdapter);
    }
}
