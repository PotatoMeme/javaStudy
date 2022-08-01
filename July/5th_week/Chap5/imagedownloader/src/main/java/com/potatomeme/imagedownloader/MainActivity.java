package com.potatomeme.imagedownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        imageView = findViewById(R.id.imageView);
        findViewById(R.id.button).setOnClickListener(view -> {
            sendImageRequest();
        });
    }

    private void sendImageRequest() {
        String url = "https://kobis.or.kr/common/mast/movie/2022/07/d76fc81867574936a3035994378ba342.jpg";
        ImageLoadTask task = new ImageLoadTask(url,imageView);
        task.execute();
    }
}