package com.potatomeme.threadanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Drawable> arrayList;
    Handler handler;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        arrayList = new ArrayList<Drawable>();
        arrayList.add(getDrawable(R.drawable.img_1));
        arrayList.add(getDrawable(R.drawable.img_2));
        arrayList.add(getDrawable(R.drawable.img_3));

        handler = new Handler();

        imageView = findViewById(R.id.imageView);

        AnimThread animThread = new AnimThread();
        animThread.start();
    }

    class AnimThread extends Thread {
        @Override
        public void run() {
            for (int i =0;i<100;i++){
                final Drawable drawable = arrayList.get(i%3);
                handler.post(()->{
                   imageView.setImageDrawable(drawable);
                });
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}