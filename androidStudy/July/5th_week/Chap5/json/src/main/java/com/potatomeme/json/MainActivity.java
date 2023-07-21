package com.potatomeme.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    StringBuilder stringBuilder;
    static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        textView = findViewById(R.id.textView);
        stringBuilder = new StringBuilder();
        findViewById(R.id.button).setOnClickListener(view -> {
            sendRequest();
        });
        if (AppHelper.requestQueue == null) {
            AppHelper.requestQueue = Volley.newRequestQueue(this);
        }

    }

    private void sendRequest() {
        String key = "807ebb0a62facdf7a6e1991bf46ae469";
        String date = "20220731";
        String url = String.format("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=%s&targetDt=%s", key, date);
        StringRequest request = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        processResponse(response);
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
                Map<String, String> params = new HashMap<String, String>();

                return params;
            }
        };
        request.setShouldCache(false);
        AppHelper.requestQueue.add(request);
    }

    private void processResponse(String response) {
        Gson gson = new Gson();
        MovieList movieList = gson.fromJson(response, MovieList.class);
        if (movieList != null) {
            Log.d(TAG, movieList.boxOfficeResult.boxofficeType);
            Log.d(TAG, String.valueOf(movieList.boxOfficeResult.dailyBoxOfficeList.size()));
            stringBuilder.append(movieList.boxOfficeResult.boxofficeType)
                    .append(":")
                    .append(String.valueOf(movieList.boxOfficeResult.dailyBoxOfficeList.size()))
                    .append("\n");
        }
    }
}