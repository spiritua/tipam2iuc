package com.example.arnaudbt.ques;

import android.content.Intent;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.Transformation;
import android.widget.TextView;
import android.widget.ProgressBar;

public class ProgressBarAnimation extends Animation {

    private Context context;
    private ProgressBar progressbar;
    private TextView textView;
    private float from;
    private float to;


    public ProgressBarAnimation(Context context, ProgressBar progressbar, TextView textView, float from, float to) {
        this.context = context;
        this.progressbar = progressbar;
        this.textView = textView;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t)
    {
       super.applyTransformation(interpolatedTime, t);
       float value = from + (to - from)*interpolatedTime;
       progressbar.setProgress((int)value);
       textView.setText((int)value+" %");
       if(value==to)
       {
           context.startActivity(new Intent(context, PubMainActivity.class));
       }
    }
}
