package com.example.appsemenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
    }

    public void startProfActivity(View v) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void startNewActivity(View v) {
        finish();
    }
}