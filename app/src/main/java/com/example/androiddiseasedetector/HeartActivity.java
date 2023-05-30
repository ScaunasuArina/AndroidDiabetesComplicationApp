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
//                Intent intent_heart_check = new Intent(HeartActivity.this, HeartCheckActivity.class);
//                startActivity(intent_heart_check);

                EditText HeartAge,HeartSex,HeartBloodPressure,HeartCholestrol,HeartHeartRate;
                EditText HeartEcg,HeartChestPain,HeartSlopeOfST,HeartOldPeak,HeartNoVesselsFluro;
                EditText HeartThalium,HeartBloodSugar,HeartExercise;

                // get all attribute from EditText and save them to Strings
                HeartAge = (EditText) findViewById(R.id.heart_age_text);
                HeartSex = (EditText) findViewById(R.id.heart_sex_text);
                HeartBloodPressure = (EditText) findViewById(R.id.heart_blood_pressure_text);
                HeartCholestrol = (EditText) findViewById(R.id.heart_cholestrol_text);
                HeartHeartRate = (EditText) findViewById(R.id.heart_heart_rate_text);
                HeartEcg = (EditText) findViewById(R.id.heart_ecg_text);
                HeartChestPain = (EditText) findViewById(R.id.heart_chest_pain_text);
                HeartSlopeOfST = (EditText) findViewById(R.id.heart_slope_of_st_text);
                HeartOldPeak = (EditText) findViewById(R.id.heart_old_peak_text);
                HeartNoVesselsFluro = (EditText) findViewById(R.id.heart_no_vessels_fluro_text);
                HeartThalium = (EditText) findViewById(R.id.heart_thalium_text);
                HeartBloodSugar = (EditText) findViewById(R.id.heart_blood_sugar_text);
                HeartExercise = (EditText) findViewById(R.id.heart_exercise_text);

                String HeartAgeString = HeartAge.getText().toString();
                String HeartSexString = HeartSex.getText().toString();
                String HeartBloodPressureString = HeartBloodPressure.getText().toString();
                String HeartCholestrolString = HeartCholestrol.getText().toString();
                String HeartHeartRateString = HeartHeartRate.getText().toString();
                String HeartEcgString = HeartEcg.getText().toString();
                String HeartChestPainString = HeartChestPain.getText().toString();
                String HeartSlopeOfSTString = HeartSlopeOfST.getText().toString();
                String HeartOldPeakString = HeartOldPeak.getText().toString();
                String HeartNoVesselsFluroString = HeartNoVesselsFluro.getText().toString();
                String HeartThaliumString = HeartThalium.getText().toString();
                String HeartBloodSugarString = HeartBloodSugar.getText().toString();
                String HeartExerciseString = HeartExercise.getText().toString();

                // Call The API for result
                String Result = "PREZENT";

                // Write the result from API to EditText
                EditText HeartResultText;
                HeartResultText = (EditText) findViewById(R.id.heart_result_text);
                HeartResultText.setText(Result);
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