package com.example.helpinghand;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MathsYounger extends AppCompatActivity {

    TextView n1, n2, n3,n4, n5, n6, n7, n8, n9, n10;
    Button btncorrect, btnWrong, btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_younger);

        n1 = findViewById(R.id.number_line1);
        n2 = findViewById(R.id.number_line2);
        n3 = findViewById(R.id.number_line3);
        n4 = findViewById(R.id.number_line4);
        n5 = findViewById(R.id.number_line5);
        n6 = findViewById(R.id.number_line6);
        n7 = findViewById(R.id.number_line7);
        n8 = findViewById(R.id.number_line8);
        n9 = findViewById(R.id.number_line9);
        n10 = findViewById(R.id.number_line10);
        btncorrect = findViewById(R.id.btnMathcorrect);
        btnWrong = findViewById(R.id.btnMathWrong);
        btnnext = findViewById(R.id.nextMaths);

        play();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play();
                btnWrong.setBackgroundColor(0x00000000);
                btncorrect.setBackgroundColor(0x00000000);
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

    public void newGame1()
    {
        Random random = new Random();

        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;

        btncorrect.setText(Integer.toString(x));
        btnWrong.setText(Integer.toString(y));

        btncorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncorrect.setBackgroundColor(Color.GREEN);
            }
        });

        btnWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnWrong.setBackgroundColor(Color.RED);
            }
        });

        ArrayList<String> line = new ArrayList<String>(10);
        line.add("1");
        line.add("2");
        line.add("3");
        line.add("4");
        line.add("5");
        line.add("6");
        line.add("7");
        line.add("8");
        line.add("9");
        line.add("10");

        if(x == 1)
        {
            //setting the list values to show on the application
            n1.setText("x");
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 2)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText("x");
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 3)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText("x");
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 4)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText("x");
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 5)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText("x");
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 6)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText("x");
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 7)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText("x");
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 8)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText("x");
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (x == 9)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText("x");
            n10.setText(line.get(9));
        }
        else {

            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText("x");
        }
    }

    public void newGame2()
    {
        Random random = new Random();

        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;

        btncorrect.setText(Integer.toString(x));
        btnWrong.setText(Integer.toString(y));


        btncorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncorrect.setBackgroundColor(Color.RED);
            }
        });

        btnWrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnWrong.setBackgroundColor(Color.GREEN);
            }
        });

        ArrayList<String> line = new ArrayList<String>(10);
        line.add("1");
        line.add("2");
        line.add("3");
        line.add("4");
        line.add("5");
        line.add("6");
        line.add("7");
        line.add("8");
        line.add("9");
        line.add("10");

        if(y == 1)
        {
            //setting the list values to show on the application
            n1.setText("x");
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 2)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText("x");
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 3)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText("x");
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 4)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText("x");
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 5)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText("x");
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 6)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText("x");
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 7)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText("x");
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 8)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText("x");
            n9.setText(line.get(8));
            n10.setText(line.get(9));
        }
        else if (y == 9)
        {
            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText("x");
            n10.setText(line.get(9));
        }
        else {

            //setting the list values to show on the application
            n1.setText(line.get(0));
            n2.setText(line.get(1));
            n3.setText(line.get(2));
            n4.setText(line.get(3));
            n5.setText(line.get(4));
            n6.setText(line.get(5));
            n7.setText(line.get(6));
            n8.setText(line.get(7));
            n9.setText(line.get(8));
            n10.setText("x");
        }
    }
}