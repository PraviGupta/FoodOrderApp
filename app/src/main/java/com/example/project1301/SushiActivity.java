package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SushiActivity extends AppCompatActivity {

    ListView lvsushi;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi);
        lvsushi=findViewById(R.id.lvsushi);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.california_sushi,"California Sushi");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.futomaki_sushi,"Futomaki Sushi");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.inarizushi,"Inarizushi");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.nigirizushi,"Nigirizusi");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.philly_roll,"Philly Roll");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.rainbow_roll,"Rainbow Roll");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.sashimi,"Sashimi");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.shrimp_tempura_roll,"Shrimp Tempura Roll");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.spicy_tuna_roll,"Spicy Tuna Roll ");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.spider_roll,"Spider Roll");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvsushi.setAdapter(adapter);

    }
}