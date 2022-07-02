package com.potatomeme.transmissionexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private String strForamt,saveStr1,saveStr2;
    private String[] stringArr;
    private TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        strForamt = getString(R.string.app_str_format);

        Intent intent = getIntent();
        saveStr1 = intent.getStringExtra("saveStr1");
        saveStr2 = intent.getStringExtra("saveStr2");
        stringArr = intent.getStringArrayExtra("saveStrList");

        textView1 =findViewById(R.id.tv_basic_1);
        textView2 =findViewById(R.id.tv_basic_2);
        textView3 =findViewById(R.id.tv_basic_3);

        textView1.setText(String.format(strForamt,saveStr1));
        textView2.setText(String.format(strForamt,saveStr2));
        textView3.setText(String.format(strForamt,stringArr[0]+stringArr[1]));
    }
}