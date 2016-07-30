package com.example.raffo.tris;

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

    public void PVPNames(View v){
        Intent i = new Intent(this, PVPNames.class);
        startActivity(i);
    }

    public void PVCNames(View v){
        Intent i = new Intent(this, PVCNames.class);
        startActivity(i);
    }
}
