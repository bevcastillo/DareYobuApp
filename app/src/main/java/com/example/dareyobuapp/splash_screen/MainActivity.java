package com.example.dareyobuapp.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.dareyobuapp.R;
import com.example.dareyobuapp.user_ui.SliderActivity;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000; //3 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent sliderIntent = new Intent(MainActivity.this, SliderActivity.class);
                startActivity(sliderIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
