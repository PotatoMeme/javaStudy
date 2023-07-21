package com.potatomeme.newmodule006;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class VolumeControlView extends androidx.appcompat.widget.AppCompatImageView implements View.OnTouchListener{

    private KnobListener listner;
    private double angle = 0.0d;
    private float x, y;
    private float mx, my;
    public interface KnobListener {
        public void onChanged(double angle);
    }
    public void setKnobListner(KnobListener lis)
    {
        listner = lis;
    }
    public VolumeControlView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setImageResource(R.drawable.knob);
        this.setOnTouchListener(this);
    }

    private double getAngle(float x, float y) {
        mx = x - (getWidth() / 2.0f);
        my = (getHeight() / 2.0f) - y;
        double degree = Math.atan2(mx, my) * 180.0 / 3.141592;
        return degree;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        x = motionEvent.getX();
        y = motionEvent.getY();
        angle = getAngle(x, y);
        invalidate();
        listner.onChanged(angle);
        return true;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        canvas.rotate((float)angle, getWidth() / 2, getHeight() / 2);
        super.onDraw(canvas);
    }
}
