package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotdogActivity extends AppCompatActivity {

    ListView lvhotdog;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotdog);
        lvhotdog=findViewById(R.id.lvhotdog);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.chicago_style_dog,"Chicago Style");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.chili_dog,"Chili Dog");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.cincinnati_coney,"Cincinnati Coney");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.corn_dog,"Corn Dog");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.crispy_dog,"Crispy Dog");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.half_smoke,"Half Smoke");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.hot_weiner,"Hot Weiner");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.italian_hot_dog,"Italian Hot Dog");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.mac___cheese_dog,"Mac & Cheese");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.polish_boy,"Polish Boy");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvhotdog.setAdapter(adapter);

    }
}