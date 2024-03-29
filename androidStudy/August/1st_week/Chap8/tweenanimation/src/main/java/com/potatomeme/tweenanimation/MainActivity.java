package com.potatomeme.tweenanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
            view.startAnimation(scale);
        });
    }
}