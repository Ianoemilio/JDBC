package com.hulu.createAccount;

public class NewAccount {

    private String email;
    private String password;
    private String name;
    private int bDay;
    private int bYear;
    private int bMonth;
    private int ssn = 123;
    private int ccNumber = 54324;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbDay() {
        return bDay;
    }

    public void setbDay(int bDay) {
        this.bDay = bDay;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public int getbMonth() {
        return bMonth;
    }

    public void setbMonth(int bMonth) {
        this.bMonth = bMonth;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void updateEmail() {

        email = "iano@gmail.com";
    }
}
