package com.potatomeme.languageexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int count,num;
    private String[] array;
    private String display_fomat;
    private TextView textView_display;
    private TextView textView_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
        num = 0;

        array = getResources().getStringArray(R.array.app_color);
        display_fomat = getString(R.string.app_textformat);

        textView_display = findViewById(R.id.tv_display);
        textView_color = findViewById(R.id.tv_color);

        changeTextView();

        findViewById(R.id.btn_click).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        num = num == 2 ? 0 : num + 1;
        count++;
        changeTextView();
    }

    private void changeTextView(){
        textView_display.setText(String.format(display_fomat,count , num));
        textView_color.setText(array[num]);
    }
}