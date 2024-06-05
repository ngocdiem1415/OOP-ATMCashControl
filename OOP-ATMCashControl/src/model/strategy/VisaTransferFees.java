package model.strategy;

import model.strategy.TransferFees;

public class VisaTransferFees implements TransferFees {
    @Override
    public double transfer_Fees() {
        return 0.0003;
    }
}
