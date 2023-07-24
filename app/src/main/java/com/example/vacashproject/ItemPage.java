package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vacashproject.item.GameItem;
import com.example.vacashproject.item.GameItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);

        RecyclerView recyclerView = findViewById(R.id.gameItemList);

        List<GameItem> items = new ArrayList<>();
        items.add(new GameItem("MLBB 50 Diamonds", "Jaya Gaming", 50000F, R.drawable.mlbb1));
        items.add(new GameItem("Starlight Pass", "Wongfeihung", 10000F, R.drawable.mlbb2));
        items.add(new GameItem("100 Diamonds", "Apollo Box", 80000F, R.drawable.mlbb3));
        items.add(new GameItem("Premium Starlight", "PPTI 11 Store", 95000F, R.drawable.mlbb4));
        items.add(new GameItem("One Diamond", "Iseng Center", 950F, R.drawable.mlbb_banner));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new GameItemAdapter(getApplicationContext(), items));
    }

}