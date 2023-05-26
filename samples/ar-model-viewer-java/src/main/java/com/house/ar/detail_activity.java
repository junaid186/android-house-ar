package com.house.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_activity extends AppCompatActivity {


    TextView name;
    String modelName = "";
    String title = "";
    ImageView detailImageView;
    int image;

    double price;
    String description;
    ImageView backBtn;
    ImageButton button3d;
    TextView desc;
    TextView priceSet;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


       // name = findViewById(R.id.nameid);
        detailImageView = findViewById(R.id.detailImage);
        priceSet = findViewById(R.id.priceID);


        button3d = findViewById(R.id.button3d);
        button3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detail_activity.this, MainActivity.class);
                intent.putExtra("name", modelName);
                startActivity(intent);
            }
        });


        desc = findViewById(R.id.descID);


        modelName = getIntent().getStringExtra("name");
        title = getIntent().getStringExtra("title");
        image = getIntent().getIntExtra("image",0);
        description = getIntent().getStringExtra("description");
        price = getIntent().getDoubleExtra("price",0);

        detailImageView.setImageResource(image);
        priceSet.setText(price + " $");
        desc.setText(description);



       // name.setText(price + " " + title + " " + description);
    }
}