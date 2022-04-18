package com.potatomeme.newmodule006;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    EditText edt;
    Button btn;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edt = findViewById(R.id.edt_id1);
        btn = findViewById(R.id.btn_id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = edt.getText().toString();
                Toast.makeText(MainActivity4.this,str+"  ****   ",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onClick(View view) {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.chb_id1:
                str = checked?"1 번 true":"1 번 false";
                Toast.makeText(MainActivity4.this,str,Toast.LENGTH_SHORT).show();
            case R.id.chb_id2:
                str = checked?"2 번 true":"2 번 false";
                Toast.makeText(MainActivity4.this,str,Toast.LENGTH_SHORT).show();
            case R.id.chb_id3:
                str = checked?"3 번 true":"3 번 false";
                Toast.makeText(MainActivity4.this,str,Toast.LENGTH_SHORT).show();
        }
    }

    public void next_act(View view) {
        Intent i  = new Intent(MainActivity4.this,MainActivity5.class);
        startActivity(i);
        finish();
    }
}