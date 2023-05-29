package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class HeartActivity extends AppCompatActivity {
    Button HeartCheckButton;
    Button HeartAboutButton;
    Button HeartBackButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heart_page);

        HeartCheckButton= findViewById(R.id.check_heart_button);
        HeartAboutButton= findViewById(R.id.about_heart_data_button);
        HeartBackButton= findViewById(R.id.back_button);

        HeartCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_heart_check = new Intent(HeartActivity.this, HeartCheckActivity.class);
                startActivity(intent_heart_check);
            }
        });

        HeartAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_heart_about = new Intent(HeartActivity.this, HeartAboutActivity.class);
                startActivity(intent_heart_about);
            }
        });

        HeartBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_heart_back = new Intent(HeartActivity.this, MainActivity.class);
                startActivity(intent_heart_back);
            }
        });
    }
}