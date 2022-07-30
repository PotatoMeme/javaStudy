package com.potatomeme.socket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    ClientThread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        findViewById(R.id.button1).setOnClickListener(view -> {
            thread = new ClientThread();
            thread.start();
        });
    }

    class ClientThread extends Thread{
        private static final int port = 5001;
        private String host = "localhost";
        @Override
        public void run() {
            try {
                Socket socket = new Socket(host,port);
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                outputStream.writeObject("안녕!");
                outputStream.flush();
                Log.d("ClientThread","서버로 보냄.");
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                Object input = inputStream.readObject();
                Log.d("ClientThread","받은 데이터:"+input);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}