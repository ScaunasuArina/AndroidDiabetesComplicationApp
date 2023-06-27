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

        HeartCheckButton.setOnClickListener(v -> {
            EditText HeartAge,HeartSex,HeartBloodPressure,HeartCholestrol,HeartHeartRate;
            EditText HeartEcg,HeartChestPain,HeartSlopeOfST,HeartOldPeak,HeartNoVesselsFluro;
            EditText HeartThalium,HeartBloodSugar,HeartExercise;

            // get all attribute from EditText
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

            // Convert data to String
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

            // Form data for request
            HeartRequest heartRequest = new HeartRequest();
            heartRequest.setAge(Float.valueOf(HeartAgeString));
            heartRequest.setSex(Float.valueOf(HeartSexString));
            heartRequest.setChest_pain(Float.valueOf(HeartChestPainString));
            heartRequest.setBlood_pressure(Float.valueOf(HeartBloodPressureString));
            heartRequest.setCholestrol(Float.valueOf(HeartCholestrolString));
            heartRequest.setHeart_rate(Float.valueOf(HeartHeartRateString));
            heartRequest.setEcg(Float.valueOf(HeartEcgString));
            heartRequest.setOld_peak(Float.valueOf(HeartOldPeakString));
            heartRequest.setThallium_scan(Float.valueOf(HeartThaliumString));
            heartRequest.setBlood_sugar(Float.valueOf(HeartBloodSugarString));
            heartRequest.setExercise(Float.valueOf(HeartExerciseString));

            EditText HeartResultText;
            HeartResultText = (EditText) findViewById(R.id.heart_result_text);

            APIInterfaceHeart apiInterface = APIClientHeart.getClient()
                    .create(APIInterfaceHeart.class);
            Call<JsonObject> call = apiInterface.get_result(heartRequest);
            call.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    HeartResultText.setText(String.valueOf(response.body().get("response")));
                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {
                    HeartResultText.setText("FAIL");
                }
            });

        });

        HeartAboutButton.setOnClickListener(v -> {
            Intent intent_heart_about = new Intent(HeartActivity.this, HeartAboutActivity.class);
            startActivity(intent_heart_about);
        });

        HeartBackButton.setOnClickListener(v -> {
            Intent intent_heart_back = new Intent(HeartActivity.this, MainActivity.class);
            startActivity(intent_heart_back);
        });
    }
}