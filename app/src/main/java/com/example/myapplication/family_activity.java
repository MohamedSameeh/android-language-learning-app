package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class family_activity extends AppCompatActivity {
 ImageButton father_btn_1,grandmother_btn_1,mother_btn_1,grandfather_btn_1;
 MediaPlayer father,mother,grandfather,grandmother;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        father_btn_1=findViewById(R.id.father_btn);
        grandfather_btn_1=findViewById(R.id.grandfather_btn);
        mother_btn_1=findViewById(R.id.mother_btn);
        grandmother_btn_1=findViewById(R.id.grandmother_btn);
        father=MediaPlayer.create(this,R.raw.father);
        grandfather=MediaPlayer.create(this,R.raw.grandfather);
        mother=MediaPlayer.create(this,R.raw.mother);
        grandmother=MediaPlayer.create(this,R.raw.grandmother);

        father_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                father.start();
            }
        });
        grandfather_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grandfather.start();
            }
        });

        mother_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mother.start();
            }
        });
        grandmother_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grandmother.start();
            }
        });

    }
}