package com.example.yossi.playingmusic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnStart, btnPause, btnStop;
    MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnStart =findViewById(R.id.btnStart);
        btnPause =findViewById(R.id.btnPause);
        btnStop =findViewById(R.id.btnStop);

        btnStart.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {

        
        if(v == btnStart)
        {
            if(mp == null)
                    mp = MediaPlayer.create(this,R.raw.song);

            mp.start();
        }
        else if(v == btnPause)
        {

            mp.pause();
        }
        else if(v == btnStop)
        {

            mp.stop();
            mp.release();
            mp = null;
        }


    }
}
