package com.example.recyclerview_item2;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter< FlowerViewHolder > {

    private Context mContext;
    private List< Model > models;

    MyAdapter(Context mContext, List< Model > models) {
        this.mContext = mContext;
        this.models = models;
    }

    @Override
    public FlowerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);
        return new FlowerViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final FlowerViewHolder holder, int position) {
        holder.mImage.setImageResource(models.get(position).getImage());
        holder.mTitle.setText(models.get(position).getName());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext,DetailActivity.class);
                mIntent.putExtra("Title",models.get(holder.getAdapterPosition()).getName());
                mIntent.putExtra("Description",models.get(holder.getAdapterPosition()).getDescription());
                mIntent.putExtra("Image",models.get(holder.getAdapterPosition()).getImage());
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}

class FlowerViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    CardView mCardView;


    FlowerViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.imageView);
        mTitle = itemView.findViewById(R.id.textView);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}

