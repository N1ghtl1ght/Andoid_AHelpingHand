package com.example.helpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class LifeSkills extends AppCompatActivity {

    ImageView img;
    Button btnLeft, btnRight, btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_skills);

        btnLeft = findViewById(R.id.btnlife1);
        btnRight = findViewById(R.id.btnlife2);
        btnnext = findViewById(R.id.btnNextLifeGame);
        img = findViewById(R.id.imageLife);

        btnRight.setBackgroundColor(Color.TRANSPARENT);
        btnLeft.setBackgroundColor(Color.TRANSPARENT);

        Play();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play();
                btnRight.setBackgroundColor(Color.TRANSPARENT);
                btnLeft.setBackgroundColor(Color.TRANSPARENT);
            }
        });
    }

    public void Play() {
        Random r = new Random();

        final int random1 = r.nextInt(5) + 1;

        if (random1 == 1) {
            newGameCat();
        } else if (random1 == 2) {
            newGameDog();
        } else if (random1 == 3) {
            newGameCar();
        } else {
            newGameSun();
        }

    }

    public void newGameCat() {

        img.setImageResource(R.drawable.cat);

        btnLeft.setText("CAT");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.GREEN);
            }
        });

        btnRight.setText("FOOD");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.RED);
            }
        });
    }

    public void newGameDog() {
        img.setImageResource(R.drawable.dog);

        btnLeft.setText("BED");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.RED);
            }
        });

        btnRight.setText("DOG");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.GREEN);
            }
        });
    }

    public void newGameSun() {
        img.setImageResource(R.drawable.sun);

        btnLeft.setText("SUN");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.GREEN);
            }
        });

        btnRight.setText("HAT");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.RED);
            }
        });
    }

    public void newGameCar() {
        img.setImageResource(R.drawable.car);

        btnLeft.setText("MAT");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.RED);
            }
        });

        btnRight.setText("CAR");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.GREEN);
            }
        });
    }
}