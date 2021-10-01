package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.adapters.MainAdapter;
import com.example.foodorderapp.adapters.OrderAdapter;
import com.example.foodorderapp.databinding.ActivityMainBinding;
import com.example.foodorderapp.databinding.ActivityOrderBinding;
import com.example.foodorderapp.models.MainModel;
import com.example.foodorderapp.models.OrderModel;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    /*
    TODO: 3.1 create var for main activity binding  by ViewBinding
     */
    ActivityOrderBinding activityOrderBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        TODO: Inflate layout by ViewBinding
         */
        activityOrderBinding = ActivityOrderBinding.inflate(getLayoutInflater());
        /*
        Todo: Set parent layout as root by viewBinding
         */
        setContentView(activityOrderBinding.getRoot());
         /*
        TODO: 3.4 Add data in Recycler view
         */
        ArrayList<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel(R.drawable.breakfast, "Breakfast", "52423423", "6"));
        list.add(new OrderModel(R.drawable.burder, "Burger", "824234", "8"));
        list.add(new OrderModel(R.drawable.burger2, "Chicken Burger", "1024234", "3"));
        list.add(new OrderModel(R.drawable.chicken, "Chicken", "2334345", "23"));
        list.add(new OrderModel(R.drawable.chickenkabab,"Chicken Kabab","25234230","45"));

        /*
        TODO : 3.5 Set Adapter for recycler view
         */
        OrderAdapter orderAdapter = new MainAdapter(list, this);
        /*
        TODO: 3.6 Set adapter with recycler view
         */
        activityOrderBinding.orderRecyclerView.setAdapter(orderAdapter);
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