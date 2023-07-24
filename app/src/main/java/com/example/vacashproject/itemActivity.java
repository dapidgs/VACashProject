package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vacashproject.Adapters.ItemAdapter;
import com.example.vacashproject.Models.Item;

import java.util.Vector;

public class itemActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Vector<Item> itemVector = new Vector<>();
        itemVector.add(new Item(1, "image1", "10000", R.drawable.cardimg1));
        itemVector.add(new Item(2, "image2", "20000", R.drawable.cardimg1));

        adapter = new ItemAdapter(itemVector);

        recyclerView.setAdapter(adapter);

    }
}