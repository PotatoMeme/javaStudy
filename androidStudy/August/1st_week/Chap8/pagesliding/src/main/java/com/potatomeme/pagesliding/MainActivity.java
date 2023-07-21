package com.potatomeme.pagesliding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout page;
    Animation sliding,reverse_sliding;
    Button button;
    Boolean isPageOpen = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        page = findViewById(R.id.page);
        sliding = AnimationUtils.loadAnimation(this,R.anim.anisliding);
        reverse_sliding = AnimationUtils.loadAnimation(this,R.anim.anisliding_reverse);

        SlidingAnimationListener listener = new SlidingAnimationListener();
        sliding.setAnimationListener(listener);
        reverse_sliding.setAnimationListener(listener);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            if (isPageOpen){
                page.startAnimation(reverse_sliding);

            } else {
                page.setVisibility(View.VISIBLE);
                page.startAnimation(sliding);
            }
        });
    }

    class SlidingAnimationListener implements Animation.AnimationListener{

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            if (isPageOpen){
                page.setVisibility(View.GONE);
                button.setText("열기");
                isPageOpen = false;
            }else{
                button.setText("닫기");
                isPageOpen = true;
            }

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }

}