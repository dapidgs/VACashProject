package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vacashproject.item.GameItem;
import com.example.vacashproject.item.GameItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemPage extends AppCompatActivity {

    TextView backBtn, gameTypeTitle, gameNameView;
    ImageView gameImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> finish());

        Intent fromHome = getIntent();
        HomePageItem game = (HomePageItem) fromHome.getSerializableExtra("game");
        gameTypeTitle = findViewById(R.id.gameTypeTitle);
        gameTypeTitle.setText(game.getGameType());

        gameNameView = findViewById(R.id.gameName);
        gameNameView.setText(game.getName());

        gameImageView = findViewById(R.id.gameImage);
        gameImageView.setImageResource(game.getImage());

        RecyclerView recyclerView = findViewById(R.id.gameItemList);

        List<GameItem> items = new ArrayList<>();
        if (game.getGameType().equals("Mobile") ) {
            if(game.getName().equals("Mobile Legends")) {
                items.add(new GameItem("MLBB 50 Diamonds", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Jaya Gaming", 50000F, R.drawable.mlbb1));
                items.add(new GameItem("Starlight Pass", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Wongfeihung", 10000F, R.drawable.mlbb2));
                items.add(new GameItem("100 Diamonds", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Apollo Box", 80000F, R.drawable.mlbb3));
                items.add(new GameItem("Premium Starlight", "Game Descriptions Lorem Ipsum dolor sit amet" ,"PPTI 11 Store", 95000F, R.drawable.mlbb4));
                items.add(new GameItem("One Diamond", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Iseng Center", 950F, R.drawable.mlbb_banner));
            } else if (game.getName().equals("Free Fire")) {
                items.add(new GameItem("Submachine Gun", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Jaya Gaming", 50000F, R.drawable.mlbb1));
                items.add(new GameItem("Protective Gear", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Wongfeihung", 10000F, R.drawable.mlbb2));
                items.add(new GameItem("100 Diamonds", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Apollo Box", 80000F, R.drawable.mlbb3));
                items.add(new GameItem("Premium Starlight", "Game Descriptions Lorem Ipsum dolor sit amet" ,"PPTI 11 Store", 95000F, R.drawable.mlbb4));
                items.add(new GameItem("One Diamond", "Game Descriptions Lorem Ipsum dolor sit amet" ,"Iseng Center", 950F, R.drawable.mlbb_banner));
            }
//            DO NOT DELETE
//            else if (game.getName().equals("CoD Mobile")) {
//
//            } else if (game.getName().equals("PUBG Mobile")) {
//
//            } else if (game.getName().equals("Clash Royale")) {
//
//            }
        } else if (game.getName().equals("PC")) {

        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new GameItemAdapter(getApplicationContext(), items));
    }

}