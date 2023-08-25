package com.example.project1301;

public class FoodData {
    int img;
    String name;

    public FoodData(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public FoodData() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

