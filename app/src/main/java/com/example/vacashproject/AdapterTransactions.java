package com.example.vacashproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterTransactions extends RecyclerView.Adapter<itemTransactionView> {
    Context context;
    List<itemTransactions> items;
    public AdapterTransactions(Context context, List<itemTransactions> items){
        this.context=context;
        this.items=items;
    }


    @NonNull
    @Override
    public itemTransactionView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemTransactionView(LayoutInflater.from(context).inflate(R.layout.item_transactions,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemTransactionView holder, int position) {
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
