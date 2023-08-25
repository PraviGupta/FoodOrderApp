package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BurgerActivity extends AppCompatActivity {

    ListView lvburger;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        lvburger=findViewById(R.id.lvburger);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.beanburger,"Bean Burger");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.beyondmeatburger,"Beyond Meat Burger");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.cheeseburger,"Cheese Burger");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.elkburger,"Elk Burger");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.hamburger,"Ham Burger");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.turkeyburger,"Turkey Burger ");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.veggieburger,"Veggie Burger");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.wildsalmonburger,"Wild Salmon Burger");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.burgercombo,"Combo Burger");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.img_2,"Shaan-e-Burger");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvburger.setAdapter(adapter);

    }
}