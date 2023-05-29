package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class DiabetesActivity extends AppCompatActivity {
    Button DiabetesCheckButton;
    Button DiabetesAboutButton;
    Button DiabetesBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diabetes_page);

        DiabetesCheckButton= findViewById(R.id.check_diabetes_button);
        DiabetesAboutButton= findViewById(R.id.about_diabetes_data_button);
        DiabetesBackButton= findViewById(R.id.back_button);

        DiabetesCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes_check = new Intent(DiabetesActivity.this, DiabetesCheckActivity.class);
                startActivity(intent_diabetes_check);
            }
        });

        DiabetesAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes_about = new Intent(DiabetesActivity.this, DiabetesAboutActivity.class);
                startActivity(intent_diabetes_about);
            }
        });

        DiabetesBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes_back = new Intent(DiabetesActivity.this, MainActivity.class);
                startActivity(intent_diabetes_back);
            }
        });
    }
}