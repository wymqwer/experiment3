package com.example.experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("life", "activity2 is onPostResume...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life", "activity2 is onStart...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life", "activity2 is onReStart...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life", "activity2 is onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life", "activity2 is onDestroy...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life", "activity2 is onPause...");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("life", "activity2 is finish...");
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("life", "activity2 is finishActivity...");
    }
}