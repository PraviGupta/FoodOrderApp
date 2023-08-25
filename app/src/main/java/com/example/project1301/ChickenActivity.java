package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChickenActivity extends AppCompatActivity {

    ListView lvchicken;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        lvchicken=findViewById(R.id.lvchicken);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.chicken_fingers,"Chicken Fingers");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.chickenbriyani,"Chicken Biryani");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.butter_chicken,"Butter Chicken");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.chillie_chicken,"Chilli Chicken");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.chicken_tikka,"Chicken Tikka");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.chicken_nuggets,"Chicken Nugget");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.tandoori_chicken,"Tandoori Chicken");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.chicken_65,"Chicken 65");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.chicken_parmigiana,"Chicken Parmigiana");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.chicken_lollipop,"Chicken Lollipop");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvchicken.setAdapter(adapter);

    }
}