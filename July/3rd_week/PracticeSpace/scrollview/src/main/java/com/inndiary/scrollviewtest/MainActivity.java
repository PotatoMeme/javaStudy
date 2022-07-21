package com.inndiary.scrollviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.bio_text);
        textView.setText(texts(50));
    }
    private String texts(int i){
        String result = "";
        for (int j = 0;j<i;j++){
            result += "tttttttttttttttt\n";
        }
        return result;

    }
}