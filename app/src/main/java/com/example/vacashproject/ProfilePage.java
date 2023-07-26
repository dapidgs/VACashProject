package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vacashproject.Adapters.AdapterTransactions;
import com.example.vacashproject.Models.Item;
import com.example.vacashproject.Models.ItemTransactions;

import java.util.ArrayList;
import java.util.List;

public class ProfilePage extends AppCompatActivity {

    RecyclerView RVTransaction;
    private List<ItemTransactions> itemTransactionsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb1,"2 pcs", "30000", "Apollo", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb2,"5 pcs", "30000", "Maju Jaya", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb3,"2 pcs", "30000", "Apollo", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb1,"3 pcs", "30000", "Maju Jaya", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb3,"2 pcs", "30000", "Apollo", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb2,"3 pcs", "30000", "Maju Jaya", "Mobile Legends", "MLBB 50 Diamonds"));

        RVTransaction = findViewById(R.id.recyclerView);
        AdapterTransactions adapterTransactions = new AdapterTransactions(this,itemTransactionsList);
        RVTransaction.setAdapter(adapterTransactions);
        RVTransaction.setHasFixedSize(true);
        GridLayoutManager manager = new GridLayoutManager(this,1,RecyclerView.VERTICAL,false);
        RVTransaction.setLayoutManager(manager);
        RVTransaction.setItemAnimator(new DefaultItemAnimator());


    }
}