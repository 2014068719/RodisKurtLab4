package com.example.rodis_kurt_115.rodiskurtlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Kurt Rodis", "onCreate() of the app has been executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Kurt Rodis", "onStart() of the app has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Kurt Rodis", "onResume() of the app has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Kurt Rodis", "onPause() of the app has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Kurt Rodis", "onStop() of the app has been executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Kurt Rodis", "onRestart() of the app has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Kurt Rodis", "onDestroy() of the app has been executed");
    }

    public void showMess(View v){
        Toast.makeText(this, "Button already clicked", Toast.LENGTH_LONG).show();
    }

    public void showBar(View v){
        Snackbar.make(v, "Button clicked already", Snackbar.LENGTH_LONG).show();
    }
}
