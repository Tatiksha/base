package com.example.gehu.square;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t;

Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(EditText)findViewById(R.id.edit);
        b=(EditText)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sq;
                String str;
                str=t.getText().toString();
                sq=Integer.parseInt(str);
                sq=sq*sq;
                Toast to;
                to=Toast.makeText(getApplicationContext(),"square="+sq,Toast.LENGTH_LONG);
                to.show();
            }
        });



    }
}
