package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkActivity extends AppCompatActivity {

    ListView lvdrink;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        lvdrink=findViewById(R.id.lvdrink);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.coca_cola,"Coca Cola");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable._up,"7Up");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.fanta,"Fanta");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.limca,"Limca");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.maaza,"Maaza");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.mirinda,"Mirinda");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.mountain_dew,"Mountain Dew");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.pepsi,"Pepsi");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.sprite,"Sprite");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.thums_up,"Thums Up");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvdrink.setAdapter(adapter);

    }
}