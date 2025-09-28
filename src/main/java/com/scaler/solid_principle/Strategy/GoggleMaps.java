package com.scaler.solid_principle.Strategy;

public class GoggleMaps {
    public void findpath(String from, String to,String mode) {
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getpathCalculatorformode(mode);
        pathCalculatorStrategy.findpath(from,to);

    }
}
