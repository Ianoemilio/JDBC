package com.techbeesolutions.bankProject.bankTransactionPart2;

import java.util.ArrayList;

public class NewAccountDAO extends userOptions {

    ArrayList<createAccount> UserAccounts = new ArrayList<>();

    public void addUser(createAccount newUser) {

        UserAccounts.add(newUser);
        System.out.println("Added new user: " + newUser.getfName());

    }

    public void rmUser() {


    }
}
