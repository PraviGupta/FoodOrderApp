package com.example.project1301;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FoodAdapter extends ArrayAdapter<FoodData> {
    Context context;
    int resource;
    List<FoodData> objects;
    public FoodAdapter(@NonNull Context context, int resource, @NonNull List<FoodData> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(resource,null,false);
        CircleImageView civ=view.findViewById(R.id.civimg);
        TextView tv=view.findViewById(R.id.tv);
        FoodData foody=objects.get(position);
        civ.setImageResource(foody.img);
        tv.setText(foody.name);

        return view;
    }

    @Override
    public int getCount() {
        return objects.size();
    }
}
