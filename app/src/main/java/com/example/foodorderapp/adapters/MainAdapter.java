package com.example.foodorderapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.models.MainModel;

import java.util.ArrayList;

/*
    TODO:  2.4 Extend adapter class with RecyclerView.Adapter.MyViewHolder
     */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {
    /*
    TODO: 2.5 Create a array list
     */
    ArrayList<MainModel> list;
    /*
    TODO: 2.6  Create context;
     */
    Context context;
    /*
    ToDO: 2.7 Create constructors for both list and context
     */

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*
        TODO: 2.8 Inflate recycler view layout
         */
        View view = LayoutInflater.from(context).inflate(R.layout.sample_main_food,parent,false);
        /*
        TODO: 2.9 Return this view as new object
         */
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        /*
        TODO: 2.10 bind data with recycler view
         */
        final MainModel model = list.get(position);
        holder.foodImage.setImageResource(model.getImage());
        holder.itemName.setText(model.getName());
        holder.itemPrice.setText(model.getPrice());
        holder.itemDescription.setText(model.getDetail());
    }

    @Override
    public int getItemCount() {
        /*
        TODO: 2.11 set the size for recycler view
         */
        return list.size();
    }

    /*
        TODO: 2.1 Create view holder class for set view for recycler view and crate its constructor
         */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        /*
        TODO: 2.2 get all views which we will use in recycler view
         */
        ImageView foodImage;
        TextView itemName,itemPrice,itemDescription;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            /*
            TODO: 2.3 get all views by id
             */
            foodImage = itemView.findViewById(R.id.imageView);
            itemName = itemView.findViewById(R.id.txtName);
            itemPrice = itemView.findViewById(R.id.txtPrice);
            itemDescription = itemView.findViewById(R.id.txtDetail);
        }
    }
}
