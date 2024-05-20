package model;

import java.util.HashSet;
import java.util.Set;

public class ManagerAccount extends Observable implements IManager {
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

    public String getCardNo() {
        return account.getId();
    }

    public String getUserName() {
        return account.getUserName();
    }

    //is check card and PIN
    public boolean verifyAccount(String card, String PIN) {
        for (AccountBank account : accounts) {
            if (account.getId().equals(card) && account.getPassWord().equals(PIN)) {
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

    public boolean checkEnoughMoney(double i) {
        return isBalance() > i;
    }

    public boolean isDeductAmount(String recipientCard, double i) {
        if (checkEnoughMoney(i)) {
            account.setAccountBalance(account.getAccountBalance() - i);
            makeDeposit(recipientCard, i);
//            System.out.println("so du: " + isBalance());
            return true;
        } else {
            return false;
        }
    }

    public void makeDeposit(String recipientCard, double i) {
        AccountBank recipientAccount = null;
        for (AccountBank temp : accounts) {
            if (temp.getId().equals(recipientCard)) {
                recipientAccount = temp;
                recipientAccount.setAccountBalance(recipientAccount.getAccountBalance() + 1);
                System.out.println("so du tai khoan dich:" + recipientAccount.getAccountBalance());
            }
        }
    }

    public boolean changePIN(String newPIN) {
        this.account.setPassWord(newPIN);
        for (AccountBank temp : accounts) {
            if (temp.getId().equals(account.getId())) {
                temp.setPassWord(newPIN);
                return true;
            }
        }
        System.out.println("newPIN" + account.getPassWord());
        return false;
    }

    public void data() {
        System.out.println(accounts.toString());
    }

    @Override
    public boolean isWithDraw(double i) {
        if (checkEnoughMoney(i)) {
            account.setAccountBalance(account.getAccountBalance() - i);
            return true;
        }else{
            return false;
        }
    }

    public boolean isCardAvailable(String card) {
        for (AccountBank temp : accounts) {
            if (temp.getId().equals(card)) {
                System.out.println("hien trang tai khoan: " + temp.toString());
                return true;
            }
        }
        return false;
    }

}
