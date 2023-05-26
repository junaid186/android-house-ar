package com.house.ar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>{


    ArrayList<CartItem> cartItems; ;
    Context context;
    Fragment activity;

    CartAdapter(ArrayList<CartItem> cartItems, Fragment activity) {
        this.cartItems=cartItems;
        this.activity = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_of_cart,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titleCart.setText(cartItems.get(position).getTitle());
        holder.priceCart.setText(cartItems.get(position).getPrice()+"");
        holder.imageCart.setImageResource(cartItems.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleCart;
        TextView priceCart;

        ImageView imageCart;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleCart = itemView.findViewById(R.id.item_title);
            priceCart = itemView.findViewById(R.id.item_price);
            imageCart = itemView.findViewById(R.id.item_image);
        }
    }
}
