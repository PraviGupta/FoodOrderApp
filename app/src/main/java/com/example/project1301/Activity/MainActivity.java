package com.example.project1301.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.project1301.Adapter.FoodListAdapter;
import com.example.project1301.BurgerActivity;
import com.example.project1301.ChickenActivity;
import com.example.project1301.Domain.FoodDomain;
import com.example.project1301.DrinkActivity;
import com.example.project1301.HotdogActivity;
import com.example.project1301.MeatActivity;
import com.example.project1301.MoreActivity;
import com.example.project1301.PizzaActivity;
import com.example.project1301.R;
import com.example.project1301.SettingActivity;
import com.example.project1301.SupportActivity;
import com.example.project1301.SushiActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterFoodList;
    private RecyclerView recyclerViewFood;
    TextView support,viewall,order,set;
    ImageView more,set1,ivpizza,ivburger,ivchicken,ivhotdog,ivsushi,ivmeat,ivdrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        more=findViewById(R.id.imageViewmore);
        support=findViewById(R.id.textViewsupport);
        viewall=findViewById(R.id.viewall);
        order=findViewById(R.id.order1);
        set=findViewById(R.id.settings_tv);
        set1=findViewById(R.id.settings_iv);
        ivpizza=findViewById(R.id.imageViewpizza);
        ivburger=findViewById(R.id.imageViewburger);
        ivchicken=findViewById(R.id.imageViewchicken);
        ivhotdog=findViewById(R.id.imageViewhotdog);
        ivmeat=findViewById(R.id.imageViewmeat);
        ivsushi=findViewById(R.id.imageViewsushi);
        ivdrink=findViewById(R.id.imageViewdrink);


        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SupportActivity.class);
                startActivity(intent);
            }
        });
         more.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(MainActivity.this, MoreActivity.class);
                 startActivity(intent);
             }
         });
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MoreActivity.class);
                startActivity(intent);
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
        ivpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PizzaActivity.class);
                startActivity(intent);
            }
        });
        ivburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, BurgerActivity.class);
                startActivity(intent);
            }
        });
        ivchicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ChickenActivity.class);
                startActivity(intent);
            }
        });
        ivhotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, HotdogActivity.class);
                startActivity(intent);
            }
        });
        ivsushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SushiActivity.class);
                startActivity(intent);
            }
        });
        ivmeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, MeatActivity.class);
                startActivity(intent);
            }
        });
        ivdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, DrinkActivity.class);
                startActivity(intent);
            }
        });



        initRecyclerview();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);
        LinearLayout supBtn=findViewById(R.id.supbtn);

        homeBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        supBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,SupportActivity.class)));
        cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList<FoodDomain> items=new ArrayList<>();
        items.add(new FoodDomain("Cheese Burger","Satisfy your cravings with our juicy Cheese Burger. \n" +
                "Made with 100% Angus beef patty and topped with\n" +
                " melted cheddar cheese, fresh lettuce, tomato, and\n" +
                " our secret sauce, this classic burger will leave you\n" +
                " wanting more. Served with crispy fries and a drink,\n" +
                " it's the perfect meal for any occasion.","fast_1",60,20,120,4));
        items.add(new FoodDomain("Pizza Peperoni","Get a taste of Italy with our delicious Pepperoni Pizza. Made with freshly rolled dough, zesty tomato sauce, mozzarella cheese, and topped with spicy pepperoni slices, this pizza is sure to be a crowd-pleaser. Perfectly baked in a wood-fired oven, it's the perfect choice for a quick lunch or a family dinner."
                ,"fast_2",219,25,200,5));
        items.add(new FoodDomain("Vegetable Pizza","Looking for a healthier option? Try our Vegetable Pizza, made with a variety of fresh veggies such as bell peppers, onions, mushrooms, olives, and tomatoes. Topped with mozzarella cheese and a tangy tomato sauce, this pizza is full of flavor and goodness. Perfect for vegetarians and anyone who wants to add more greens to their diet."
                ,"fast_3",199,30,100,4.5));
        items.add(new FoodDomain("Lays Chips","Looking for a healthier option? Try our Vegetable Pizza, made with a variety of fresh veggies such as bell peppers, onions, mushrooms, olives, and tomatoes. Topped with mozzarella cheese and a tangy tomato sauce, this pizza is full of flavor and goodness. Perfect for vegetarians and anyone who wants to add more greens to their diet."
                ,"@drawable/vegthali.png",20,20,80,4.5));


        recyclerViewFood=findViewById(R.id.view1);
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterFoodList=new FoodListAdapter(items);
        recyclerViewFood.setAdapter(adapterFoodList);
    }
}