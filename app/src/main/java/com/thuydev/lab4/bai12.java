package com.thuydev.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bai12 extends AppCompatActivity {
    private  String TAG = "Status";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai12);

        Button btn = findViewById(R.id.next);
        Log.d(TAG, "onCreate");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bai12.this,bai11.class));
            }
        });    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop 2");
    }
}