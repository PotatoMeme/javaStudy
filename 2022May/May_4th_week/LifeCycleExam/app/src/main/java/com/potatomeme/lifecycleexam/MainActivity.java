package com.potatomeme.lifecycleexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PLAYER_LEVEL = "playerLevel";
    public static final String PLAYER_SCORE = "playerScore";
    public static final String LEVEL_FORMAT = "레벨 : ";
    public static final String SCORE_FORMAT = "점수 : ";

    private TextView mLevelText;
    private TextView mScoreText;

    private int mLevel = 0;
    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLevelText = findViewById(R.id.level_text);
        mScoreText = findViewById(R.id.score_text);

//        if (savedInstanceState == null){
//
//        } else {
//            mLevel = savedInstanceState.getInt(PLAYER_LEVEL);
//            mScore = savedInstanceState.getInt(PLAYER_SCORE);
//
//            mLevelText.setText(LEVEL_FORMAT + mLevel);
//            mScoreText.setText(SCORE_FORMAT + mScore);
//        }
    }

    public void onLevelUp(View view) {
        mLevel++;
        mLevelText.setText(LEVEL_FORMAT + mLevel);
    }

    public void onScoreUp(View view) {
        mScore++;
        mScoreText.setText(SCORE_FORMAT + mScore);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {// 상태 저장 함수
        outState.putInt(PLAYER_LEVEL, mLevel);
        outState.putInt(PLAYER_SCORE, mScore);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {// 보관된경우만 호출
        super.onRestoreInstanceState(savedInstanceState);

        mLevel = savedInstanceState.getInt(PLAYER_LEVEL);
        mScore = savedInstanceState.getInt(PLAYER_SCORE);

        mLevelText.setText(LEVEL_FORMAT + mLevel);
        mScoreText.setText(SCORE_FORMAT + mScore);
    }
}