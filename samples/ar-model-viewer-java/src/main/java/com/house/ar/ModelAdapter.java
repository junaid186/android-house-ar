package com.house.ar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.MyViewHolder>{

    ArrayList<Item> itemList ;
    Context context;
    Fragment activity;

    public ModelAdapter(ArrayList<Item> itemList, Fragment activity) {
        this.itemList=itemList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.receyclerview_item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.modelImage.setImageResource(itemList.get(position).getImage());
        holder.titleTV.setText(itemList.get(position).getTitle());




        holder.modelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(activity.getActivity(), detail_activity.class);
               intent.putExtra("name", itemList.get(position).getName());
                intent.putExtra("title", itemList.get(position).getTitle());
                intent.putExtra(("image"), itemList.get(position).getImage());
                intent.putExtra("price", itemList.get(position).getPrice());
                intent.putExtra("description", itemList.get(position).getDescription());
                activity.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        ImageView modelImage;
        TextView titleTV;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.modelImage =itemView.findViewById(R.id.model_image);
            this.titleTV =itemView.findViewById(R.id.titleTV);

        }
    }
}