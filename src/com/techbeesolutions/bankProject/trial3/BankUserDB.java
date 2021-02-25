package com.techbeesolutions.bankProject.trial3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BankUserDB {
    Scanner input = new Scanner(System.in);

    ArrayList<BankUserModel> UserAccounts = new ArrayList<>();

    public void addUserDB(BankUserModel user) {                         //Insert

        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://usersdb.ctlcmd5kzm5e.us-west-1.rds.amazonaws.com:3306/UserDB";
        final String USER = "admin";
        final String PASS = "UnlimitedPower!";

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement stmt = conn.createStatement();

            System.out.println("1");


            String sql = "INSERT INTO userTable VALUES (" +
                    "'"+user.getBalance()+"', " +
                    "'"+user.getfName()+"', " +
                    "'"+user.getlName()+"', " +
                    "'"+user.getEmail()+"', " +
                    "'"+user.getAccNumber()+"', " +
                    "'"+user.getPhoneNum()+"');";


            System.out.println("2");

            //Does this mean i only need to include *input here and don't need to use the createUser class file?


            stmt.executeUpdate(sql);
            System.out.println("********************************");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteUserDB() {                      //Remove
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://usersdb.ctlcmd5kzm5e.us-west-1.rds.amazonaws.com:3306/UserDB";
        final String USER = "admin";
        final String PASS = "UnlimitedPower!";

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Choose Email Account to Delete: ");
            String inp = input.nextLine();

            String sql = "delete from userTable where Email = " +"'"+ inp +"'"+ ";";
            Statement stmt = conn.createStatement();

            System.out.println("Deleted: " + inp);


            stmt.executeUpdate(sql);
            System.out.println("********************************");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void updateUserInfoDB(BankUserModel user) {                      //Update
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://usersdb.ctlcmd5kzm5e.us-west-1.rds.amazonaws.com:3306/UserDB";
        final String USER = "admin";
        final String PASS = "UnlimitedPower!";

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "Update userTable set FirstName = " + "'"+ input.nextLine() +"'"+ "\n where email = " +"'"+ user.getEmail() +"'"+ ";";
            Statement stmt = conn.createStatement();


            stmt.executeUpdate(sql);
            System.out.println("********************************");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public void displayUserDB() {                                           //Display
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://usersdb.ctlcmd5kzm5e.us-west-1.rds.amazonaws.com:3306/UserDB";
        final String USER = "admin";
        final String PASS = "UnlimitedPower!";

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "select * from UserDB.userTable;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
            }

            System.out.println("********************************");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    public void updateBankDeposit(BankUserModel user) {                                           //Display
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://usersdb.ctlcmd5kzm5e.us-west-1.rds.amazonaws.com:3306/UserDB";
        final String USER = "admin";
        final String PASS = "UnlimitedPower!";

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "select * from UserDB.userTable;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            float value = input.nextFloat();

            while (rs.next()) {
                float newBal = rs.getInt(1) + value;
                System.out.println(newBal);                         //Balance
            }




            sql = "update userTable set Balance = " + newBal +" where Email = " +"'"+ user.getEmail() +"'"+ ";";
            stmt = conn.createStatement();

            //stmt.executeUpdate(sql);
            System.out.println("********************************");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/

}
