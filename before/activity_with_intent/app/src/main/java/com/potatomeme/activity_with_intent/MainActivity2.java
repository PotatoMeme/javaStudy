package com.potatomeme.activity_with_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");

        mMessageTextView = findViewById(R.id.tv_result);
        mMessageTextView.setText(age+"살"+name);

        findViewById(R.id.btn_reply).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("result",mMessageTextView.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}