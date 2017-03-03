package com.example.android.borkapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer bork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bork = MediaPlayer.create(MainActivity.this, R.raw.bork);
        ImageButton button = (ImageButton) findViewById(R.id.soundButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    bork.start();
                } catch (NullPointerException e) {
                    bork = MediaPlayer.create(MainActivity.this, R.raw.bork);
                }
            }
        });

    }
}