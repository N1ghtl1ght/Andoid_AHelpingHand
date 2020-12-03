package com.example.helpinghand;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EnglishYoung extends AppCompatActivity {
    Button btnA, btnB, btnNext;
    TextView txtQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_young);


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

    public void Play() {
        Random r = new Random();

        int random1 = r.nextInt(6);

        if (random1 == 1) {
            newGameA();
        } else if (random1 == 2) {
            newGameB();
        } else if (random1 == 3) {
            newGameC();
        } else if (random1 == 4) {
            newGameD();
        } else if (random1 == 5) {
            newGameE();
        } else {
            newGameF();
        }
    }

    public void newGameA() {
        String str = "D";
        txtQ.setText("A B C __.");

        btnA.setText(str);
        btnB.setText("S");

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

    public void newGameB() {
        String str = "Z";
        txtQ.setText("W X Y __");

        btnA.setText("O");
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

    public void newGameC() {
        String str = "K";
        txtQ.setText("H I J __");

        btnA.setText(str);
        btnB.setText("A");

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

    public void newGameD() {
        String str = "O";
        txtQ.setText("L M N __");

        btnA.setText("V");
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

    public void newGameE() {
        String str = "T";
        txtQ.setText("Q R S __ ");

        btnA.setText(str);
        btnB.setText("X");

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

    public void newGameF() {
        String str = "W";
        txtQ.setText("T U V __");

        btnA.setText("R");
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
}