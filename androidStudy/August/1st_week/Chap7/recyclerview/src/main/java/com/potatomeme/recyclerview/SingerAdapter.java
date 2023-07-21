package com.potatomeme.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SingerAdapter extends RecyclerView.Adapter<SingerAdapter.ViewHolder> {
    Context context;
    ArrayList<SingerItem> items = new ArrayList<SingerItem>();
    OnItemClickListener listener;

    public static interface OnItemClickListener{
        public void onItemClick(ViewHolder holder,View view, int position);
    }

    public SingerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.singer_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SingerItem item = items.get(position);
        holder.setItem(item);
        holder.setItemClickListener(listener);
    }

    public void addItem(SingerItem item){
        items.add(item);
    }
    public void setItems(ArrayList<SingerItem> items){
        this.items = items;
    }
    public SingerItem getItem(int position){
        return items.get(position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView textView2;

        OnItemClickListener listener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(view -> {
                int position = getAdapterPosition();
                if (listener != null ){
                    listener.onItemClick(ViewHolder.this,view,position);
                }
            });
        }
        public void setItem(SingerItem item){
            textView.setText(item.getName());
            textView2.setText(item.getMobile());
        }
        public void setItemClickListener(OnItemClickListener listener){
            this.listener = listener;

        }

    }
}
