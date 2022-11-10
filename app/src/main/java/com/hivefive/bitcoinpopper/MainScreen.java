package com.hivefive.bitcoinpopper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    Button main_pop, bonus_pop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide();


        main_pop = findViewById(R.id.main_pop_but);
        bonus_pop = findViewById(R.id.bonus_pop_but);


        bonus_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this, BonusPopScreen.class);
                startActivity(intent);
            }
        });







    }

    public void controlPanel(View view) {
        Intent intent =new Intent(MainScreen.this, ContorlPanelActivity.class);
        startActivity(intent);
    }
}