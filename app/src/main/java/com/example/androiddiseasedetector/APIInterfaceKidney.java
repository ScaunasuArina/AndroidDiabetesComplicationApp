package com.example.androiddiseasedetector;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterfaceKidney {
    @GET("kidney_disease/result")
    Call<JsonObject> test();

    @POST("kidney_disease/result")
    Call<JsonObject> get_result(@Body KidneyRequest kidneyRequest);
}
