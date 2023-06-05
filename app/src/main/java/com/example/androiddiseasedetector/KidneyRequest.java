package com.example.androiddiseasedetector;

import com.google.gson.annotations.SerializedName;

public class KidneyRequest {
    @SerializedName("age")
    public float age;

    @SerializedName("blood_pressure")
    public float blood_pressure;

    @SerializedName("blood_glucose_random")
    public float blood_glucose_random;

    @SerializedName("blood_urea")
    public float blood_urea;

    @SerializedName("serum_creatine")
    public float serum_creatine;

    @SerializedName("sodium")
    public float sodium;

    @SerializedName("potassium")
    public float potassium;
    
    @SerializedName("hemoglobin")
    public float hemoglobin;

    @SerializedName("packed_cell_volume")
    public float packed_cell_volume;

    @SerializedName("white_blood_cell_count")
    public float white_blood_cell_count;

    public void setAge(float age) {
        this.age = age;
    }

    public void setBlood_pressure(float blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public void setBlood_glucose_random(float blood_glucose_random) {
        this.blood_glucose_random = blood_glucose_random;
    }

    public void setBlood_urea(float blood_urea) {
        this.blood_urea = blood_urea;
    }

    public void setSerum_creatine(float serum_creatine) {
        this.serum_creatine = serum_creatine;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }

    public void setPotassium(float potassium) {
        this.potassium = potassium;
    }

    public void setHemoglobin(float hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public void setPacked_cell_volume(float packed_cell_volume) {
        this.packed_cell_volume = packed_cell_volume;
    }

    public void setWhite_blood_cell_count(float white_blood_cell_count) {
        this.white_blood_cell_count = white_blood_cell_count;
    }
}
