package com.example.gehu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String x = getIntent().getStringExtra("key");
        Intent i = new Intent();
        i.putExtra("msg","hello"+x);
        setResult(-1,i);
        finish();
        );
    }
}
