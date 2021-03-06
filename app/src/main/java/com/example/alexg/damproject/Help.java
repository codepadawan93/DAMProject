package com.example.alexg.damproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        String[] help = {"Rule Book", "Learn how to play", "Support", "Terms of Use", "Privacy Policy"};
        ListAdapter helpAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, help);
        ListView listviewHelp = (ListView) findViewById(R.id.listviewHelp);
        listviewHelp.setAdapter(helpAdapter);
    }
}
