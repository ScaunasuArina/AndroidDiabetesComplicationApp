package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class DiabetesCheckActivity extends AppCompatActivity {
    EditText DiabetesAge, DiabetesSex, DiabetesBloodPressure, DiabetesCholestrol;
    EditText DiabetesGeneralHealth, DiabetesMentalHealth, DiabetesPhysicalHealth;
    EditText DiabetesPhysicalActivity, DiabetesBmi, DiabetesFruits, DiabetesSmoker;
    EditText DiabetesEducation, DiabetesIncome;
    EditText DiabetesResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.diabetes_page);
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

        DiabetesResultText = (EditText) findViewById(R.id.diabetes_result_text);
        DiabetesResultText.setText("Successful!");

    }
}