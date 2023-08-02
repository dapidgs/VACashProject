package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vacashproject.Adapters.AdapterTransactions;
import com.example.vacashproject.Models.Item;
import com.example.vacashproject.Models.ItemTransactions;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class ProfilePage extends AppCompatActivity implements RecycleViewTransactions {

    RecyclerView RVTransaction;
    Integer totalBalance = 0;

    TextView topUpError;
    private List<ItemTransactions> itemTransactionsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb1,"2 pcs", "30000", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb2,"5 pcs", "30000", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb3,"2 pcs", "30000", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb1,"3 pcs", "30000", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb3,"2 pcs", "30000", "Mobile Legends", "MLBB 50 Diamonds"));
        itemTransactionsList.add(new ItemTransactions(R.drawable.mlbb2,"3 pcs", "30000",  "Mobile Legends", "MLBB 50 Diamonds"));

        RVTransaction = findViewById(R.id.RVTransaction);
        AdapterTransactions adapterTransactions = new AdapterTransactions(this,itemTransactionsList, this);
        RVTransaction.setAdapter(adapterTransactions);
        RVTransaction.setHasFixedSize(true);
        GridLayoutManager manager = new GridLayoutManager(this,1,RecyclerView.VERTICAL,false);
        RVTransaction.setLayoutManager(manager);
        RVTransaction.setItemAnimator(new DefaultItemAnimator());


        // Button topup
        Button topUpButton = findViewById(R.id.topUpButton);
        TextView balance = findViewById(R.id.balance);
        TextInputEditText topUpField = findViewById(R.id.topUpField);
        topUpError = findViewById(R.id.topuperr);

        topUpButton.setOnClickListener(view -> {
                totalBalance += parse(topUpField.getText().toString());
                balance.setText(totalBalance.toString());
        });
    }

    public Integer parse (String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            topUpError.setText("Error");
            return 0;
        }
    }

    @Override
    public void onItemClick(int position) {

    }

//    @Override
//    public void onItemClick(int position) {
//        Toast.makeText(this, itemTransactionsList.get(position), Toast.LENGTH_SHORT).show();
//    }
}