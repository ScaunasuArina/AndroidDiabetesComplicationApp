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
//                Intent intent_diabetes_check = new Intent(DiabetesActivity.this, DiabetesCheckActivity.class);
//                startActivity(intent_diabetes_check);
                EditText DiabetesAge, DiabetesSex, DiabetesBloodPressure, DiabetesCholestrol;
                EditText DiabetesGeneralHealth, DiabetesMentalHealth, DiabetesPhysicalHealth;
                EditText DiabetesPhysicalActivity, DiabetesBmi, DiabetesFruits, DiabetesSmoker;
                EditText DiabetesEducation, DiabetesIncome;

                // get all attribute from EditText
                DiabetesAge = (EditText) findViewById(R.id.diabetes_age_text);
                DiabetesSex = (EditText) findViewById(R.id.diabetes_sex_text);
                DiabetesBloodPressure = (EditText) findViewById(R.id.diabetes_blood_pressure_text);
                DiabetesCholestrol = (EditText) findViewById(R.id.diabetes_cholestrol_text);
                DiabetesGeneralHealth = (EditText) findViewById(R.id.diabetes_general_health_text);
                DiabetesMentalHealth = (EditText) findViewById(R.id.diabetes_mental_health_text);
                DiabetesPhysicalHealth = (EditText) findViewById(R.id.diabetes_physical_health_text);
                DiabetesPhysicalActivity = (EditText) findViewById(R.id.diabetes_physical_activity_text);
                DiabetesBmi = (EditText) findViewById(R.id.diabetes_bmi_text);
                DiabetesFruits = (EditText) findViewById(R.id.diabetes_fruits_text);
                DiabetesSmoker = (EditText) findViewById(R.id.diabetes_smoker_text);
                DiabetesEducation = (EditText) findViewById(R.id.diabetes_education_text);
                DiabetesIncome = (EditText) findViewById(R.id.diabetes_income_text);

                String DiabetesAgeString = DiabetesAge.getText().toString();
                String DiabetesSexString = DiabetesSex.getText().toString();
                String DiabetesBloodPressureString = DiabetesBloodPressure.getText().toString();
                String DiabetesCholestrolString = DiabetesCholestrol.getText().toString();
                String DiabetesGeneralHealthString = DiabetesGeneralHealth.getText().toString();
                String DiabetesMentalHealthString = DiabetesMentalHealth.getText().toString();
                String DiabetesPhysicalHealthString = DiabetesPhysicalHealth.getText().toString();
                String DiabetesPhysicalActivityString = DiabetesPhysicalActivity.getText().toString();
                String DiabetesBmiString = DiabetesBmi.getText().toString();
                String DiabetesFruitsString = DiabetesFruits.getText().toString();
                String DiabetesSmokerString = DiabetesSmoker.getText().toString();
                String DiabetesEducationString = DiabetesEducation.getText().toString();
                String DiabetesIncomeString = DiabetesIncome.getText().toString();

                // Call The API for result
                String Result = "PREZENT";

                // Write the result from API to EditText
                EditText DiabetesResultText;
                DiabetesResultText = (EditText) findViewById(R.id.diabetes_result_text);
                DiabetesResultText.setText(Result);
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