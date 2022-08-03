package com.potatomeme.camera;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> activityResultLauncher;
    ImageView imageView;
    File file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result ->  {
            if (result.getResultCode() == Activity.RESULT_OK && result != null) {
                Intent intent = result.getData();
                Log.d("tag",String.valueOf(intent.getIntExtra("requestCode",0)));
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 8;
                Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(),options);
                imageView.setImageBitmap(bitmap);
            }
        });
        imageView = findViewById(R.id.imageView);
        findViewById(R.id.button).setOnClickListener(view -> {
            capture();
        });
        File sdCard = Environment.getExternalStorageDirectory();
        file = new File(sdCard,"capture.jpg");

    }

    private void capture() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        intent.putExtra("requestCode",101);
        activityResultLauncher.launch(intent);
        //startActivityForResult(intent,101);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == Activity.RESULT_OK) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(),options);
            imageView.setImageBitmap(bitmap);
        }
    }*/

}