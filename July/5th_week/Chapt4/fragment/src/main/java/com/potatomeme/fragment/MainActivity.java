package com.potatomeme.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private MainFragment fragment1;
    private MainFragment2 fragment2;
    private FragmentTransaction transaction;
    private Boolean replace = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){

        fragment1 = new MainFragment();
        fragment2 = new MainFragment2();
        fragmentManager = getSupportFragmentManager();

        findViewById(R.id.button).setOnClickListener(view -> {
            onFragmentChange(replace);
            replace = !replace;
        });
    }

    public void onFragmentChange(boolean state){
        transaction = fragmentManager.beginTransaction();
        if (state){
            transaction.replace(R.id.container,fragment1).commitAllowingStateLoss();
        } else{
            transaction.replace(R.id.container,fragment2).commitAllowingStateLoss();
        }
        replace = state;
    }


}