package com.example.vacashproject.Adapters;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vacashproject.Models.Item;
import com.example.vacashproject.R;

import java.util.Vector;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Vector<Item> itemVector;

    public ItemAdapter(Vector<Item> itemVector) {
        this.itemVector = itemVector;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    //
    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item item = itemVector.get(position);
        holder.image.setImageResource(item.getImage());
        holder.name.setText(item.getName());
        holder.price.setText(item.getPrice());
    }

    // getItemCount untuk ngereturn berapa banyak data yang kita punya
    @Override
    public int getItemCount() {
        return itemVector.size();
    }

    // ViewHolder untuk inisialisasi semua item tab kita atau semua komponen yang ada
    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.itemImage);
            name = itemView.findViewById(R.id.itemName);
            price = itemView.findViewById(R.id.itemPrice);
        }
    }

}
