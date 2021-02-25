package com.techbeesolutions.anotherpackage;

import com.hulu.createAccount.NewAccount;
//import com.hulu.createAccount.PlatinumUser;

public class RegularUser extends NewAccount {
    private int testVariable;

    public int getTestVariable() {
        return testVariable;
    }

    public void setTestVariable(int testVariable) {
        this.testVariable = testVariable;
    }
}
