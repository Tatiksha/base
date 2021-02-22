package com.example.gehu.serviceapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;
public class MyService extends Service {
    @Override

    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("not yet implemented");
        /* TODO: Return the communication channel to the service. */
    }
    public int onStartCommand(Intent intent,int flags,int startId){
        MediaPlayer media= MediaPlayer.create(R.raw.audio);
        media.start();
        if(media.isPlaying())
        {
                Toast.makeText(this,"Audio strated", Toast.LENGTH_SHORT).show();
        }
        return Service.START_STICKY;
    }
}
