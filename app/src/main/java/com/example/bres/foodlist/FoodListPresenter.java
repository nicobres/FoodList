package com.example.bres.foodlist;


import java.util.ArrayList;

public class FoodListPresenter {
    FoodListView mView;

    public FoodListPresenter(FoodListView view) {
        mView = view;
    }

    public void onViewCreated() {

        mView.showContent(getDataLocal());
    }

    //TODO move to FoodStore
    private ArrayList<Food> getDataLocal() {
        ArrayList<Food> foodArrayList = new ArrayList<>();
        foodArrayList.add(new Food("chicken", 3, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("lamb", 2, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("beef", 4, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("potatoes", 5, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("salad", 22, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("tomatoes", 34, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("beans", 321, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("apple", 1, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("grape", 9, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("banana", 8, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("carrot", 85, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("chicken", 3, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("lamb", 2, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("beef", 4, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("potatoes", 5, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("salad", 22, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("tomatoes", 34, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("beans", 321, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("apple", 1, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("grape", 9, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("banana", 8, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));
        foodArrayList.add(new Food("carrot", 85, R.drawable.chicken, "blalblala blalblala blalblala blalblala blalblala blalblala "));

        return foodArrayList;
    }
}
