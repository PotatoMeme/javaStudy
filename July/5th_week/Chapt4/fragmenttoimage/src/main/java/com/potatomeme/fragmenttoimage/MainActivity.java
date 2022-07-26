package com.potatomeme.fragmenttoimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    ListFragment listFragment;
    ViewerFragment viewerFragment;

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        manager = getSupportFragmentManager();

        listFragment = (ListFragment) manager.findFragmentById(R.id.fragment1);
        viewerFragment = (ViewerFragment) manager.findFragmentById(R.id.fragment2);
    }
    public void onImageChange(int i){
        viewerFragment.setBackgroundColor(i);
    }
}