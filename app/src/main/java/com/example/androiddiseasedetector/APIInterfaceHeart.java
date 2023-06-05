package com.example.androiddiseasedetector;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterfaceHeart {
    @GET("heart_disease/result")
    Call<JsonObject> test();

    @POST("heart_disease/result")
    Call<JsonObject> get_result(@Body HeartRequest heartRequest);
}
