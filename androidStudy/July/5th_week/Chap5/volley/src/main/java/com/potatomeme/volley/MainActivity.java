package com.potatomeme.volley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    StringBuilder stringBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        textView = findViewById(R.id.textView);
        stringBuilder = new StringBuilder();
        findViewById(R.id.button).setOnClickListener(view -> {
            sendRequest();
        });
        if (AppHelper.requestQueue == null){
            AppHelper.requestQueue  = Volley.newRequestQueue(this);
        }

    }

    private void sendRequest() {
        String url = "https://www.google.co.kr";
        StringRequest request = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        stringBuilder.append("응답 -> " + response).append("\n");
                        textView.setText(stringBuilder);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        stringBuilder.append("에러 -> " + error.getMessage()).append("\n");
                        textView.setText(stringBuilder);
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();

                return params;
            }
        };
        request.setShouldCache(false);
        AppHelper.requestQueue.add(request);
    }

}