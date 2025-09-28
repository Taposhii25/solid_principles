package com.scaler.solid_principle.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findpath(String fromlocation, String tolocation) {
        System.out.println("Walking path");
    }
}
