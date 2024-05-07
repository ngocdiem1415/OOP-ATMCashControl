package model;

public class FactoryAttribute {
    public FactoryAttribute() {
    }

    public static AccountBank createAccount(String id, String userName, String passWord, String firstName, String lastName, double accountBalance, int type) {
        AccountBank account = null;
        switch (type) {
            case 1:
                account = new CreditCard(id, userName, passWord, firstName, lastName, accountBalance);
            case 2:
            default:
        }
        return account;
    }
}
