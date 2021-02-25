package com.techbeesolutions.bankProject.trial3;

public class fundTransfers extends BankUserModel {

    private float depositAmount;
    private float withdrawAmount;

    public float getWithdrawAmount() { //i created getters for these but these aren't being used.
        return withdrawAmount;
    }

    public void setWithdrawAmount(float withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
        if (withdrawAmount > this.getBalance()) {
            System.out.println("Insufficient Funds");
        }
        else {
            this.setBalance(this.getBalance() - withdrawAmount);
        }
    }

    public float getDepositAmount() {   //Maybe it can be used to show the history of deposits and withdrawals
        return depositAmount;
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
        this.setBalance(depositAmount+this.getBalance());
    }
}
