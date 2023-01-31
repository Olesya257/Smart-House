package com.example.appsemenova;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Animation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView animIcon = findViewById(R.id.icon);
        animIcon.setImageResource(R.drawable.icon);
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        animIcon.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Animation.this, AuthActivity.class);
                startActivity(i);
                finish();
            }
        }, 2200);
    }
}
