package model.strategy;

public class CreditTransferFees implements TransferFees{
    @Override
    public double transfer_Fees() {
        return 0.0005;
    }
}
