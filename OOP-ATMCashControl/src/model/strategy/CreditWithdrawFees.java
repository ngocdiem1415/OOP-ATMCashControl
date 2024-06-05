package model.strategy;

public class CreditWithdrawFees implements WithdrawalFees{
    @Override
    public double withdrawal_Fees() {
        return 1000.0;
    }
}
