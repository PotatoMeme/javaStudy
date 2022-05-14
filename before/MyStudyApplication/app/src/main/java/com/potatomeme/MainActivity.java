package com.potatomeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv_id;
    Button btn_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_id = findViewById(R.id.tv_id);
        btn_id = findViewById(R.id.btn_id);

        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_id.setText("누름");
            }
        });

    }
}