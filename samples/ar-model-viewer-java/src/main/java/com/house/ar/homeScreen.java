package com.house.ar;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class homeScreen extends Fragment {


    RecyclerView recyclerView;
    ModelAdapter modelAdapter;
    List<Item> items = new ArrayList<>();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


       View view = inflater.inflate(R.layout.fragment_home_screen, container, false);
        recyclerView = view.findViewById(R.id.recyclerviewid);

        items.add(new Item(R.drawable.small_home, "small_home.glb", "SMALL HOME",2323.3,"3 BHK,2 Bathrooms,2 Balconies"));
        items.add(new Item(R.drawable.medium_home, "medium_home.glb", "MEDIUM HOME",1923.3,"2 BHK, 1 Bathrooms,2 Balconies"));
        items.add(new Item(R.drawable.large_home, "large_home.glb", "LARGE HOME", 3323.3,"4 BHK , 3 Bathrooms , 2 Balconies"));
        items.add(new Item(R.drawable.penthouse, "penthouse.glb", "PENTHOUSE", 4423.3,"5 BHK , 4 Bathrooms , 2 Balconies"));
        items.add(new Item(R.drawable.sofa, "sofa.glb", "SOFA",399,"its mix frame sofa with 2 seater and 3 seater with 2 pillows the" +
                "dimensions are 6.5 feet length and 3 feet width and 3 feet height"));
        items.add(new Item(R.drawable.chair, "chair.glb", "CHAIR", 299,"its mix frame chair with with 1 pillows the" +
                "dimensions are 6.5 feet length and 3 feet width and 3 feet height"));
        items.add(new Item(R.drawable.sofa2, "sofa2.glb", "Modren SOFA", 399,"its mix frame sofa with 2 seater and 3 seater with 2 pillows the" +
                "dimensions are 6.5 feet length and 3 feet width and 3 feet height"));
        items.add((new Item(R.drawable.modrenchair, "modern.glb", "Modren CHAIR" , 299,"its mix frame chair with with 1 pillows the" +
                "dimensions are 6.5 feet length and 3 feet width and 3 feet height")));


        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        modelAdapter =new ModelAdapter((ArrayList<Item>) items,homeScreen.this);
        recyclerView.setAdapter(modelAdapter);


        return view;
    }
}