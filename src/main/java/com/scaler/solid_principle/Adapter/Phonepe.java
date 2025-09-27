package com.scaler.solid_principle.Adapter;

public class Phonepe {
    public static BankAPI bankAPI = new ICICIbankAdapter();
    public static void main(String[] args) {
        bankAPI.sendmoney("1234","9876", 1000);
    }
}
