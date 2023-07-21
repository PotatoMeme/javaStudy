package com.potatomeme.mp3player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public static String url = "http://sites.google.com/site/ubiacessmobile/sample_audio.amr";
    MediaPlayer player;
    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        findViewById(R.id.button1).setOnClickListener(view -> {
            playAudio();
        });
        findViewById(R.id.button2).setOnClickListener(view -> {
            pauseAudio();
        });
        findViewById(R.id.button3).setOnClickListener(view -> {
            resumeAudio();
        });
        findViewById(R.id.button4).setOnClickListener(view -> {
            stopAudio();
        });

    }

    private void playAudio() {
        try {
            closePlayer();
            player = new MediaPlayer();
            player.setDataSource(url);
            player.prepare();
            player.start();
            Toast.makeText(this,"재생 시작됨",Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pauseAudio() {
        if (player != null){
            position = player.getCurrentPosition();
            player.pause();
            Toast.makeText(this,"일시정지됨",Toast.LENGTH_SHORT).show();
        }
    }

    private void resumeAudio() {
        if (player != null && !player.isPlaying()){
            player.start();
            player.seekTo(position);
            Toast.makeText(this,"재시작됨",Toast.LENGTH_SHORT).show();
        }
    }

    private void stopAudio() {
        if (player != null && player.isPlaying()){
            player.stop();
            Toast.makeText(this,"재시작됨",Toast.LENGTH_SHORT).show();
        }
    }

    private void closePlayer(){
        if (player != null){
            player.release();
            player = null;
        }
    }
}