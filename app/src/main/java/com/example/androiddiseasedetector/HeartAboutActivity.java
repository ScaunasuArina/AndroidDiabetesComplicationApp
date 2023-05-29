package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;
import android.widget.Button;

public class HeartAboutActivity extends AppCompatActivity {
    Button AboutHeartCheckButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_heart_page);

        AboutHeartCheckButton= findViewById(R.id.about_heart_back_button);
        AboutHeartCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes_back = new Intent(HeartAboutActivity.this, HeartActivity.class);
                startActivity(intent_diabetes_back);
            }
        });
    }
}