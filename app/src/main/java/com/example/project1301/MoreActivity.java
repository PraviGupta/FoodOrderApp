package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MoreActivity extends AppCompatActivity {
  ListView lv;

  EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_more);
        lv=findViewById(R.id.lv1);
        et=findViewById(R.id.etsearchhere);
        ArrayList<FoodData> food=new ArrayList<>();
        FoodData f1=new FoodData(R.drawable.thali,"Veg Thali");
        food.add(f1);
        FoodData f2=new FoodData(R.drawable.chickenbriyani,"Chicken Biryani");
        food.add(f2);
        FoodData f3=new FoodData(R.drawable.cookie,"Cookies");
        food.add(f3);
        FoodData f4=new FoodData(R.drawable.lays,"Lays Chips");
        food.add(f4);
        FoodData f5=new FoodData(R.drawable.doracakes,"Doracakes");
        food.add(f5);
        FoodData f6=new FoodData(R.drawable.popcorn,"Popcorn");
        food.add(f6);
        FoodData f7=new FoodData(R.drawable.mocktail,"Magenta Mocktail");
        food.add(f7);
        FoodData f8=new FoodData(R.drawable.spritecan,"Sprite Can");
        food.add(f8);
        FoodData f9=new FoodData(R.drawable.lemondrink,"Lemon Drink");
        food.add(f9);
        FoodData f10=new FoodData(R.drawable.italian_hot_dog,"Hot Dog");
        food.add(f10);
        FoodData f11=new FoodData(R.drawable.cholebhature,"Chole Bhature");
        food.add(f11);
        FoodData f12=new FoodData(R.drawable.ladoo,"Ladoo");
        food.add(f12);
        FoodData f13=new FoodData(R.drawable.burgercombo,"Combo Offer");
        food.add(f13);
        FoodData f14=new FoodData(R.drawable.muttonbriyani,"Mutton Briyani");
        food.add(f14);
        FoodData f15=new FoodData(R.drawable.sandwich,"Sandwich");
        food.add(f15);
        FoodData f16=new FoodData(R.drawable.chickenkawab,"Chicken Kawab");
        food.add(f16);
        FoodData f17=new FoodData(R.drawable.chillichicken,"Chicken Chilli");
        food.add(f17);
        FoodData f18=new FoodData(R.drawable.chickenpizza,"Chicken Pizza");
        food.add(f18);
        FoodData f19=new FoodData(R.drawable.bakedchicken,"Baked Chicken");
        food.add(f19);
        FoodData f20=new FoodData(R.drawable.palakpaneer,"Palak Panner");
        food.add(f20);
        FoodData f21=new FoodData(R.drawable.samosa,"Samosa");
        food.add(f21);
        FoodData f22=new FoodData(R.drawable.manchurianhakkanoodles,"Manchurian Hakka Noodles");
        food.add(f22);
        FoodData f23=new FoodData(R.drawable.vegbriyani,"Veg Biryani");
        food.add(f23);
        FoodData f24=new FoodData(R.drawable.paratha,"Paratha");
        food.add(f24);
        FoodData f25=new FoodData(R.drawable.sahipaneer,"Shahi Panner");
        food.add(f25);
        FoodData f26=new FoodData(R.drawable.browniecake,"Brownie Cake");
        food.add(f26);
        FoodData f27=new FoodData(R.drawable.gulabjamoon,"Gulab Jamun");
        food.add(f27);
        FoodData f28=new FoodData(R.drawable.momos,"Momos");
        food.add(f28);
        FoodData f29=new FoodData(R.drawable.kachuari,"Kachori");
        food.add(f29);
        FoodData f30=new FoodData(R.drawable.idly,"Idli");
        food.add(f30);
        FoodData f31=new FoodData(R.drawable.donuts,"Donuts");
        food.add(f31);
        FoodData f32=new FoodData(R.drawable.frenchfries,"French Fries");
        food.add(f32);
        FoodData f33=new FoodData(R.drawable.nutrientsalads,"Nutrients Salad");
        food.add(f33);
        FoodData f34=new FoodData(R.drawable.icecream,"Icecream");
        food.add(f34);
        FoodData f35=new FoodData(R.drawable.darkchocolate,"Dark Chocolate");
        food.add(f35);
        FoodData f36=new FoodData(R.drawable.pepsican,"Pepsi Can");
        food.add(f36);

       final FoodAdapter  adapter=new FoodAdapter(this,R.layout.fooditemlayout,food);
        lv.setAdapter(adapter);





    }
}