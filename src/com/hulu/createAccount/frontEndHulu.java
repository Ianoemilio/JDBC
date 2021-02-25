package com.hulu.createAccount;

public class frontEndHulu { //main is where the front end is

    public static void main(String[] args) {

        NewAccount user1 = new NewAccount(); //whenever you call a class you have to use *new NewAccount()
        user1.setName("Iano");
        user1.setEmail("Iano@gmail.com");

        System.out.println(user1.getName());
        System.out.println(user1.getEmail());

        PlatinumUser platUser = new PlatinumUser();
        platUser.setName("Ianu");
        platUser.setEmail("ianu@gmail.com");
        platUser.setCcNumber(0);
    }
}
