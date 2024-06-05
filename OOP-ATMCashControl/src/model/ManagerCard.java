package model;

import java.util.HashSet;
import java.util.Set;

public class ManagerCard extends Observable implements IManager {
    private static Set<Card> accounts = new HashSet<Card>(); //ds cac tk
    private Card account;
    public ManagerCard() {
        FactoryAttribute attribute = new FactoryAttribute();
    }
    //add Account
    public boolean add(Card account) {
        boolean success = accounts.add(account);
        notifyObs();
        return success;
    }
    // delete Account
    public boolean remove(Card account) {
        boolean success = accounts.remove(account);
        notifyObs();
        return success;
    }
    //is check card and PIN
    public boolean verifyAccount(String card, String PIN) {
        for (Card account : accounts) {
            if (account.getId().equals(card) && account.getPassWord().equals(PIN)) {
                this.account = account; // luu lai acc
//                System.out.println("notify");
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
        return isBalance() > (i + 30000.0);
    }

    public boolean changePIN(String newPIN) {
        this.account.setPassWord(newPIN);
        for (Card temp : accounts) {
            if (temp.getId().equals(account.getId())) {
                temp.setPassWord(newPIN);
                return true;
            }
        }
        System.out.println("newPIN" + account.getPassWord());
        return false;
    }

    @Override
    public boolean isWithDraw(double i) {
        if (checkEnoughMoney(i)) {
            account.setAccountBalance(account.isWithDraw(i));
            return true;
        } else {
            return false;
        }
    }
    public boolean isTranferInternal(String recipientCard, double i) {
        account.isDeductAmount(i); // tru so tien da chuyen cua tk chuyen tien
        amountReceived(recipientCard, i); // cong so tien da chuyen vao tk nhan
//            System.out.println("so du: " + isBalance());
        return true;
    }
    public void amountReceived(String recipientCard, double i) {
        //tien tk nhan tien va set lai balance
        Card recipientAccount = null;
        for (Card temp : accounts) {
            if (temp.getId().equals(recipientCard)) {
                recipientAccount = temp;
                recipientAccount.amountReceived(i);
                System.out.println("so du tai khoan dich:" + recipientAccount.getAccountBalance());
            }
        }
    }

    public boolean isCardAvailable(String card) {
        for (Card temp : accounts) {
            if (temp.checkCardAvailable(card)) {
                System.out.println("hien trang tai khoan: " + temp.toString());
                return true;
            }
        }
        return false;
    }

    public void data() {
        System.out.println(accounts.toString());
    }

    @Override
    public void logout() {
        account = null;
    }

    public String getCardNo() {
        return account.getId();
    }

    public String getUserName() {
        return account.getUserName();
    }
}
