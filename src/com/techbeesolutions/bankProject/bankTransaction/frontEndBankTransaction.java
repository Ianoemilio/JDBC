package com.techbeesolutions.bankProject.bankTransaction;

import java.util.Scanner;

public class frontEndBankTransaction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        errorHandling user1 = new errorHandling();

        NewAccountDAO userAccountDAO = new NewAccountDAO();

        System.out.println("Please input your information\nFirst Name");
        user1.setfName(input.nextLine());
        while (user1.getfName().length() <= 1) {
            System.out.println("Invalid First Name");
            user1.setfName(input.nextLine());
        }

        System.out.println("Last Name");
        user1.setlName(input.nextLine());
        while (user1.getlName().length() < 1) {
            System.out.println("Invalid Last Name");
            user1.setlName(input.nextLine());
        }

        System.out.println("Email Address");
        user1.setEmail(input.nextLine());

        System.out.println("First Deposit");
        user1.setBalance(input.nextFloat());

        System.out.println("Account Number");
        user1.setAccNumber(input.nextInt());

        System.out.println("Phone Number");
        user1.setPhoneNum(input.nextLine());            //I don't understand why this input code wont run. please help.
        user1.setPhoneNum(input.nextLine());            //bypassed by adding another input. still a very odd phenomenon.

        while (user1.getPhoneNum().length() != 10) {
            System.out.println("Invalid Phone Number");
            user1.setPhoneNum(input.nextLine());
        }

        //userAccountDAO.addUser();

        System.out.println("Choose a number: 1 Account Info, 2 Account Balance, 3 Deposit, 4 Withdraw, 5 Quit");
        user1.errors(input.nextInt());

    }
}
