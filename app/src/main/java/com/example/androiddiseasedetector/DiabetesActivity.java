package com.example.androiddiseasedetector;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

//import okhttp3.Call;
//import okhttp3.Callback;
//import okhttp3.FormBody;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.RequestBody;
//import okhttp3.Response;

import com.google.gson.JsonObject;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.*;
import retrofit2.Call;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

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

                // Convert data to String
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

                // Form data for request
                DiabetesRequest diabetesRequest = new DiabetesRequest();
                diabetesRequest.setAge(Integer.valueOf(DiabetesAgeString));
                diabetesRequest.setSex(Integer.valueOf(DiabetesSexString));
                diabetesRequest.setBlood_pressure(Integer.valueOf(DiabetesBloodPressureString));
                diabetesRequest.setCholestrol(Integer.valueOf(DiabetesCholestrolString));
                diabetesRequest.setBmi(Integer.valueOf(DiabetesBmiString));
                diabetesRequest.setSmoker(Integer.valueOf(DiabetesSmokerString));
                diabetesRequest.setPhysical_activity(Integer.valueOf(DiabetesPhysicalActivityString));
                diabetesRequest.setFruits(Integer.valueOf(DiabetesFruitsString));
                diabetesRequest.setGeneral_health(Integer.valueOf(DiabetesGeneralHealthString));
                diabetesRequest.setMental_health(Integer.valueOf(DiabetesMentalHealthString));
                diabetesRequest.setPhysical_health(Integer.valueOf(DiabetesPhysicalHealthString));
                diabetesRequest.setEducation(Integer.valueOf(DiabetesEducationString));
                diabetesRequest.setIncome(Integer.valueOf(DiabetesIncomeString));

                EditText DiabetesResultText;
                DiabetesResultText = (EditText) findViewById(R.id.diabetes_result_text);

                APIInterfaceDiabetes apiInterface = APIClientDiabetes.getClient()
                        .create(APIInterfaceDiabetes.class);
                Call<JsonObject> call = apiInterface.test_body(diabetesRequest);
                call.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        DiabetesResultText.setText(String.valueOf(response.body().get("response")));
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {
                        DiabetesResultText.setText("FAIL");
                    }
                });
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