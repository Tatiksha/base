package com.example.gehu.twoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Intent i;
    EditText e1, e2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        b = findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this,Main2Activity.class);
                String x=e1.getText().toString();
                String y=e2.getText().toString();
                i.putExtra("name",x);
                i.putExtra("name1",y);
                startActivity(i);
            }
        });

    }
}
