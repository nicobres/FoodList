package com.example.bres.foodlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class FoodListActivity extends AppCompatActivity implements FoodListView {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private FoodListPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        mPresenter = new FoodListPresenter(this);
        mPresenter.onViewCreated();
    }



    @Override
    public void showContent(List<Food> data) {
        mRecyclerView = (RecyclerView) findViewById(R.id.activity_food_list_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mAdapter = new FoodAdapter(data);
        mRecyclerView.setAdapter(mAdapter);
    }
}
