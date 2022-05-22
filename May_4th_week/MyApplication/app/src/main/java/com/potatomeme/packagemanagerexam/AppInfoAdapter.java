package com.potatomeme.packagemanagerexam;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AppInfoAdapter extends BaseAdapter {
    private List<ApplicationInfo> mInfos;

    public AppInfoAdapter(List<ApplicationInfo> mInfos) {
        this.mInfos = mInfos;
    }

    @Override
    public int getCount() {
        return mInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return mInfos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if(view == null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_app,viewGroup,false);
            viewHolder.imageView = view.findViewById(R.id.icon_image);
            viewHolder.textView = view.findViewById(R.id.app_name_text);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        ApplicationInfo info = mInfos.get(i);

        Drawable icon = info.loadIcon(viewGroup.getContext().getPackageManager());
        viewHolder.imageView.setImageDrawable(icon);

        String name = String.valueOf(info.loadLabel(viewGroup.getContext().getPackageManager()));
        viewHolder.textView.setText(name);

        return view;
    }

    private  static class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
