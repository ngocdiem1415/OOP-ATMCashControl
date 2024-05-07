package model;

import java.util.HashSet;
import java.util.Set;

public class ManagerAccount extends Observable {
    private static Set<AccountBank> accounts = new HashSet<AccountBank>();
    private AccountBank account;

    public ManagerAccount() {
        FactoryAttribute attribute = new FactoryAttribute();
    }

    //add Account
    public boolean add(AccountBank account) {
        boolean success = accounts.add(account);
        notifyObs();
        return success;
    }

    // delete Account
    public boolean remove(AccountBank account) {
        boolean success = accounts.remove(account);
        notifyObs();
        return success;
    }

    public String getCardNo(){
        return account.getId();
    }

    public String getUserName(){
        return account.getUserName();
    }

    //is check card and PIN
    public boolean verifyAccount(String PIN, String card){
        for (AccountBank account : accounts) {
            if ( account.getId().equals(card) && account.getPassWord().equals(PIN)) {
                this.account = account; // luu lai acc
                System.out.println("notify");
                notifyObs();
                return true;
            }
        }
        return false;
    }


    public double isBalance() {
        return account.getBalance();
    }
}
