package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class AboutAppActivity extends AppCompatActivity {
    Button AboutAppBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app_page);

        AboutAppBackButton= findViewById(R.id.about_app_back_button);
        AboutAppBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_about_app_back = new Intent(AboutAppActivity.this, MainActivity.class);
                startActivity(intent_about_app_back);
            }
        });
    }
}