package com.potatomeme.myhometrainingroutine.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.potatomeme.myhometrainingroutine.MainActivity3;
import com.potatomeme.myhometrainingroutine.R;
import com.potatomeme.myhometrainingroutine.entity.Action;

import java.util.List;

public class ActionListAdapter extends BaseAdapter {
    private List<Action> mAction;
    private String[] mStateArr;
    private String[] mDetailArr;

    public ActionListAdapter(List<Action> mAction, Context context) {
        this.mAction = mAction;
        this.mStateArr = context.getResources().getStringArray(R.array.state);
        this.mDetailArr = context.getResources().getStringArray(R.array.state);
    }

    @Override
    public int getCount() {
        return mAction.size();
    }

    @Override
    public Object getItem(int i) {
        return mAction.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null) {//최초는 null 그이후에는 재사용할수 있음
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.list_log, viewGroup, false);

            TextView stateText = view.findViewById(R.id.action_state);
            TextView dateText = view.findViewById(R.id.action_date);
            TextView detailText = view.findViewById(R.id.action_detail);
            TextView countText = view.findViewById(R.id.action_count);
            viewHolder.stateText = stateText;
            viewHolder.dateText = dateText;
            viewHolder.detailText = detailText;
            viewHolder.countText = countText;

            view.setTag(viewHolder);// 저장
        } else {
            viewHolder = (ViewHolder) view.getTag(); // 재사용시 저장한값을 가져옴
        }

        Action action = mAction.get(i);
        viewHolder.stateText.setText(mStateArr[action.getState()]);
        viewHolder.dateText.setText(action.getDate());
        viewHolder.detailText.setText(mDetailArr[action.getDetail()]);
        viewHolder.countText.setText(String.valueOf(action.getCount()));

        return view;
    }

    static class ViewHolder{
        TextView stateText;
        TextView dateText;
        TextView detailText;
        TextView countText;
    }
}
