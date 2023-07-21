package com.potatomeme.end;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragFunc {

    MainFragment1 fragment1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            if (fragment1 != null){
                fragment1.sendData("MainActivity에서 보냄");
            }
        });

        fragment1 = new MainFragment1();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();
    }

    @Override
    public void saveData(String command, String data) {
        button.setText(data);
    }
}