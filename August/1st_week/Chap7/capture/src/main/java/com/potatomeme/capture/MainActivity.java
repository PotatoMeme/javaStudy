package com.potatomeme.capture;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    CameraSurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        imageView = findViewById(R.id.imageView);
        surfaceView = findViewById(R.id.surfaceview);
        findViewById(R.id.button).setOnClickListener(view -> {
            capture();
        });
    }

    private void capture() {
        surfaceView.capture(new Camera.PictureCallback() {
            @Override
            public void onPictureTaken(byte[] bytes, Camera camera) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 8;
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                imageView.setImageBitmap(bitmap);
                camera.startPreview();
            }
        });
    }
}