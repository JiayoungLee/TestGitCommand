package com.example.hellowrold;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Test01");

        Button buttonConstraint = findViewById(R.id.button_constraint);
        Button buttonLinear = findViewById(R.id.button_linear);
        Button buttonRelative = findViewById(R.id.button_relative);
        Button buttonControls = findViewById(R.id.button_controls);

        buttonConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(intent1);
            }
        });

        buttonLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(intent2);
            }
        });

        buttonRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intent3);
            }
        });

        buttonControls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, ControlsTestActivity.class);
                startActivity(intent4);
            }
        });
    }
}