package com.potatomeme.webrequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Handler handler;
    String urlStr;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        handler = new Handler();
        stringBuilder = new StringBuilder();
        findViewById(R.id.button).setOnClickListener(view -> {
            urlStr = editText.getText().toString();
            RequestThread thread = new RequestThread();
            thread.start();
        });
    }


    class RequestThread extends Thread {
        @Override
        public void run() {
            try {
                URL url = new URL(urlStr);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                if (conn !=  null){
                    conn.setConnectTimeout(10000);
                    conn.setRequestMethod("GET");
                    conn.setDoInput(true);
                    conn.setDoOutput(true);
                    int resCode = conn.getResponseCode();
                    if (resCode == HttpURLConnection.HTTP_OK){
                        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        String line = null;
                        while (true){
                            line = reader.readLine();
                            if (line == null) break;
                            stringBuilder.append(line);
                            stringBuilder.append(System.getProperty("line.separator"));
                            Log.d("webRequest : ",line);
                        }
                        handler.post(()->{
                            textView.setText(stringBuilder);
                        });
                        reader.close();
                    }
                    conn.disconnect();


                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}