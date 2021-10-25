package com.example.experiment3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==31){
            String state=data.getStringExtra("state");
            Log.d("life",state);
        }

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life","activity1 is onStart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("life","activity1 is onPostResume...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life","activity1 is onReStart...");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life","activity1 is onPause...");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life","activity1 is onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life","activity1 is onDestroy...");
    }
    @Override
    public void finish() {
        super.finish();
        Log.d("life","activity1 is finish...");
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("life","activity1 is finishActivity...");
    }

}
