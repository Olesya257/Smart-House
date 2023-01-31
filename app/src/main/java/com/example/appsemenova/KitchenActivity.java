package com.example.appsemenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KitchenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.light_activity);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }


    public void startThermostatActivity(View v) {
        Intent intent = new Intent(this, ThermostatActivity.class);
        startActivity(intent);
    }

}