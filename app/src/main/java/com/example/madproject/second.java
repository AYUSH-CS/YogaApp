package com.example.madproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class second extends AppCompatActivity {
TextView tv;
Button p,b,s;
Button a1,a2,a3,a4,a5,a6,up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.tv);
        tv.setTextColor(Color.rgb(0,0,0));

        a1=findViewById(R.id.b1);

        a2=findViewById(R.id.b2);
        a3=findViewById(R.id.b3);
        a4=findViewById(R.id.b4);
        a5=findViewById(R.id.b5);
        a6=findViewById(R.id.b6);

        a1.setBackgroundColor(Color.rgb(243,135,135));
        a2.setBackgroundColor(Color.rgb(243,135,135));
        a3.setBackgroundColor(Color.rgb(243,135,135));
        a4.setBackgroundColor(Color.rgb(243,135,135));
        a5.setBackgroundColor(Color.rgb(243,135,135));
        a6.setBackgroundColor(Color.rgb(243,135,135));

        up=findViewById(R.id.upg);
        up.setBackgroundColor(Color.rgb(135, 212, 59));

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(second.this,padmasana.class);
                startActivity(i1);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(second.this,badda_konasana.class);
                startActivity(i2);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(second.this,shavasan.class);
                startActivity(i3);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(second.this,tadasana.class);
                startActivity(i4);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(second.this,kapottasana.class);
                startActivity(i5);
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(second.this,parvattonasana.class);
                startActivity(i6);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(second.this);
                ad.setTitle("UPGRADE");
                ad.setMessage("Upgrade to premium worth only Rs.199/mo ?");
                ad.setNegativeButton("Later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                ad.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent ii= new Intent(second.this,pay.class);
                        startActivity(ii);
                    }
                });

                AlertDialog a = ad.create();
                a.show();
            }
        });
    }
}