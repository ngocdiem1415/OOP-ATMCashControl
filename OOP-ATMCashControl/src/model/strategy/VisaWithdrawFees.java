package model.strategy;

public class VisaWithdrawFees implements WithdrawalFees{
    @Override
    public double withdrawal_Fees() {
        return 0;
    }
}
