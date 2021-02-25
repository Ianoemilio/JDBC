package com.techbeesolutions.bankProject.bankTransactionPart2;

import java.util.Scanner;

public class createAccount extends BankAccount{

    Scanner input = new Scanner(System.in);
    public void create(BankAccount user) {
        System.out.println("Please input your information\nFirst Name");
        this.setfName(input.nextLine());
        while (this.getfName().length() <= 1) {
            System.out.println("Invalid First Name");
            this.setfName(input.nextLine());
        }

        System.out.println("Last Name");
        this.setlName(input.nextLine());
        while (this.getlName().length() < 1) {
            System.out.println("Invalid Last Name");
            this.setlName(input.nextLine());
        }

        System.out.println("Email Address");
        this.setEmail(input.nextLine());

        System.out.println("First Deposit");
        this.setBalance(input.nextFloat());

        System.out.println("Account Number");
        this.setAccNumber(input.nextInt());

        System.out.println("Phone Number");
        this.setPhoneNum(input.nextLine());            //I don't understand why this input code wont run. please help.
        this.setPhoneNum(input.nextLine());            //bypassed by adding another input. still a very odd phenomenon.

        while (this.getPhoneNum().length() != 10) {
            System.out.println("Invalid Phone Number");
            this.setPhoneNum(input.nextLine());
        }
    }
}
