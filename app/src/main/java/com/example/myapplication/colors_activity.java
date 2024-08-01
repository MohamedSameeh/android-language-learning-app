package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class colors_activity extends AppCompatActivity {
Button white_btn,black_btn,blue_btn,red_btn,green_btn;
MediaPlayer white,black,blue,red,green;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        white_btn=findViewById(R.id.white_btn_colors);
        black_btn=findViewById(R.id.black_btn_colors);
        blue_btn=findViewById(R.id.blue_btn_colors);
        red_btn=findViewById(R.id.red_btn_colors);
        green_btn=findViewById(R.id.green_btn_colors);
        white=MediaPlayer.create(this,R.raw.white);
        black=MediaPlayer.create(this,R.raw.black);
        blue=MediaPlayer.create(this,R.raw.blue);
        red=MediaPlayer.create(this,R.raw.red);
        green=MediaPlayer.create(this,R.raw.green);
        white_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                white.start();
            }
        });
        black_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                black.start();
            }
        });
        blue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blue.start();
            }
        });
        red_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red.start();
            }
        });
        green_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                green.start();
            }
        });
    }
}