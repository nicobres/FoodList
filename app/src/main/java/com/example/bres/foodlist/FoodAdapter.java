package com.example.bres.foodlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private List<Food> mFoodList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView label;
        public TextView price;
        public ImageView imageView;

        public ViewHolder(LinearLayout v) {
            super(v);
            label = (TextView) itemView.findViewById(R.id.food_item_label);
            price = (TextView) itemView.findViewById(R.id.food_item_price);
            imageView = (ImageView) itemView.findViewById(R.id.food_item_thumbnail);
        }
    }

    public FoodAdapter(List<Food> foodList) {
        mFoodList = foodList;
    }

    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_item_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Food food = mFoodList.get(position);
        holder.label.setText(food.getName());
        holder.price.setText(String.valueOf(food.getPrice()) + " €");
        holder.imageView.setImageResource(food.getImageRes());
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }
}
