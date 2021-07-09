package com.example.hellowrold;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ControlsTestActivity extends AppCompatActivity {

    private TextView textView;

    private static final String TAG = "ControlsTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls_test);

        textView = findViewById(R.id.textview);
        textView.setTextColor(Color.RED);
        textView.setTextSize(20);
        textView.setBackgroundColor(Color.BLUE);

        String s = "hello" + 2;
        Log.e(TAG, s);

        float f = (float) (5 + 5.5);

        System.out.println(object.hashCode());
    }

    Object object = new Object() {
        public int hashCode() {
            return 40;
        }
    };


}