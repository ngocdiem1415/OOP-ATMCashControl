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

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        String asw = "";
        asw += "Account: " + id + " " + userName;
        asw += "\n First name: " + firstName + "\tLast name: " + lastName;
        return asw;
    }

    public double getBalance() {
        return accountBalance;
    }

    public double transferFees(){
        return transferFees.transfer_Fees();
    }

    public double withdrawalFees(){
        return withdrawalFees.withdrawal_Fees();
    }

    public abstract double isWithDraw(double i, int typeCard);
}