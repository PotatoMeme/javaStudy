package com.potatomeme.movieapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.potatomeme.movieapi.data.MovieInfo;
import com.potatomeme.movieapi.data.MovieList;
import com.potatomeme.movieapi.data.ResponseInfo;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    StringBuilder stringBuilder;

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
            requestMovieList();
        });
        if (AppHelper.requestQueue == null) {
            AppHelper.requestQueue = Volley.newRequestQueue(this);
        }
    }

    private void requestMovieList() {
        String urlStr = "http://" + AppHelper.host + ":" + AppHelper.port + "/movie/readMovieList";
        urlStr += "?" + "type=1";
        StringRequest request = new StringRequest(
                Request.Method.GET,
                urlStr,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //println("Response ->" + response);
                        processResponse(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        println("Error ->" + error);
                    }
                }
        );
        request.setShouldCache(false);
        AppHelper.requestQueue.add(request);
        println("Movie List Request Start!");
    }

    private void processResponse(String response) {
        Gson gson = new Gson();
        ResponseInfo info = gson.fromJson(response,ResponseInfo.class);
        if (info.code == 200){
            MovieList movieList = gson.fromJson(response,MovieList.class);
            println("영화갯수 : "+movieList.result.size());
            for (int i =0; i<movieList.result.size();i++){
                MovieInfo movieInfo = movieList.result.get(i);
                println(movieInfo.toString());
            }
        }
    }

    private void println(String str) {
        stringBuilder.append(str).append("\n");
        textView.setText(stringBuilder);
    }
}