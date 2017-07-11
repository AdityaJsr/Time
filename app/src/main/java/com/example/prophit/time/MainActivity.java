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

        final int[] b = {0};

        Red = (Button) findViewById(R.id.red);
        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b[0] == 0) {
                    Red.setBackgroundColor(Color.RED);
                    b[0] = 1;
                } else {

                    Red.setBackgroundColor(Color.parseColor("#ffffff"));
                    Red.setText("red");
                    b[0] = 0;
                }
            }
        });
        final int[] c = {0};
        Blue = (Button) findViewById(R.id.blue);
        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c[0] == 0) {
                    Blue.setBackgroundColor(Color.BLUE);
                    c[0] = 1;
                } else {
                    Blue.setBackgroundColor(Color.parseColor("#ffffff"));
                    Blue.setText("blue");
                    c[0] = 0;
                    ;
                }
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
                    Green.setText("green");
                    a[0] = 0;
                }
            }
        });

                final int d[]={0};
        Grey = (Button) findViewById(R.id.grey);

        Grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(d[0]==0) {
                    Grey.setBackgroundColor(Color.GRAY);
                    d[0] = 1;
                }
                    else{
                        Grey.setBackgroundColor(Color.parseColor("#ffffff"));
                    Grey.setText("grey");
                    d[0]=0;
                }
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
            final int[] m={0};
            Magenta = (Button) findViewById(R.id.magenta);
            Magenta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (m[0])
                    {
                    case 1:
                        if(m[0] == 0)
                        {
                        Magenta.setBackgroundColor(Color.parseColor("#ff1068"));
                        m[0]++;}
                        break;
                        case 2:
                            if(m[0] == 1)
                            {Magenta.setBackgroundColor(Color.parseColor("#FD75EFFF"));
                        Magenta.setText("sky blue");
                        m[0]++;}
                            break;
                        case 3:
                        if(m[0] == 2) {
                            Magenta.setBackgroundColor(Color.parseColor("#FFED6C35"));
                            Magenta.setText("orange");
                            m[0]=0;
                        }
                        break;
                            default:
                                break;
                    }
                }


            });
        }

    }
}



















































