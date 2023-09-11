package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button mBtnNavigateScreen3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB", "Main2 : onCreate");

        mBtnNavigateScreen3 = findViewById(R.id.btnNavigateScreen3);
        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "Main2 : onStart");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "Main2 : onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "Main2 : onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "Main2 : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "Main2 : onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "Main2 : onDestroy");
    }
}