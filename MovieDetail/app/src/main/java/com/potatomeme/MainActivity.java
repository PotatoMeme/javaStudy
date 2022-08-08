package com.potatomeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private boolean goodState;
    private boolean badState;
    private TextView goodText, badText;
    private ImageButton goodBtn, badBtn;

    private RewardListViewAdapter adapter;
    private ListView listView;
    private List<Reward> mReward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    private void init(){
        goodState = badState = false;
        goodText = findViewById(R.id.movie_good_text);
        badText = findViewById(R.id.movie_bad_text);
        goodBtn = findViewById(R.id.good);
        badBtn = findViewById(R.id.bad);

        goodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(goodState || badState)) {
                    goodText.setText(String.valueOf(Integer.parseInt(goodText.getText().toString()) + 1));
                    goodBtn.setBackgroundResource(R.drawable.good_active);
                    goodState = true;
                } else if (goodState) {
                    goodText.setText(String.valueOf(Integer.parseInt(goodText.getText().toString()) - 1));
                    goodBtn.setBackgroundResource(R.drawable.good_default);
                    goodState = false;
                } else if (badState) {
                    goodText.setText(String.valueOf(Integer.parseInt(goodText.getText().toString()) + 1));
                    badText.setText(String.valueOf(Integer.parseInt(badText.getText().toString()) - 1));
                    goodBtn.setBackgroundResource(R.drawable.good_active);
                    badBtn.setBackgroundResource(R.drawable.bad_default);
                    goodState = true;
                    badState = false;
                }
            }
        });

        badBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(goodState || badState)) {
                    badText.setText(String.valueOf(Integer.parseInt(badText.getText().toString()) + 1));
                    badBtn.setBackgroundResource(R.drawable.bad_active);
                    badState = true;
                } else if (badState) {
                    badText.setText(String.valueOf(Integer.parseInt(badText.getText().toString()) - 1));
                    badBtn.setBackgroundResource(R.drawable.bad_default);
                    badState = false;
                } else if (goodState) {
                    badText.setText(String.valueOf(Integer.parseInt(badText.getText().toString()) + 1));
                    goodText.setText(String.valueOf(Integer.parseInt(goodText.getText().toString()) - 1));
                    badBtn.setBackgroundResource(R.drawable.bad_active);
                    goodBtn.setBackgroundResource(R.drawable.good_default);
                    badState = true;
                    goodState = false;
                }
            }
        });

        mReward = new ArrayList<>();
        mReward.add(new Reward());
        mReward.add(new Reward("test"));

        mReward.add(new Reward("test1"));
        adapter = new RewardListViewAdapter(mReward);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}