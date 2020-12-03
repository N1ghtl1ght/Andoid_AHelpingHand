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

public class LifeSkillsOlder extends AppCompatActivity {

    TextView txtQ;
    Button btnLeft, btnRight, btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_skills_older);

        btnLeft = findViewById(R.id.btnlife1);
        btnRight = findViewById(R.id.btnlife2);
        btnnext = findViewById(R.id.btnNextLifeGame);
        txtQ = findViewById(R.id.txtLifeQuestion);

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
            newGame1();
        } else if (random1 == 2) {
            newGame2();
        } else if (random1 == 3) {
            newGame3();
        } else if (random1 == 4) {
            newGame4();
        } else {
            newGame5();
        }
    }

    public void newGame1() {
        String str = "EXERCISE";


        txtQ.setText("Is it good to " + str + " ?");

        btnLeft.setText("NO");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.RED);
            }
        });

        btnRight.setText("YES");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.GREEN);
            }
        });
    }

    public void newGame2() {
        String str = "TREATED THE SAME";

        txtQ.setText("Should everyone be " + str + " ?");


        btnLeft.setText("YES");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.GREEN);
            }
        });

        btnRight.setText("NO");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.RED);
            }
        });
    }

    public void newGame3() {
        String str = "";

        txtQ.setText("Is it good to smile?");


        btnLeft.setText("NO");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.RED);
            }
        });

        btnRight.setText("YES");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.GREEN);
            }
        });
    }

    public void newGame4() {
        String str1 = "PLEASE";
        String str2 = "THANK YOU";

        txtQ.setText("Should you always say " + str1 + " and " + str2 + " you?");


        btnLeft.setText("YES");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.GREEN);
            }
        });

        btnRight.setText("NO");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.RED);
            }
        });
    }

    public void newGame5() {
        String str = "SEAT BELT";

        txtQ.setText("Should you wear a " + str + " in a car ?");


        btnLeft.setText("NO");
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLeft.setBackgroundColor(Color.RED);
            }
        });

        btnRight.setText("YES");
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRight.setBackgroundColor(Color.GREEN);
            }
        });
    }
}