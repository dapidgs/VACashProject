package com.example.vacashproject.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vacashproject.R;

public class GameItemViewHolder extends RecyclerView.ViewHolder {

    ImageView gameImage;
    TextView gameName, shopName, gamePrice;

    Button buyBtn;

    Context context;

    public GameItemViewHolder(@NonNull View itemView) {


        super(itemView);

        gameImage = itemView.findViewById(R.id.gameImage);
        gameName = itemView.findViewById(R.id.gameName);
        shopName = itemView.findViewById(R.id.shopName);
        gamePrice = itemView.findViewById(R.id.gamePrice);
        buyBtn = itemView.findViewById(R.id.buyButton);
        context = itemView.getContext();
    }
}
