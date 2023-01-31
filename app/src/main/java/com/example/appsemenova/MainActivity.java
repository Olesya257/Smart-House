package com.example.appsemenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    int limit_time = 5;
    int count_time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView animIcon = findViewById(R.id.icon);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        AnimationSet set = new AnimationSet(false);
        set.addAnimation(animation);
        animIcon.startAnimation(set.getAnimations().get(0));
        handler = new Handler();
        timer.run();
    }


    Runnable timer = new Runnable() {
        @Override
        public void run() {
            count_time++;
            if (count_time == limit_time) {
                Intent intent = new Intent(MainActivity.this, AuthActivity.class);
                startActivity(intent);
            } else {
                handler.postDelayed(timer, 450);
            }
        }
    };
}