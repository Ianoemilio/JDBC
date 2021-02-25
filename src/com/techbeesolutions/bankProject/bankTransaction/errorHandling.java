package com.techbeesolutions.bankProject.bankTransaction;

import java.util.Scanner;

public class errorHandling extends fundTransfers {

    public void errors(int inputs) {

        Scanner input = new Scanner(System.in);

        int choice = inputs;
        while (choice != 5) {
            switch (choice) {
                default:
                    System.out.println("Not valid number");
                    break;
                case 1:
                    System.out.println(this.getfName() + " " + this.getlName() + "\n" + this.getAccNumber()+ "\n" + this.getPhoneNum()+ "\n" + this.getEmail());
                    break;
                case 2:
                    System.out.println("ACCOUNT BALANCE");
                    System.out.println(this.getBalance() + "\n");
                    break;
                case 3:
                    System.out.println("DEPOSIT");
                    System.out.println("Bal: " + this.getBalance());
                    this.setDepositAmount(input.nextFloat());
                    System.out.println("New Bal: " + this.getBalance() + "\n");
                    break;
                case 4:
                    System.out.println("WITHDRAW");
                    System.out.println("Bal: " + this.getBalance());
                    this.setWithdrawAmount(input.nextFloat());

                    System.out.println("New Bal: " + this.getBalance() + "\n");
                    break;

            }
            System.out.println("\n\n*****************************************************************************");
            System.out.println("Choose a number: 1 Account Info, 2 Account Balance, 3 Deposit, 4 Withdraw, 5 Quit");
            choice = input.nextInt();
        }
    }
}
