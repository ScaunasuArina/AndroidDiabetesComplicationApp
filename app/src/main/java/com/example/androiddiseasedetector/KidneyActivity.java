package com.example.androiddiseasedetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

        KidneyCheckButton.setOnClickListener(v -> {

            EditText KidneyAge,KidneyBloodPressure,KidneyGlucose,KidneyBloodUrea;
            EditText KidneySerumCreatine,KidneySodium,KidneyPotassium,KidneyPackedCellVolume;
            EditText KidneyHemoglobin, KidneyWhiteBloodCellCount;

            // get all attribute from EditText
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

            // Convert data to String
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

            // Form data for request
            KidneyRequest kidneyRequest = new KidneyRequest();
            kidneyRequest.setAge(Float.valueOf(KidneyAgeString));
            kidneyRequest.setBlood_pressure(Float.valueOf(KidneyBloodPressureString));
            kidneyRequest.setBlood_glucose_random(Float.valueOf(KidneyGlucoseString));
            kidneyRequest.setBlood_urea(Float.valueOf(KidneyBloodUreaString));
            kidneyRequest.setSerum_creatine(Float.valueOf(KidneySerumCreatineString));
            kidneyRequest.setSodium(Float.valueOf(KidneySodiumString));
            kidneyRequest.setPotassium(Float.valueOf(KidneyPotassiumString));
            kidneyRequest.setPacked_cell_volume(Float.valueOf(KidneyPackedCellVolumeString));
            kidneyRequest.setHemoglobin(Float.valueOf(KidneyHemoglobinString));
            kidneyRequest.setWhite_blood_cell_count(Float.valueOf(KidneyWhiteBloodCellCountString));

            EditText KidneyResultText;
            KidneyResultText = (EditText) findViewById(R.id.kidney_result_text);

            APIInterfaceKidney apiInterface = APIClientKidney.getClient()
                    .create(APIInterfaceKidney.class);
            Call<JsonObject> call = apiInterface.get_result(kidneyRequest);
            call.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    KidneyResultText.setText(String.valueOf(response.body().get("response")));
                }
                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {
                    KidneyResultText.setText("FAIL");
                }
            });
        });

        KidneyAboutButton.setOnClickListener(v -> {
            Intent intent_kidney_about = new Intent(KidneyActivity.this, KidneyAboutActivity.class);
            startActivity(intent_kidney_about);
        });

        KidneyBackButton.setOnClickListener(v -> {
            Intent intent_kidney_back = new Intent(KidneyActivity.this, MainActivity.class);
            startActivity(intent_kidney_back);
        });
    }
}