package com.potatomeme.callbackexam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ColorListFragment.OnColorSelectedListener{

    private ColorFragment colorFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorFragment = (ColorFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_color);

    }

    @Override
    public void onColorSelected(int color) {
        colorFragment.setColor(color);
    }
}