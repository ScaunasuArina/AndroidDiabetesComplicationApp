package com.example.androiddiseasedetector;

import com.google.gson.annotations.SerializedName;

public class DiabetesRequest {
    @SerializedName("age")
    public int age;
    @SerializedName("sex")
    public int sex;
    
    @SerializedName("blood_pressure")
    public int blood_pressure;

    @SerializedName("cholestrol")
    public int cholestrol;
    
    @SerializedName("bmi")
    public int bmi;
    
    @SerializedName("smoker")
    public int smoker;
    
    @SerializedName("physical_activity")
    public int physical_activity;
    
    @SerializedName("fruits")
    public int fruits;
    
    @SerializedName("general_health")
    public int general_health;

    @SerializedName("mental_health")
    public int mental_health;

    @SerializedName("physical_health")
    public int physical_health;

    @SerializedName("education")
    public int education;

    @SerializedName("income")
    public int income;

    public DiabetesRequest() {

    }

    public DiabetesRequest(int age, int sex) {
        this.age = age;
        this.sex = sex;
        this.blood_pressure = blood_pressure;
        this.cholestrol = cholestrol;
        this.bmi = bmi;
        this.smoker = smoker;
        this.physical_activity = physical_activity;
        this.fruits = fruits;
        this.general_health = general_health;
        this.mental_health = mental_health;
        this.physical_health = physical_health;
        this.education = education;
        this.income = income;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setBlood_pressure(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public void setCholestrol(int cholestrol) {
        this.cholestrol = cholestrol;
    }

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public void setSmoker(int smoker) {
        this.smoker = smoker;
    }

    public void setPhysical_activity(int physical_activity) {
        this.physical_activity = physical_activity;
    }

    public void setFruits(int fruits) {
        this.fruits = fruits;
    }

    public void setGeneral_health(int general_health) {
        this.general_health = general_health;
    }

    public void setMental_health(int mental_health) {
        this.mental_health = mental_health;
    }

    public void setPhysical_health(int physical_health) {
        this.physical_health = physical_health;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
