package model;

public class CreditCard extends AccountBank{
    private double accountBalance;

    public CreditCard(String id, String userName, String passWord, String firstName, String lastName, double accountBalance) {
        super(id, userName, passWord, firstName, lastName);
        this.accountBalance = accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }
}