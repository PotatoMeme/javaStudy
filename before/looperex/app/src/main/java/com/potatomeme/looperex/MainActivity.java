package com.potatomeme.looperex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //logt 자동생성
    private Button buttonStartThread;
    private Handler mainHandler = new Handler();
    private volatile boolean stopThread = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStartThread = findViewById(R.id.button_start_thread);
    }

    public void startThread(View view) {
        stopThread = false;
        ExampleRunnable runnable = new ExampleRunnable(10);
        Thread thread = new Thread(runnable);
        thread.start();//Runnable 재사용 가능 // => new Thread(runnable).start();

        // for문 동작중 UI를 조작하면 메인스레드는 현제 for문을 동작 중이므로
        // 오류가 발생한다
        /*for(int i = 0;i<10;i++){
            Log.d(TAG, "startThread: " + i);
            //logd 자동완성

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        //Thread를 이용
        /*ExampleThread thread = new ExampleThread(10);
        thread.start();//Thread는 1번밖에 시작 못함*/
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                //work
            }
        }).start();
        */

        //Runnable 이용
    }

    public void stopThread(View view) {
        stopThread = true;
    }

    public class ExampleThread extends Thread {
        int seconds;

        ExampleThread(int seconds){
            this.seconds = seconds;
        }

        @Override
        public void run() {
            for(int i = 0;i<10;i++) {
                Log.d(TAG, "startThread: " + i);
                //logd 자동완성

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ExampleRunnable implements Runnable{
        int seconds;

        ExampleRunnable(int seconds){
            this.seconds = seconds;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                Log.d(TAG, "startThread: " + i);
                //logd 자동완성
                //thread 내에서 UI조작시 오류발생 UI는 메인스레드에서바꿀수 있음
                //UI를 바꾸고 싶다면 Handler를 사용하여 UI를 조작할수있음
                if (stopThread)
                    return;
                if (i == 5) {
                    /*Looper가 없으면 오류발생
                    Handler threadHandler = new Handler(Looper.getMainLooper());
                    threadHandler.post(new Runnable() {
                    //메시지가 아니라 runnable 객체를 보냄
                        @Override
                        public void run() {
                            buttonStartThread.setText("50%");
                        }
                    });
                    */
                    /*가능
                    buttonStartThread.post(new Runnable() {
                        @Override
                        public void run() {
                            buttonStartThread.setText("50%");
                        }
                    });
                    */
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            buttonStartThread.setText("50%");
                        }
                    });
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}