package com.example.vacashproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GameItemAdapter extends RecyclerView.Adapter<GameItemViewHolder> {

    Context context;
    List<GameItem> items;

    public GameItemAdapter(Context context, List<GameItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public GameItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameItemViewHolder holder, int position) {
        holder.gameName.setText(items.get(position).getName());
        holder.shopName.setText(items.get(position).getShopName());
        holder.gameImage.setImageResource(items.get(position).getImage());
        holder.gamePrice.setText("Rp"+String.valueOf(items.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
