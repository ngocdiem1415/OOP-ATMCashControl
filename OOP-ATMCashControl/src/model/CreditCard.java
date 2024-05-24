package model;

import model.strategy.CreditTransferFees;
import model.strategy.CreditWithdrawFees;
import model.strategy.TransferFees;
import model.strategy.WithdrawalFees;

public class CreditCard extends Card {
    public CreditCard() {
    }

    public CreditCard(String id, String userName, String passWord, String firstName, String lastName, double accountBalance) {
        super(id, userName, passWord, firstName, lastName, accountBalance);
        transferFees = new CreditTransferFees();
        withdrawalFees = new CreditWithdrawFees();
    }

    @Override
    public double isWithDraw(double i, int typeCard) {
        double newBalance = this.getAccountBalance() -i - super.withdrawalFees();
        System.out.println(newBalance);
        return newBalance;
    }
}