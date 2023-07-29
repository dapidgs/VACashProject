package com.example.vacashproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.vacashproject.Models.Item;
import com.example.vacashproject.Models.ItemTransactions;
import com.example.vacashproject.R;
import com.example.vacashproject.RecycleViewTransactions;

import java.util.List;

import javax.microedition.khronos.opengles.GL;

public class AdapterTransactions extends RecyclerView.Adapter<AdapterTransactions.viewHolder> {
    private Context ctx;
    private final RecycleViewTransactions recycleViewTransactions;
    private List<ItemTransactions> itemTransactionsList;

    public AdapterTransactions(Context ctx, List<ItemTransactions> itemTransactionsList,
                               RecycleViewTransactions recycleViewTransactions) {
        this.ctx = ctx;
        this.itemTransactionsList = itemTransactionsList;
        this.recycleViewTransactions = recycleViewTransactions;
    }

    @NonNull
    @Override
    public AdapterTransactions.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_transactions, parent, false);
        return new AdapterTransactions.viewHolder(view, recycleViewTransactions);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTransactions.viewHolder holder, int position) {
        final ItemTransactions item = itemTransactionsList.get(position);
        holder.qty.setText(item.getQty());
        holder.totalPrice.setText(item.getTotalPrice());
        holder.nameShop.setText(item.getNameShop());
        holder.nameGame.setText(item.getNameGame());
        holder.itemName.setText(item.getItemName());
        Glide.with(ctx).load(item.getImageItem()).into(holder.imageItem);

    }

    @Override
    public int getItemCount() {
        return itemTransactionsList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageItem;
        TextView qty, totalPrice, nameShop, nameGame, itemName;

        public viewHolder(@NonNull View itemView, RecycleViewTransactions recycleViewTransactions) {
            super(itemView);
            imageItem=itemView.findViewById(R.id.imageItem);
            qty=itemView.findViewById(R.id.qty);
            totalPrice=itemView.findViewById(R.id.totalPrice);
            nameShop=itemView.findViewById(R.id.nameShop);
            nameGame=itemView.findViewById(R.id.nameGame);
            itemName=itemView.findViewById(R.id.itemName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recycleViewTransactions !=null){
                          int pos = getBindingAdapterPosition();
                          if (pos != RecyclerView.NO_POSITION){
                              recycleViewTransactions.onItemClick(pos);

                          }

                    }
//                    recycleViewTransactions.onItemClick(getAdapterPosition() );
                }
            });

//            itemView.setOnClickListener((view) -> {
//                recycleViewTransactions.onLongItemClick(getAdapterPosition());
//                return true;
//            });

        }
    }
}
