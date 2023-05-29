package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {
    Button DiabetesButton;
    Button KidneyButton;
    Button HeartButton;
    Button AboutAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launching_page);
        DiabetesButton= findViewById(R.id.diabetes_button);
        KidneyButton= findViewById(R.id.kidney_button);
        HeartButton= findViewById(R.id.heart_button);
        AboutAppButton= findViewById(R.id.about_app_button);

        DiabetesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes = new Intent(MainActivity.this, DiabetesActivity.class);
                startActivity(intent_diabetes);
            }
        });

        KidneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_kidney = new Intent(MainActivity.this, KidneyActivity.class);
                startActivity(intent_kidney);
            }
        });

        HeartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_heart = new Intent(MainActivity.this, HeartActivity.class);
                startActivity(intent_heart);
            }
        });

        AboutAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_about_app = new Intent(MainActivity.this, AboutAppActivity.class);
                startActivity(intent_about_app);
            }
        });

    }
}