package com.house.ar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Cart_screen extends Fragment {


    RecyclerView recyclerViewcart;
     CartAdapter cartAdapter;
    List<CartItem> CartItems = new ArrayList<>();




    public Cart_screen() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart_screen, container, false);
        recyclerViewcart = view.findViewById(R.id.cartrecyclerviewID);
        CartItems.add(new CartItem("sofa", 399,R.drawable.sofa));
        CartItems.add(new CartItem("chair", 299, R.drawable.chair));
        CartItems.add(new CartItem("sofa2", 399, R.drawable.sofa2));
        CartItems.add(new CartItem("modrenchair", 299, R.drawable.modrenchair));
        CartItems.add(new CartItem("small_home", 2323, R.drawable.small_home));
        CartItems.add(new CartItem("medium_home", 1923, R.drawable.medium_home));
        CartItems.add(new CartItem("large_home", 3323, R.drawable.large_home));
        CartItems.add(new CartItem("penthouse", 4423, R.drawable.penthouse));




        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());

        recyclerViewcart.setLayoutManager(linearLayoutManager);
        cartAdapter =new CartAdapter((ArrayList<CartItem>) CartItems,Cart_screen.this);
        recyclerViewcart.setAdapter(cartAdapter);

        return view;
    }
}