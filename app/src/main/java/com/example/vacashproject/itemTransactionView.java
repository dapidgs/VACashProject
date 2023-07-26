package com.example.vacashproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class itemTransactionView extends RecyclerView.ViewHolder{

    ImageView imageGame;
    TextView nameShop, nameGame, detailGame, priceGame,dateOrder, qty, totalPrice;
    public itemTransactionView(@NonNull View itemView) {
        super(itemView);
        nameShop=itemView.findViewById(R.id.nameShop);
        nameGame=itemView.findViewById(R.id.nameGame);
        nameShop=itemView.findViewById(R.id.nameShop);
        qty=itemView.findViewById(R.id.qty);
        totalPrice=itemView.findViewById(R.id.totalPrice);
    }
}
