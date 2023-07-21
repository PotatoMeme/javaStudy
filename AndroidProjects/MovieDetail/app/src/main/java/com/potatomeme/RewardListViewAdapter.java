package com.potatomeme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RewardListViewAdapter extends BaseAdapter {
    List<Reward> mReward;

    public RewardListViewAdapter(List<Reward> mReward) {
        this.mReward = mReward;
    }

    @Override
    public int getCount() {
        return mReward.size();
    }

    @Override
    public Object getItem(int i) {
        return mReward.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.reward_list, viewGroup, false);

            TextView clientText = view.findViewById(R.id.reward_client);
            TextView timeText = view.findViewById(R.id.reward_time);
            TextView detialText = view.findViewById(R.id.reward_detail);
            TextView recommendText = view.findViewById(R.id.reward_recommend);
            Button banBtn = view.findViewById(R.id.reward_ban);
            CircleImageView clientImg = view.findViewById(R.id.reward_img);
            RatingBar ratingBar = view.findViewById(R.id.ratingbar);

            viewHolder.clientText = clientText;
            viewHolder.timeText = timeText;
            viewHolder.detialText = detialText;
            viewHolder.recommendText = recommendText;
            viewHolder.banBtn = banBtn;
            viewHolder.clientImg = clientImg;
            viewHolder.ratingBar = ratingBar;

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Reward reward = mReward.get(i);
        viewHolder.clientText.setText(reward.getClient());
        viewHolder.timeText.setText(reward.getTime());
        viewHolder.detialText.setText(reward.getDetail());
        viewHolder.recommendText.setText(String.valueOf(reward.getRecommend()));
        viewHolder.clientImg.setImageResource(reward.getImg());
        viewHolder.ratingBar.setRating(reward.getRating());

        viewHolder.banBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), reward.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    static class ViewHolder {
        TextView clientText;
        TextView timeText;
        TextView detialText;
        TextView recommendText;
        Button banBtn;
        CircleImageView clientImg;
        RatingBar ratingBar;
    }
}
