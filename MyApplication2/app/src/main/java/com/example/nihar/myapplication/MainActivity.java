package com.example.nihar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessageMath(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMathActivity.class);
        startActivity(intent);
    }

    public void sendMessageEnglish(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayEnglishTestActivity.class);
        startActivity(intent);
    }
}
