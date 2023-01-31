package com.example.appsemenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_activity);
        EditText email = (EditText) findViewById(R.id.editTextEmail);
        EditText password = (EditText) findViewById(R.id.editTextPassword);
        Button enterButton = (Button) findViewById(R.id.buttonEnter);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    startActivity(new Intent(AuthActivity.this, FirstActivity.class));
                } else {
                    Toast.makeText(AuthActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }


    public void startNewSecondActivity(View v) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}