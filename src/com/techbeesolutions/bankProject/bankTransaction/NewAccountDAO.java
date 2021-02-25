package com.techbeesolutions.bankProject.bankTransaction;

import com.hulu.createAccount.NewAccount;

import java.util.ArrayList;

public class NewAccountDAO {

    ArrayList<NewAccount> UserAccounts = new ArrayList<>();

    public void addUser(NewAccount newUser) {

        UserAccounts.add(newUser);
        System.out.println("Added new user: " + newUser.getName());

    }

    public void rmUser(String User) {


    }
}
