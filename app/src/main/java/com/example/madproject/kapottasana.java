package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class kapottasana extends AppCompatActivity {

    TextView padm,padm7,padm2,padm3,padm4,padm5,padm6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapottasana);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        padm=findViewById(R.id.padm);
        padm.setTextColor(Color.rgb(243,135,135));
        //padm.setTextColor(getResources().getColor(R.color.purple_500));
        padm2=findViewById(R.id.padm2);
        padm3=findViewById(R.id.padm3);
        padm4=findViewById(R.id.padm4);
        padm5=findViewById(R.id.padm5);
        padm6=findViewById(R.id.padm6);
        padm7=findViewById(R.id.padm7);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.paud);
    }
}