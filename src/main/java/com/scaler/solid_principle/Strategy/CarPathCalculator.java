package com.scaler.solid_principle.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy {

    @Override
    public void findpath(String fromlocation, String tolocation) {
        System.out.println("car path");
    }
}
