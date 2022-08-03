package com.potatomeme.internetcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Network;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        textView = findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(view -> {
            int status = NetworkStatus.getConnecivityStatus(this);
            String type = "";
            switch(status){
                case NetworkStatus.TYPE_WIFI:
                    type = "무선랜으로 연결됨";
                    break;
                case NetworkStatus.TYPE_MOBILE:
                    type = "모바일로 연결됨";
                    break;
                case NetworkStatus.TYPE_NOT_CONNECTED:
                    type = "연결된것이 없음";
                    break;
            }
            textView.setText(type);
        });
    }
}