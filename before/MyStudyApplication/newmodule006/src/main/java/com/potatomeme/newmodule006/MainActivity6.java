package com.potatomeme.newmodule006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        VolumeControlView vc = (VolumeControlView) findViewById(R.id.custom_volume);
        final RatingBar rtb = (RatingBar) findViewById(R.id.ratingbar);

        vc.setKnobListner(new VolumeControlView.KnobListener() {
            @Override
            public void onChanged(double angle) {
                float rating = rtb.getRating();
                if (angle > 0 && rating < 6.0)
                    rtb.setRating(rating + 0.5f);
                else if (angle < 0 && rating > 6.0)
                    rtb.setRating(rating - 0.5f);
            }
        });

    }
}