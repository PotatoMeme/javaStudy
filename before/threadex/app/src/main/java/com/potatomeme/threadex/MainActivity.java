package com.potatomeme.threadex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView timeTv;
    Button startBtn;

    Runnable timeRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeTv = (TextView) findViewById(R.id.timeTv);
        startBtn = (Button) findViewById(R.id.startBtn);

        startBtn.setOnClickListener(v->{
            // Runnable 객체를 매개변수로 Thread 생성
            Thread timeThread = new Thread(timeRunnable);
            timeThread.start();  // Thread Start
        });

        timeRunnable = new Runnable() {
            @Override
            public void run() {
                int time = 0;
                while(true){
                    Message msg = new Message();
                    msg.what = 0;
                    msg.arg1 = time;
                    handler.sendMessage(msg);    // Handler에 Message 보냄
                    //여기서 UI 조작시 오류 발생
                    try{
                        Thread.sleep(1000);
                        time++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {//Handler에서 받음
            super.handleMessage(msg);
            if(msg.what == 0){
                timeTv.setText(String.valueOf(msg.arg1));
            }
        }
    };

}
