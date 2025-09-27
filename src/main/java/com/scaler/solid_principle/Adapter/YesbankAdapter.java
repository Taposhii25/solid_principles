package com.scaler.solid_principle.Adapter;

import com.scaler.solid_principle.Adapter.ThirdParty.YesBank.YesBank;

public class YesbankAdapter implements BankAPI {

    private YesBank yesbank = new YesBank();

    @Override
    public void sendmoney(String from, String to, int amount) {
        yesbank.transfermoney(amount,from,to);
    }

    @Override
    public void registerAccount(String accountnumber) {

    }

    @Override
    public long getBalance(String accountnumber) {
        return 0;
    }
}
