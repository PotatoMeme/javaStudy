package com.potatomeme.asynctask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar1;
    ValueHandler handler;
    BackgroundThread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        progressBar1 = findViewById(R.id.progressBar1);
        handler = new ValueHandler();
        findViewById(R.id.button_start).setOnClickListener(view -> {
            ProgressTask task = new ProgressTask();
            task.execute("Start");
            //task.execute(String) → doInBackground(String)
            Toast.makeText(getApplicationContext(), "Button1 : Complete2", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.button_test).setOnClickListener(view -> {
            thread = new BackgroundThread();
            thread.start();
            Toast.makeText(getApplicationContext(), "Button2 : Complete2", Toast.LENGTH_SHORT).show();
        });
    }

    class ProgressTask extends AsyncTask<String, Integer, Integer> {

        int value = 0;

        @Override
        protected Integer doInBackground(String... strings) {
            //AsyncTask를 시작하면 자동으로 실행되는 코드 부분
            while (true) {
                if (value >= 100)
                    break;
                value += 4;
                publishProgress(value);
                //publishProgress(Integer) → onProgressUpdate(Integer)
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return value;
            //return value(Integer) → onPostExecute(Integer)
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            //AsyncTask가 동작하는 중간중간 상태를 업데이트 하는 부분
            super.onProgressUpdate(values);
            progressBar1.setProgress(values[0].intValue());
        }
        @Override
        protected void onPostExecute(Integer integer) {
            //AsyncTask가 종료되면(doInBackground 코드가 모두 실행되면) 실행되는 부분
            super.onPostExecute(integer);
            Toast.makeText(getApplicationContext(), "Complete1", Toast.LENGTH_LONG).show();
        }

    }

    class  BackgroundThread extends Thread{
        int value = 0;
        public void run(){
            while (true) {
                if (value >= 100)
                    break;
                value += 4;

                Message message = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("value",value);
                message.setData(bundle);
                handler.sendMessage(message);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class ValueHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            Bundle bundle = msg.getData();
            int value = bundle.getInt("value");
            if (value >= 100){
                Toast.makeText(getApplicationContext(), "Button1 : Complete1", Toast.LENGTH_LONG).show();
            }
        }
    }

}