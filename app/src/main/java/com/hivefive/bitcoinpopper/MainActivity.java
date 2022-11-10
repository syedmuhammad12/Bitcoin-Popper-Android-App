package com.hivefive.bitcoinpopper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int splash_scr = 4000;

    Animation top, bottom;
    ImageView main_ico;
    TextView app_nam, app_slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide();

        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom = AnimationUtils.loadAnimation(this, R.anim.right_animation);

        main_ico = findViewById(R.id.main_screen_icon);
        app_nam = findViewById(R.id.app_name);

        main_ico.setAnimation(top);
        app_nam.setAnimation(bottom);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainScreen.class);
                startActivity(intent);
                finish();
            }
        }, splash_scr);


    }
}