package com.example.foodorderapp.adapters;

import android.content.Context;
import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.R;
import com.example.foodorderapp.models.MainModel;
import com.example.foodorderapp.models.OrderModel;

import java.util.ArrayList;

/*
       todo : 4 extends order adapter class with RecyclerView.Adapte<OrderAdapter.MyViewHolder>
        */
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.MyViewHolder> {
    /*
    Todo 5 Create Array list and 6) Context
     */
    ArrayList<OrderAdapter> list;
    Context context;
    /*
    TODO 7 create constructor for both
     */

    public OrderAdapter(ArrayList<OrderAdapter> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*
        TODO: 8 Inflate recycler view layout
         */
        View view = LayoutInflater.from(context).inflate(R.layout.sample_orders_activity,parent,false);
        /*
        TODO: 9 Return this view as new object
         */
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        /*
        TODO: 10 bind data with recycler view
         */
        final OrderModel model = list.get(position);
        holder.orderItemImage.setImageResource(model.getImage());
        holder.itemName.setText(model.getOrderName());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.itemPrice.setText(model.getOrderItemPrice());
    }

    @Override
    public int getItemCount() {
         /*
        TODO: 11 set the size for recycler view
         */
        return list.size();
    }

    /*
        TODO : 1 create a view holder class
         */
    public class MyViewHolder extends RecyclerView.ViewHolder{
        /*
        TODo : 2 set objects for all view used in recycler view
         */
        ImageView orderItemImage;
        TextView itemName,itemPrice,orderNumber;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            /*
            TODO : 3 find all view
             */
            orderItemImage = itemView.findViewById(R.id.order_image_view);
            itemName = itemView.findViewById(R.id.orderItemName);
            itemPrice = itemView.findViewById(R.id.orderItemPrice);
            orderNumber = itemView.findViewById(R.id.txtOrderNumber);
        }

    }

}
