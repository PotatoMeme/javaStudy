package com.potatomeme.thread;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1,textView2;
    Button btn1,btn2;
    //int value = 0;
    BackgroundThread thread;
    ValueHandler handler;
    Handler handler2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        btn1 = findViewById(R.id.threadstart1_btn);
        btn2 = findViewById(R.id.threadstart2_btn);
        handler = new ValueHandler();
        handler2 = new Handler();
        btn1.setOnClickListener(view -> {
            thread = new BackgroundThread();
            thread.start();
            Toast.makeText(getApplicationContext(), "Complete2", Toast.LENGTH_SHORT).show();
        });
        btn2.setOnClickListener(view -> {
            new Thread(new Runnable() {
                int value = 0;
                boolean running = false;
                @Override
                public void run(){
                    running =true;
                    while (true){
                        value += 1;
                        handler2.post(new Runnable() {
                            @Override
                            public void run() {
                                textView2.setText(String.valueOf(value));
                            }
                        });
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        });
    }
    private void settingText(String text){
        textView1.setText(text);
    }
    class  BackgroundThread extends Thread{
        int value = 0;
        boolean running = false;
        public void run(){
            // start시 자동을 실행됨
            running =true;
            while (true){
                value += 1;
                Message message = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("value",value);
                message.setData(bundle);
                handler.sendMessage(message);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // textView.setText(String.valueOf(value));
                // settingText(String.valueOf(value));
                // 에러발생 - 메인스레드만 UI 변경가능
            }

        }
    }
    class ValueHandler extends Handler{
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            Bundle bundle = msg.getData();
            textView1.setText(String.valueOf(bundle.getInt("value")));
        }
    }
}