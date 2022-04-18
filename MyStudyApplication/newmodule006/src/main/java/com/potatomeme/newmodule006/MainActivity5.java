package com.potatomeme.newmodule006;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity5 extends AppCompatActivity {
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final RatingBar rtbar = (RatingBar) findViewById(R.id.rating_id);
        rtbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                // v: 별표 개수
                Toast.makeText(MainActivity5.this,
                        "new Rating:" + v
                        ,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick_radio(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (checked)
            Toast.makeText(MainActivity5.this, ((RadioButton) view).getText(), Toast.LENGTH_SHORT).show();
    }

    public void onClick_toggle(View view) {
        boolean checked = ((ToggleButton)view).isChecked();
        if(checked)Toast.makeText(MainActivity5.this, ((ToggleButton)view).getTextOn(),Toast.LENGTH_SHORT).show();
        else Toast.makeText(MainActivity5.this, ((ToggleButton)view).getTextOff(),Toast.LENGTH_SHORT).show();
    }

    public void next_act(View view) {
        Intent i  = new Intent(MainActivity5.this,MainActivity6.class);
        startActivity(i);
        finish();
    }
}