package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {
 ListView lvpizza;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        lvpizza=findViewById(R.id.lvpizza);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.chickenpizza,"Chicken Pizza");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.californiastylepizza,"California Style Pizza");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.chicagostylepizza,"Chicago Style Pizza");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.detroitstylepizza,"Detroit Style Pizza");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.greekstylepizza,"Greek Style Pizza");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.louisstylepizza,"St.Louis Style Pizza");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.neapolitanpizza,"Neapolitan Pizza");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.newyorkstylepizza,"New York Style Pizza");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.silicanstylepizza,"Silican Style Pizza");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.fast_3,"Veggie Pizza");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvpizza.setAdapter(adapter);

    }
}