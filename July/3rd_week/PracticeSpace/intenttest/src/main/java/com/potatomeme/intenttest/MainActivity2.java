package com.potatomeme.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String data = intent.getStringExtra("test");
        Toast.makeText(getApplicationContext(), data+"MainActivity2", Toast.LENGTH_SHORT).show();

        findViewById(R.id.button).setOnClickListener(view -> {
            Intent finish_intent = new Intent(getApplicationContext(), MainActivity.class);
            finish_intent.putExtra("test", data);
            setResult(1999, finish_intent);
            finish();
        });
    }
}