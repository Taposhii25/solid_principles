package com.scaler.solid_principle.Strategy;

public class Client {
    public static void main(String[] args) {
        GoggleMaps googleMaps = new GoggleMaps();
        googleMaps.findpath("Delhi","Agra","Car");
    }
}
