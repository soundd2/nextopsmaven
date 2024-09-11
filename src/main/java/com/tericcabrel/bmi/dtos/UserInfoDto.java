package com.tericcabrel.bmi.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class UserInfoDto {
    @Min(0)
    @Max(300)
    private double height;

    @Min(0)
    @Max(500)
    private double weight;

    // Getters and Setters

    public double getHeight() {
        return height;
    }

    public UserInfoDto setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public UserInfoDto setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public double getComputedHeight() {
        return height / 100; // Convert cm to meters
    }
}
