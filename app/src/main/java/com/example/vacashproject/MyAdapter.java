package com.example.vacashproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<HomePageItem> items;

    public MyAdapter(Context context, List<HomePageItem> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.homepageitemlayout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.imageView.setImageResource(items.get(position).getImage());

        holder.itemView.setOnClickListener(view -> {
            Intent toItemPage = new Intent(holder.itemView.getContext(), ItemPage.class);
            toItemPage.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            toItemPage.putExtra("game", items.get(position));
            context.startActivity(toItemPage);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
