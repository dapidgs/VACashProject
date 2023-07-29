package com.example.vacashproject.item;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vacashproject.R;
import com.example.vacashproject.DetailPage;

import java.util.List;

public class GameItemAdapter extends RecyclerView.Adapter<GameItemViewHolder> {

    Context context;
    List<GameItem> items;

    public GameItemAdapter(Context context, List<GameItem> items) {
        this.items = items;
        this.context = context;
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
        holder.gamePrice.setText("Rp"+items.get(position).getPrice());

        holder.buyBtn.setOnClickListener(view -> {
            try {
                Intent toDetail = new Intent(holder.itemView.getContext(), DetailPage.class);
                toDetail.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                toDetail.putExtra("item", items.get(position));
                context.startActivity(toDetail);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
