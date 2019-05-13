package com.example.ch1.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(LinearAdapter.LinearViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{
        public LinearViewHolder(View itemView){
            super(itemView);
        }
    }
}
