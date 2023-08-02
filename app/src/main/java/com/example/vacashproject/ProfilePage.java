package com.example.vacashproject;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vacashproject.Adapters.AdapterTransactions;
import com.example.vacashproject.Models.Item;
import com.example.vacashproject.Models.ItemTransactions;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class ProfilePage extends AppCompatActivity implements RecycleViewTransactions {
    // burger2
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    Toolbar toolbar1;
    // end burger2
    RecyclerView RVTransaction;
    Integer totalBalance = 0;

    TextView topUpError;
    private List<ItemTransactions> itemTransactionsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        // burger2
        drawerLayout = findViewById(R.id.drawer_layout1);
        navigationView = findViewById(R.id.nav_view1);

        toolbar1=findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        toolbar.setNavigationIcon(R.drawable.baseline_menu_24);
        toolbar1.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar1, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

// Mengakses ikon burger
        ImageView burgerIcon = findViewById(R.id.burgerIcon1);
        burgerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START); // Ganti dengan GRAVITY yang sesuai
            }
        });

// Mengakses ikon panah
        ImageView arrowIcon = findViewById(R.id.arrowIcon1);
        arrowIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
// end burger2

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