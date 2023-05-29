package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class KidneyActivity extends AppCompatActivity {
    Button KidneyCheckButton;
    Button KidneyAboutButton;
    Button KidneyBackButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kidney_page);

        KidneyCheckButton= findViewById(R.id.check_kidney_button);
        KidneyAboutButton= findViewById(R.id.about_kidney_data_button);
        KidneyBackButton= findViewById(R.id.back_button);

        KidneyCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_kidney_check = new Intent(KidneyActivity.this, KidneyCheckActivity.class);
                startActivity(intent_kidney_check);
            }
        });

        KidneyAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_kidney_about = new Intent(KidneyActivity.this, KidneyAboutActivity.class);
                startActivity(intent_kidney_about);
            }
        });

        KidneyBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_kidney_back = new Intent(KidneyActivity.this, MainActivity.class);
                startActivity(intent_kidney_back);
            }
        });
    }
}