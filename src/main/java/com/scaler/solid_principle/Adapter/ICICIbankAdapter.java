package com.scaler.solid_principle.Adapter;

import com.scaler.solid_principle.Adapter.ThirdParty.ICICIbank.ICICIbank;

public class ICICIbankAdapter implements BankAPI {

    private ICICIbank icicibank = new ICICIbank();

    @Override
    public void sendmoney(String from, String to, int amount) {
        icicibank.makepayment(to,from,amount);
    }

    @Override
    public void registerAccount(String accountnumber) {

    }

    @Override
    public long getBalance(String accountnumber) {
        return 0;
    }
}
