package com.potatomeme.styleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int num;
    private int[] styles;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_click).setOnClickListener(this);

        num = 0;

        styles = new int[3];
        styles[0] = R.style.TEXTVIEW_STYLE_0;
        styles[1] = R.style.TEXTVIEW_STYLE_1;
        styles[2] = R.style.TEXTVIEW_STYLE_2;

        textView = findViewById(R.id.tv_main);
        textView.setTextAppearance(styles[num]);
    }

    @Override
    public void onClick(View view) {
        num = num == 2 ? 0 : num + 1;
        textView.setTextAppearance(styles[num]);
    }
}