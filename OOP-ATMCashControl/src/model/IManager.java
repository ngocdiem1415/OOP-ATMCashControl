package model;

public interface IManager {
    boolean isCardAvailable(String card);

    boolean add(Card account);

    boolean remove(Card account);

    String getCardNo();

    String getUserName();

    boolean verifyAccount(String card, String PIN);

    double isBalance();

    boolean checkEnoughMoney(double i);

    boolean isTranferInternal(String card, double i);

    boolean changePIN(String newPIN);

    void data();

    boolean isWithDraw(double i);

    void logout();
}

