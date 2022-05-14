package com.potatomeme.pattern_mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MainModel mainModel;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainModel = new MainModel();

        textView = (TextView) findViewById(R.id.btn_confirm);
        textView.setText("Non-Clicked");

        findViewById(R.id.btn_confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mainModel.getClickedText();
                TextView textView = (TextView) findViewById(R.id.btn_confirm);
                textView.setText(mainModel.getClickedText());
            }
        });
    }
}