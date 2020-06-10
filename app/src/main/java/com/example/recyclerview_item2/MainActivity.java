package com.example.recyclerview_item2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List< Model > models;
    Model model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        models = new ArrayList<>();
        model = new Model("sushi",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("Ramen",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("TakoYaki",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("TakoYaki",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("TakoYaki",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("TakoYaki",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("TakoYaki",getString(R.string.description_flower_daisy),R.drawable.sushi);
        models.add(model);
        model = new Model("TakoYaki",getString(R.string.description_flower_daisy),R.drawable.sushi);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this, models);
        mRecyclerView.setAdapter(myAdapter);
    }
}
