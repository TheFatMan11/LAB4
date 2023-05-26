package com.thuydev.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class bai11 extends AppCompatActivity {
    private  String TAG = "Status";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai11);
        Button btn = findViewById(R.id.next);
        Log.d(TAG, "onCreate");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bai11.this,bai12.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop 1");
    }


}