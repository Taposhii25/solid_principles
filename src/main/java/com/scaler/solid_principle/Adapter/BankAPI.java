package com.scaler.solid_principle.Adapter;

public interface BankAPI {

    void sendmoney(String from, String to, int amount);

    void registerAccount(String accountnumber);

    long getBalance(String accountnumber);

}
