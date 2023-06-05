package com.example.androiddiseasedetector;

import com.google.gson.annotations.SerializedName;

public class HeartRequest {
    @SerializedName("age")
    public int age;

    @SerializedName("sex")
    public int sex;

    @SerializedName("chest_pain")
    public int chest_pain;
    @SerializedName("blood_pressure")
    public int blood_pressure;

    @SerializedName("cholestrol")
    public int cholestrol;

    @SerializedName("blood_sugar")
    public int blood_sugar;

    @SerializedName("ecg")
    public int ecg;

    @SerializedName("heart_rate")
    public int heart_rate;

    @SerializedName("exercise")
    public int exercise;

    @SerializedName("old_peak")
    public int old_peak;

    @SerializedName("thallium_scan")
    public int thallium_scan;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setChest_pain(int chest_pain) {
        this.chest_pain = chest_pain;
    }

    public void setBlood_pressure(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public void setCholestrol(int cholestrol) {
        this.cholestrol = cholestrol;
    }

    public void setBlood_sugar(int blood_sugar) {
        this.blood_sugar = blood_sugar;
    }

    public void setEcg(int ecg) {
        this.ecg = ecg;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public void setOld_peak(int old_peak) {
        this.old_peak = old_peak;
    }

    public void setThallium_scan(int thallium_scan) {
        this.thallium_scan = thallium_scan;
    }
}
