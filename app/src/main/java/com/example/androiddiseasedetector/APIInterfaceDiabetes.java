package com.example.androiddiseasedetector;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.*;

public interface APIInterfaceDiabetes {
    @GET("diabetes_disease/result")
    Call<JsonObject> test();

    @POST("diabetes_disease/result")
    Call<JsonObject> test_body(@Body DiabetesRequest diabetesRequest);
}
