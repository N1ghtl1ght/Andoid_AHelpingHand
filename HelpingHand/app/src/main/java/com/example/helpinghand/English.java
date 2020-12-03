package com.example.helpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;


public class English extends AppCompatActivity {

    Button btnA, btnB, btnNext;
    TextView txtQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        txtQ = findViewById(R.id.txtEngQ);
        btnNext = findViewById(R.id.btnNextEnd);

        btnA.setBackgroundColor(Color.TRANSPARENT);
        btnB.setBackgroundColor(Color.TRANSPARENT);

        Play();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play();
                btnA.setBackgroundColor(Color.TRANSPARENT);
                btnB.setBackgroundColor(Color.TRANSPARENT);
            }
        });
    }

    public void Play()
    {
        Random r = new Random();

        int random1 = r.nextInt(6);

        if (random1 == 1)
        {
            newGameA();
        }
        else if (random1 == 2)
        {
            newGameB();
        }
        else if (random1 == 3)
        {
            newGameC();
        }
        else if (random1 == 4)
        {
            newGameD();
        }
        else if (random1 == 5)
        {
            newGameE();
        }
        else
        {
            newGameF();
        }
    }

    public void newGameA()
    {
        String str = "dog";
        txtQ.setText("A __ barks.");

        btnA.setText(str);
        btnB.setText("horse");

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA.setBackgroundColor(Color.GREEN);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB.setBackgroundColor(Color.RED);
            }

        });
    }

    public void newGameB()
    {
        String str = "wet";
        txtQ.setText("Water is __ ?");

        btnA.setText("dry");
        btnB.setText(str);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA.setBackgroundColor(Color.RED);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB.setBackgroundColor(Color.GREEN);
            }

        });
    }

    public void newGameC()
    {
        String str = "hot";
        txtQ.setText("The sun is __ ?");

        btnA.setText(str);
        btnB.setText("cold");

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA.setBackgroundColor(Color.GREEN);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB.setBackgroundColor(Color.RED);
            }

        });
    }

    public void newGameD()
    {
        String str = "drive";
        txtQ.setText("A car can ___ fast.");

        btnA.setText("run");
        btnB.setText(str);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA.setBackgroundColor(Color.RED);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB.setBackgroundColor(Color.GREEN);
            }

        });
    }

    public void newGameE()
    {
        String str = "good";
        txtQ.setText("School is __ for you?");

        btnA.setText(str);
        btnB.setText("bad");

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA.setBackgroundColor(Color.GREEN);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB.setBackgroundColor(Color.RED);
            }

        });
    }

    public void newGameF()
    {
        String str = "warm";
        txtQ.setText("Summer is __ ?");

        btnA.setText("cold");
        btnB.setText(str);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA.setBackgroundColor(Color.RED);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB.setBackgroundColor(Color.GREEN);
            }

        });
    }}