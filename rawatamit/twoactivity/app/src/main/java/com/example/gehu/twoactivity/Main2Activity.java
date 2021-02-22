package com.example.gehu.twoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {
TextView t1,t2;
    Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        i1=getIntent();
        String x1=i1.getStringExtra("name");
        String y1=i1.getStringExtra("name1");
        t1.setText(x1);
        t2.setText(y1);
    }
}
