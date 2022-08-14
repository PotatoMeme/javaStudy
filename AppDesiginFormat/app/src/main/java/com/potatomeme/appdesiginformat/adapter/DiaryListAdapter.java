package com.potatomeme.appdesiginformat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.potatomeme.appdesiginformat.R;
import com.potatomeme.appdesiginformat.entity.Diary;

import java.util.List;

public class DiaryListAdapter extends BaseAdapter {// to do adapter

    Context mContext = null;
    private List<Diary> mDiary;

    private int[] statusImages;

    public DiaryListAdapter(Context context, List<Diary> mDiary) {
        mContext = context;
        this.mDiary = mDiary;
        statusImages = new int[]{R.drawable.ic_status_1,
                R.drawable.ic_status_2,
                R.drawable.ic_status_3,
                R.drawable.ic_status_4,
                R.drawable.ic_status_5};
    }

    public void addItem(Diary diary) {
        mDiary.add(diary);
        this.notifyDataSetChanged();
    }

    public void changeItems(List<Diary> mDiary) {
        this.mDiary = mDiary;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDiary.size();
    }

    @Override
    public Object getItem(int i) {
        return mDiary.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.diary_item, viewGroup, false);

            LinearLayout layout = view.findViewById(R.id.list_container);
            ImageView statusImage = view.findViewById(R.id.list_status);
            TextView titleText = view.findViewById(R.id.list_title);
            TextView dateText = view.findViewById(R.id.list_date);

            viewHolder.layout = layout;
            viewHolder.statusImage = statusImage;
            viewHolder.titleText = titleText;
            viewHolder.dateText = dateText;

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }


        Diary diary = mDiary.get(i);
        switch (diary.getWeather()) {
            case 0:
                viewHolder.layout.setBackgroundColor(ContextCompat.getColor(mContext,R.color.custom_weather_1));
                break;
            case 1:
                viewHolder.layout.setBackgroundColor(ContextCompat.getColor(mContext,R.color.custom_weather_2));
                break;
            case 2:
                viewHolder.layout.setBackgroundColor(ContextCompat.getColor(mContext,R.color.custom_gray));
                break;
            case 3:
                viewHolder.layout.setBackgroundColor(ContextCompat.getColor(mContext,R.color.custom_weather_4));
                break;
            case 4:
                viewHolder.layout.setBackgroundColor(ContextCompat.getColor(mContext,R.color.custom_weather_5));
                break;
        }
        viewHolder.statusImage.setImageResource(statusImages[diary.getStatus()]);
        viewHolder.titleText.setText(diary.getTitle());
        viewHolder.dateText.setText(diary.getDate());
        return view;
    }

    static class ViewHolder {
        LinearLayout layout;
        ImageView statusImage;
        TextView dateText;
        TextView titleText;
    }
}
