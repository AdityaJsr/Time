package com.example.prophit.time;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {


    Button Red;
    Button Blue;
    Button Green;
    Button Grey;
    Button Cyan;
    Button Pink;
    Button Amber;
    Button Magenta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int b[]={0};

        Red = (Button) findViewById(R.id.red);
        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b[0]==0) {
                    Red.setBackgroundColor(Color.RED);
                    b[0]==1)
                }
                else
            }
        });

        Blue = (Button) findViewById(R.id.blue);
        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blue.setBackgroundColor(Color.BLUE);

            }
        });
        final int[] a = {0};


        Green = (Button) findViewById(R.id.green);

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a[0] == 0) {
                    Green.setBackgroundColor(Color.GREEN);
                    a[0] = 1;
                } else {
                    Green.setBackgroundColor(Color.parseColor("#ffffff"));
                    Green.setText("alternate applied");
                    a[0] = 0;
                }
            }
        });

        Grey = (Button) findViewById(R.id.grey);

        Grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Grey.setBackgroundColor(Color.GRAY);
            }
        });

        {

            Cyan = (Button) findViewById(R.id.cyan);
            Cyan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Cyan.setBackgroundColor(Color.parseColor("#7bfad4"));
                }
            });
        }
        {

            Pink = (Button) findViewById(R.id.pink);
            Pink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pink.setBackgroundColor(Color.parseColor("#fdf37ef7"));
                }
            });
        }
        {

            Amber = (Button) findViewById(R.id.amber);
            Amber.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Amber.setBackgroundColor(Color.parseColor("#ffad09"));
                }
            });
        }
        {

            Magenta = (Button) findViewById(R.id.magenta);
            Magenta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Magenta.setBackgroundColor(Color.parseColor("#ff1068"));
                }
            });
        }

    }
}



















































