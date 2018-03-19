package com.example.chirikualii.listwithdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.chirikualii.listwithdb.Model.Dictionary;
import com.example.chirikualii.listwithdb.database.DatabaseAccess;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Dictionary> titles = new ArrayList<>();

    DictionaryAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding
        recyclerView = findViewById(R.id.list_item);


        loadData();

        //instance layoutmanager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        //set layoutmanager
        recyclerView.setLayoutManager(layoutManager);


        //instance adapter
        adapter = new DictionaryAdapter(titles);

        //setAdapter

        recyclerView.setAdapter(adapter);




    }


    void loadData(){

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        titles = databaseAccess.getTitle();
        databaseAccess.close();


    }


}

