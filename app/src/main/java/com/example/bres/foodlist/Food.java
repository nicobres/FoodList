package com.example.bres.foodlist;

public class Food {
    String name;
    int price;
    int imageRes;
    String description;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int price, int image, String description) {
        this.name = name;
        this.price = price;
        this.imageRes = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
