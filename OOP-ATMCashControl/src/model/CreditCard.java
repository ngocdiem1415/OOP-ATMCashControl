package model;

import model.strategy.CreditTransferFees;
import model.strategy.CreditWithdrawFees;

public class CreditCard extends Card {

    public CreditCard(String id, String userName, String passWord, String firstName,
                      String lastName, double accountBalance) {
        super(id, userName, passWord, firstName, lastName, accountBalance);
        transferFees = new CreditTransferFees();
        withdrawalFees = new CreditWithdrawFees();
    }
    public CreditCard() {
    }

}