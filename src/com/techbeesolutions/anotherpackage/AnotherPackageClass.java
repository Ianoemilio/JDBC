package com.techbeesolutions.anotherpackage;

import com.hulu.createAccount.NewAccount;
import com.hulu.createAccount.PlatinumUser;

public class AnotherPackageClass {

    public static void main(String[] args) {

        NewAccount user1 = new NewAccount(); //whenever you call a class you have to use *new NewAccount()
        user1.setName("Iano");
        user1.setEmail("Iano@gmail.com");

        RegularUser rUser = new RegularUser();
        rUser.getTestVariable();

    }
}
