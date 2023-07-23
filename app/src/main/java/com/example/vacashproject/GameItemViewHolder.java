package com.example.vacashproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameItemViewHolder extends RecyclerView.ViewHolder {

    ImageView gameImage;
    TextView gameName, shopName, gamePrice;

    public GameItemViewHolder(@NonNull View itemView) {
        super(itemView);
        gameImage = itemView.findViewById(R.id.gameImage);
        gameName = itemView.findViewById(R.id.gameName);
        shopName = itemView.findViewById(R.id.shopName);
        gamePrice = itemView.findViewById(R.id.gamePrice);
    }
}
