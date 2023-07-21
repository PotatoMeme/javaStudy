package com.potatomeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    private LinearLayout layout1;
    private LinearLayout layout2;
    private Boolean imageIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layout1 = findViewById(R.id.LinearLayout1);
        layout2 = findViewById(R.id.LinearLayout2);
        imageIndex = true;

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage();
            }
        });
    }
    private void changeImage() {
        if (imageIndex) {
            layout1.setVisibility(View.VISIBLE);
            layout2.setVisibility(View.INVISIBLE);

            imageIndex = !imageIndex;
        } else{
            layout1.setVisibility(View.INVISIBLE);
            layout2.setVisibility(View.VISIBLE);

            imageIndex = !imageIndex;
        }
    }
}