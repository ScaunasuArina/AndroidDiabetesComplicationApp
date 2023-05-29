package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;
import android.widget.Button;

public class KidneyAboutActivity extends AppCompatActivity {
    Button AboutKidneyCheckButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_kidney_page);

        AboutKidneyCheckButton= findViewById(R.id.about_kidney_back_button);
        AboutKidneyCheckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_diabetes_back = new Intent(KidneyAboutActivity.this, KidneyActivity.class);
                startActivity(intent_diabetes_back);
            }
        });
    }
}