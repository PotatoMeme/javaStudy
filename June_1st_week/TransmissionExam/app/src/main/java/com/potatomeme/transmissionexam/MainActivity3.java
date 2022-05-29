package com.potatomeme.transmissionexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    private TextView textView1;
    private TextView textView2;
    private String str1,str2;
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        str1 = getString(R.string.app_obj_format_age);
        str2 = getString(R.string.app_obj_format_name);

        textView1 = findViewById(R.id.tv_basic_1);
        textView2 = findViewById(R.id.tv_basic_2);

        Intent intent = getIntent();
        person = (Person) intent.getSerializableExtra("Person");

        textView1.setText(String.format(str1,person.getAge()));
        textView2.setText(String.format(str2,person.getName()));

        findViewById(R.id.btn_basic).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent ();
        intent.putExtra ("Person", person);
        setResult (RESULT_OK, intent);
        finish ();
    }
}