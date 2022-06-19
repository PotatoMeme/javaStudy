package com.potatomeme.jsontest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Country> mData;

    public MyAdapter(List<Country> mData) {
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_country, viewGroup, false);
            TextView cityText = view.findViewById(R.id.city_text);
            TextView cityCode = view.findViewById(R.id.city_code);
            viewHolder.cityText = cityText;
            viewHolder.cityCode = cityCode;
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Country weather = mData.get(i);
        viewHolder.cityText.setText(weather.getCountryName());
        viewHolder.cityCode.setText(String.valueOf(weather.getCode()));

        return view;
    }
    static class ViewHolder{
        TextView cityText;
        TextView cityCode;
    }
}
