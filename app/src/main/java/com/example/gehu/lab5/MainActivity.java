package com.example.gehu.lab5;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ProgressBar p;
int counter=0;
Handler handler= new Handler();
TextView t;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=findViewById(R.id.progressBar);
        t=findViewById(R.id.textView);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=p.getProgress();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (counter < 100) {
                            counter += 1;


                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    p.setProgress(counter);
                                    t.setText(counter + "/" + p.getMax());
                                    if (counter == 100)
                                        t.setText("Downloaded");
                                }
                            });
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });


    }
}
