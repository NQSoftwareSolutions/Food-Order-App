package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.adapters.MainAdapter;
import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.example.foodorderapp.models.MainModel;

import java.util.ArrayList;
import java.util.MissingFormatArgumentException;

public class MainActivity extends AppCompatActivity {
    /*
    TODO: 3.1 create var for main activity binding  by ViewBinding
     */
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        TODO: 3.2 Inflate layout by ViewBinding
         */
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        /*
        Todo: 3.3 Set parent layout as root by viewBinding
         */
        setContentView(activityMainBinding.getRoot());

        /*
        TODO: 3.4 Add data in Recycler view
         */
        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.breakfast, "Breakfast", "5", "This is very cool and efficient breakfast."));
        list.add(new MainModel(R.drawable.burder, "Burger", "8", "This is a chicken burger"));
        list.add(new MainModel(R.drawable.burger2, "Chicken Burger", "10", "This is package with burger"));
        list.add(new MainModel(R.drawable.chicken, "Chicken", "23", "This is testy chicken"));
        list.add(new MainModel(R.drawable.chickenkabab,"Chicken Kabab","250","This is chicken kabab"));

        /*
        TODO : 3.5 Set Adapter for recycler view
         */
        MainAdapter mainAdapter = new MainAdapter(list, this);
        /*
        TODO: 3.6 Set adapter with recycler view
         */
        activityMainBinding.recyclerView.setAdapter(mainAdapter);
        /*
        TODO: 3.7 set layout manager for recycler view
         */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        /*
        Todo : 3.8 Set layout with recycler view
         */
        activityMainBinding.recyclerView.setLayoutManager(linearLayoutManager);
    }
}
/*
Todo: Steps to use recycler view
step#1: get recycler view inside linear layout..
step#2: set your custom UI  recycler view..
step#3: set model for recycler view..(See MainModel class)
step#$: create adapter for recycler view(see MainAdapter class )
 */