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
//                Intent intent_kidney_check = new Intent(KidneyActivity.this, KidneyCheckActivity.class);
//                startActivity(intent_kidney_check);

                EditText KidneyAge,KidneyBloodPressure,KidneyGlucose,KidneyBloodUrea;
                EditText KidneySerumCreatine,KidneySodium,KidneyPotassium,KidneyPackedCellVolume;
                EditText KidneyHemoglobin, KidneyWhiteBloodCellCount;

                // get all attribute from EditText and save them to Strings
                KidneyAge = (EditText) findViewById(R.id.kidney_age_text);
                KidneyBloodPressure = (EditText) findViewById(R.id.kidney_blood_pressure_text);
                KidneyGlucose = (EditText) findViewById(R.id.kidney_blood_glucose_random_text);
                KidneyBloodUrea = (EditText) findViewById(R.id.kidney_blood_urea_text);
                KidneySerumCreatine = (EditText) findViewById(R.id.kidney_serum_creatine_text);
                KidneySodium = (EditText) findViewById(R.id.kidney_sodium_text);
                KidneyPotassium = (EditText) findViewById(R.id.kidney_potassium_text);
                KidneyPackedCellVolume = (EditText) findViewById(R.id.kidney_packed_cell_volume_text);
                KidneyHemoglobin = (EditText) findViewById(R.id.kidney_hemoglobin_text);
                KidneyWhiteBloodCellCount = (EditText) findViewById(R.id.kidney_white_blood_cell_count_text);

                String KidneyAgeString = KidneyAge.getText().toString();
                String KidneyBloodPressureString = KidneyBloodPressure.getText().toString();
                String KidneyGlucoseString = KidneyGlucose.getText().toString();
                String KidneyBloodUreaString = KidneyBloodUrea.getText().toString();
                String KidneySerumCreatineString = KidneySerumCreatine.getText().toString();
                String KidneySodiumString = KidneySodium.getText().toString();
                String KidneyPotassiumString = KidneyPotassium.getText().toString();
                String KidneyPackedCellVolumeString = KidneyPackedCellVolume.getText().toString();
                String KidneyHemoglobinString = KidneyHemoglobin.getText().toString();
                String KidneyWhiteBloodCellCountString = KidneyWhiteBloodCellCount.getText().toString();

                // Call The API for result
                String Result = "PREZENT";

                // Write the result from API to EditText
                EditText KidneyResultText;
                KidneyResultText = (EditText) findViewById(R.id.kidney_result_text);
                KidneyResultText.setText(Result);
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