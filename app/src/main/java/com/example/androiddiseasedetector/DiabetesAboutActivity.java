package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;
import android.widget.Button;

public class DiabetesAboutActivity extends AppCompatActivity {
    Button AboutDiabetesCheckButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_diabetes_page);

        AboutDiabetesCheckButton= findViewById(R.id.about_diabetes_back_button);
        AboutDiabetesCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes_back = new Intent(DiabetesAboutActivity.this, DiabetesActivity.class);
                startActivity(intent_diabetes_back);
            }
        });
    }
}