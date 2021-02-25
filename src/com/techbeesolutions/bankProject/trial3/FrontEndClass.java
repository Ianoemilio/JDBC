package com.techbeesolutions.bankProject.trial3;

import java.util.Scanner;

public class FrontEndClass {

    public static void main(String[] args) {


        //Scanner input = new Scanner(System.in);

        //BankUserDao user = new BankUserDao();
        BankUserDB userDB =  new BankUserDB();


        createUser newUser = new createUser();


        //newUser.create();

                                            /*DAO Method
        user.addUser(newUser);
        user.displayUser();
        System.out.println("Deposit: ");
        user.updateFundDeposit(newUser, new Integer(input.nextInt()));
        System.out.println("Withdrawal: ");
        user.updateFundWithdraw(newUser, new Integer(input.nextInt()));
        user.updateUserInfo(newUser,new String[]{"Ianu"});
        user.deleteUser(newUser);
        */

                                        //AWS DATABASE Method
        userDB.addUserDB(newUser);
        userDB.updateUserInfoDB(newUser);
        userDB.displayUserDB();
        userDB.deleteUserDB();
        //userDB.updateBankDeposit(newUser);

    }
}
