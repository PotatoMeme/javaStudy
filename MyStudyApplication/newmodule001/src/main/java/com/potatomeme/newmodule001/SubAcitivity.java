package com.potatomeme.newmodule001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubAcitivity extends AppCompatActivity {
    private TextView tv_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv_id = findViewById(R.id.tv_id);
        tv_id.setText(str);
    }
}