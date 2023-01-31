package com.example.appsemenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }

    public void startProfActivity(View v) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void startKitchenActivity(View v) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }
}