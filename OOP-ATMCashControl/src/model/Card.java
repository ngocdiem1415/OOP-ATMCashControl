package model;

import model.strategy.TransferFees;
import model.strategy.WithdrawalFees;

public abstract class Card {
    protected String id;
    protected String userName;
    protected String passWord;
    protected String firstName;
    protected String lastName;
    protected double accountBalance;
    // lam viec voi interface
    protected TransferFees transferFees;
    protected WithdrawalFees withdrawalFees;
    public Card() {
    }
    public Card(String id, String userName, String passWord, String firstName, String lastName, double accountBalance) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }
    public boolean checkCardAvailable(String card) {
        return this.getId().equals(card) ? true: false;
    }

    public double isWithDraw(double i){
        double newBalance = this.getAccountBalance() -i - withdrawalFees.withdrawal_Fees();
        System.out.println(newBalance);
        return newBalance;
    }
    public double isDeductAmount(double i){
        double newBalance = this.getAccountBalance() -i - transferFees.transfer_Fees();
        accountBalance = newBalance;
        System.out.println(newBalance);
        return newBalance;
    }
    public void amountReceived(double i) {
        setAccountBalance(accountBalance + i );
    }


    @Override
    public String toString() {
        String asw = "";
        asw += "Account: " + id + " " + userName;
        asw += "\n First name: " + firstName + "\tLast name: " + lastName;
        return asw;
    }
}