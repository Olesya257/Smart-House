package com.example.appsemenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
}