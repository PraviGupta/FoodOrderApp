package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MeatActivity extends AppCompatActivity {

    ListView lvmeat;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);
        lvmeat=findViewById(R.id.lvmeat);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.bihari_kebab,"Bihari Kebab");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.kalops,"Kalops");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.kulwa,"Kulwa");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.pique_macho,"Pique Macho");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.semur_daging,"Semur Daging");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.spiced_beef,"Spiced Beef");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.steak_kidney_pudding,"Steak Kidney Pudding");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.straccetti,"Stracetti");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.suea_rong_hai,"Suea Rong Hai");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.swiss_steak,"Swiss Steak");
        food.add(f10);
        FoodAdapter adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lvmeat.setAdapter(adapter);

    }
}