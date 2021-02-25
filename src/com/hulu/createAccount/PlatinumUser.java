package com.hulu.createAccount;

public class PlatinumUser extends NewAccount{

    private int ccNumber = 52455;

    @Override
    public int getCcNumber() {
        return ccNumber;
    }

    @Override
    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }
}
