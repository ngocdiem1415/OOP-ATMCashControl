package model;

public interface IManager {
    public boolean isCardAvailable(String card);
    public boolean add(Card account);

    public boolean remove(Card account);

    public String getCardNo();

    public String getUserName();

    public boolean verifyAccount(String card, String PIN);

    public double isBalance();

    public boolean checkEnoughMoney(double i);

    public boolean isDeductAmount(String card, double i);

    public boolean changePIN(String newPIN);

    public void data();

    boolean isWithDraw(double i, int typeCard);

    void logout();
}

