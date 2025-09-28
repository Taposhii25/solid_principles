package com.scaler.solid_principle.Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy  getpathCalculatorformode(String mode){
        if(mode.equals("Bike")){
            return new BikePathcalculator();
        }else if(mode.equals("Car")){
            return new CarPathCalculator();
        }else{
            return new WalkPathCalculator();
        }
    }
}
