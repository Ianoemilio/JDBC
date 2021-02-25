package com.techbeesolutions.bankProject.trial3;

import java.util.Scanner;

public class createUser extends BankUserModel{
    
    Scanner input = new Scanner(System.in);

    public void create() {
        System.out.println("Please input your information\nFirst Name");
        this.setfName(input.nextLine());

        System.out.println("Last Name");
        this.setlName(input.nextLine());

        System.out.println("Email Address");
        this.setEmail(input.nextLine());

        System.out.println("First Deposit");
        this.setBalance(input.nextFloat());

        System.out.println("Account Number");
        this.setAccNumber(input.nextInt());

        System.out.println("Phone Number");
        this.setPhoneNum(input.nextLine());
    }
}
