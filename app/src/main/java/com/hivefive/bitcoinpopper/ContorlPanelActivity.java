package com.hivefive.bitcoinpopper;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class ContorlPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contorl_panel);

        VideoView videoview = (VideoView) findViewById(R.id.videoview);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bg);
        videoview.setVideoURI(uri);
        videoview.start();
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}