package com.potatomeme.progressbarexam;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MyAsyncTask extends AsyncTask<Void,Integer,Boolean> {
    int value;
    TextView textView;
    ProgressBar progressBar;

    public MyAsyncTask(int value, TextView textView, ProgressBar progressBar) {
        this.value = value;
        this.textView = textView;
        this.progressBar = progressBar;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        for(int i=0; i<= value; i++)
        {
            try {
                Thread.sleep(500);
                publishProgress(i*100/value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        progressBar.setProgress(values[0].intValue());
        textView.setText(values[0].toString());
        super.onProgressUpdate(values);
    }

    @Override
    protected void onCancelled(Boolean aBoolean) {
        super.onCancelled(aBoolean);
    }
}
