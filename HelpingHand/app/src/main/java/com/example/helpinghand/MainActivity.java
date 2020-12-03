package com.example.helpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMaths, btnEnglish, btnLifeSkills, btnProfile, btnMathsYoung, btnLifeSkillsYoung, btnEnglishYoung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMaths = (Button) findViewById(R.id.btnMaths);
        btnEnglish = (Button) findViewById(R.id.btnEnglish);
        btnLifeSkills = (Button) findViewById(R.id.btnLifeSkills);
        btnProfile = (Button) findViewById(R.id.btnProfile);
        btnMathsYoung = (Button) findViewById(R.id.btnmathsYounger);
        btnLifeSkillsYoung = (Button) findViewById(R.id.btnLifeSkillsYoung);
        btnEnglishYoung = (Button) findViewById(R.id.btnEnglishYoung);

        btnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToMaths();
            }
        });
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToEnglish();
            }
        });
        btnEnglishYoung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToEnglishYoung();
            }
        });
        btnLifeSkillsYoung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToLifeSkillsYoung();
            }
        });
        btnLifeSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToLifeSkillsOlder();
            }
        });
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToSupport();
            }
        });
        btnMathsYoung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserToMathsYounger();
            }
        });
    }


    private void sendUserToMaths() {
        //When user wants to create a new account send user to Register Activity
        Intent MathsIntent = new Intent(MainActivity.this,Maths.class);
        startActivity(MathsIntent);
    }
    private void sendUserToEnglish() {
        //When user wants to create a new account send user to Register Activity
        Intent EnglishIntent = new Intent(MainActivity.this,English.class);
        startActivity(EnglishIntent);
    }
    private void sendUserToEnglishYoung() {
        //When user wants to create a new account send user to Register Activity
        Intent EnglishYoungIntent = new Intent(MainActivity.this,EnglishYoung.class);
        startActivity(EnglishYoungIntent);
    }
    private void sendUserToLifeSkillsYoung() {
        //When user wants to create a new account send user to Register Activity
        Intent LifeSkillsIntent = new Intent(MainActivity.this, LifeSkills.class);
        startActivity(LifeSkillsIntent);
    }
    private void sendUserToMathsYounger() {
        //When user wants to create a new account send user to Register Activity
        Intent MathsYoungIntent = new Intent(MainActivity.this, MathsYounger.class);
        startActivity(MathsYoungIntent);
    }

    private void sendUserToLifeSkillsOlder() {
        //When user wants to create a new account send user to Register Activity
        Intent LifeSkillsOldIntent = new Intent(MainActivity.this, LifeSkillsOlder.class);
        startActivity(LifeSkillsOldIntent);
    }

    private void sendUserToSupport() {
        //When user wants to create a new account send user to Register Activity
        Intent SupportIntent = new Intent(MainActivity.this, Support.class);
        startActivity(SupportIntent);
    }
}