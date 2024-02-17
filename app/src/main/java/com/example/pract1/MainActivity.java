package com.example.pract1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mainAct";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, R.string.ncreate, Toast.LENGTH_LONG).show();
        Log.i(TAG, "onCreate");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,R.string.nstart,Toast.LENGTH_LONG).show();
        Log.w(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,R.string.nresume,Toast.LENGTH_LONG).show();
        Log.d(TAG,"onResume");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,R.string.npause,Toast.LENGTH_LONG).show();
        Log.v(TAG, "onPause");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,R.string.nstop,Toast.LENGTH_LONG).show();
        Log.e(TAG,"onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,R.string.ndestroy,Toast.LENGTH_LONG).show();
    }


}