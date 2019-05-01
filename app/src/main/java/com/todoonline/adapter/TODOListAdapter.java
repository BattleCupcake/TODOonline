package com.todoonline.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.todoonline.R;
import com.todoonline.data.TODOdata;

import java.util.List;

public class TODOListAdapter extends RecyclerView.Adapter<TODOListAdapter.TODOViewHolder> {

    private List<TODOdata> data;

    public TODOListAdapter(List<TODOdata> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public TODOViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_todo, viewGroup, false);
        return new TODOViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TODOViewHolder todoViewHolder, int i) {
        todoViewHolder.title.setText(data.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class TODOViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView title;

        public TODOViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
