package com.example.helpinghand;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Maths extends AppCompatActivity {

    EditText userAns ;
    TextView q11 , q12 , correctAns;
    Button btnans1, btnans2, btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);


        q11 = findViewById(R.id.txtMathQuestion1_1);
        q12 = findViewById(R.id.txtMathQuestion1_2);
        btnans1 = findViewById(R.id.btnans1);
        btnans2 = findViewById(R.id.btnans2);
        //correctAns = findViewById(R.id.txtcorrectAns);
        btnnext = findViewById(R.id.btnNextGame);

        newGame1();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                btnans1.setBackgroundColor(0x00000000);
                btnans2.setBackgroundColor(0x00000000);

            }
        });
    }


    public void play()
    {
        Random r = new Random();

        final int random1 = r.nextInt(2) + 1;

        if(random1 == 1)
        {
            newGame1();
        }
        else
        {
            newGame2();
        }
    }

    public void newGame1() {
        Random random = new Random();;

        //This is for the first number of the Question
        int q = random.nextInt(10) + 1;

        //This is for the second number of the Question
        int p = random.nextInt(10) + 1;
        int z = random.nextInt(10) + 1;

        q11.setText(Integer.toString(q));
        q12.setText(Integer.toString(p));

        final int ans = (q + p);

        final String strAns= (Integer.toString(ans));
        final String strFalse = (Integer.toString(z));

        btnans1.setText(strFalse);
        btnans2.setText(strAns);

        btnans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnans1.setBackgroundColor(Color.RED);
            }
        });

        btnans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnans2.setBackgroundColor(Color.GREEN);
            }
        });
    }

    public void newGame2() {
        Random random = new Random();;

        //This is for the first number of the Question
        int q = random.nextInt(10) + 1;

        //This is for the second number of the Question
        int p = random.nextInt(10) + 1;
        int z = random.nextInt(10) + 1;

        q11.setText(Integer.toString(q));
        q12.setText(Integer.toString(p));

        final int ans = (q + p);

        final String strAns= (Integer.toString(ans));
        final String strFalse = (Integer.toString(z));

        btnans1.setText(strAns);
        btnans2.setText(strFalse);


        btnans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnans1.setBackgroundColor(Color.GREEN);
            }
        });

        btnans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnans2.setBackgroundColor(Color.RED);
            }
        });
    }
}