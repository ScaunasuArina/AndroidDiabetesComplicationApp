package com.example.androiddiseasedetector;

import com.google.gson.annotations.SerializedName;

public class HeartRequest {
    @SerializedName("age")
    public float age;

    @SerializedName("sex")
    public float sex;

    @SerializedName("chest_pain")
    public float chest_pain;
    @SerializedName("blood_pressure")
    public float blood_pressure;

    @SerializedName("cholestrol")
    public float cholestrol;

    @SerializedName("blood_sugar")
    public float blood_sugar;

    @SerializedName("ecg")
    public float ecg;

    @SerializedName("heart_rate")
    public float heart_rate;

    @SerializedName("exercise")
    public float exercise;

    @SerializedName("old_peak")
    public float old_peak;

    @SerializedName("thallium_scan")
    public float thallium_scan;

    public void setAge(float age) {
        this.age = age;
    }

    public void setSex(float sex) {
        this.sex = sex;
    }

    public void setChest_pain(float chest_pain) {
        this.chest_pain = chest_pain;
    }

    public void setBlood_pressure(float blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public void setCholestrol(float cholestrol) {
        this.cholestrol = cholestrol;
    }

    public void setBlood_sugar(float blood_sugar) {
        this.blood_sugar = blood_sugar;
    }

    public void setEcg(float ecg) {
        this.ecg = ecg;
    }

    public void setHeart_rate(float heart_rate) {
        this.heart_rate = heart_rate;
    }

    public void setExercise(float exercise) {
        this.exercise = exercise;
    }

    public void setOld_peak(float old_peak) {
        this.old_peak = old_peak;
    }

    public void setThallium_scan(float thallium_scan) {
        this.thallium_scan = thallium_scan;
    }
}
