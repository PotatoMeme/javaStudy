package com.potatomeme.newmodule001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_id;
    private Button btn_move;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_id = findViewById(R.id.et_id);


        btn_move = findViewById(R.id.btn_id);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_id.getText().toString();
                Intent intent = new Intent(MainActivity.this,SubAcitivity.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });
    }
}