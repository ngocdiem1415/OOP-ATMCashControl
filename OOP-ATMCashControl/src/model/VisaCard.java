package model;

import model.strategy.TransferFees;
import model.strategy.VisaTransferFees;
import model.strategy.VisaWithdrawFees;
import model.strategy.WithdrawalFees;

public class VisaCard extends Card{

    public VisaCard() {
    }

    public VisaCard(String id, String userName, String passWord, String firstName, String lastName, double accountBalance) {
        super(id, userName, passWord, firstName, lastName, accountBalance);
        transferFees = new VisaTransferFees();
        withdrawalFees= new VisaWithdrawFees();
    }

    @Override
    public double isWithDraw(double i, int typeCard) {
        return 0;
    }
}
