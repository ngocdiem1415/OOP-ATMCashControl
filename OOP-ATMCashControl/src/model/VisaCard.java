package model;

import model.strategy.VisaTransferFees;
import model.strategy.VisaWithdrawFees;

public class VisaCard extends Card{
    public VisaCard(String id, String userName, String passWord, String firstName,
                    String lastName, double accountBalance) {
        super(id, userName, passWord, firstName, lastName, accountBalance);
        transferFees = new VisaTransferFees();
        withdrawalFees= new VisaWithdrawFees();
    }

    public VisaCard() {
    }

}
