package model;

public abstract class AccountBank {
    protected String id;
    protected String userName;
    protected String passWord;
    protected String firstName;
    protected String lastName;
    protected double accountBalance;

    public AccountBank(String id, String userName, String passWord, String firstName, String lastName, double accountBalance) {
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
        asw += "\n pwd: " + passWord;
        return asw;
    }

    public double getBalance() {
        return accountBalance;
    }


}
