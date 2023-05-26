package com.house.ar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

//    RecyclerView recyclerView;
//    ModelAdapter modelAdapter;
//    List<Item> items = new ArrayList<>();


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        bnvText();



//        recyclerView = findViewById(R.id.recyclerView);
//
//        items.add(new Item(R.drawable.small_home, "small_home.glb", "SMALL HOME"));
//        items.add(new Item(R.drawable.medium_home, "medium_home.glb", "MEDIUM HOME"));
//        items.add(new Item(R.drawable.large_home, "large_home.glb", "LARGE HOME"));
//        items.add(new Item(R.drawable.penthouse, "penthouse.glb", "PENTHOUSE"));
//        items.add(new Item(R.drawable.sofa, "sofa.glb", "SOFA"));
//        items.add(new Item(R.drawable.chair, "chair.glb", "CHAIR"));
//        items.add(new Item(R.drawable.sofa2, "sofa2.glb", "Modren SOFA"));
//        items.add((new Item(R.drawable.modrenchair, "modern.glb", "Modren CHAIR")));



//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        modelAdapter =new ModelAdapter((ArrayList<Item>) items,HomeActivity.this);
//        recyclerView.setAdapter(modelAdapter);
    }




    public void loadFragment(Fragment fragment,boolean flag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(flag){
        fragmentTransaction.add(R.id.frameLayout,fragment);
       }
        else{
            fragmentTransaction.replace(R.id.frameLayout,fragment);
        }
        fragmentTransaction.commit();
    }

    public void bnvText(){
        bottomNavigationView = findViewById(R.id.bnview);
        bottomNavigationView.setOnApplyWindowInsetsListener(null);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.nav_home){
                    loadFragment(new homeScreen(),false);
                }
                else if(id == R.id.nav_categories){
                    loadFragment(new homeScreen(),false);
                }
                else if(id == R.id.nav_cart){
                    loadFragment(new Cart_screen(),false);
                }
                else if(id == R.id.nav_account){
                    loadFragment(new Profile_screen(),false);
                }

                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }

}