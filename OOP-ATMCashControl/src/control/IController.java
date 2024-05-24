package control;

public interface IController {
    public boolean isCardAvailable(String card);
    public boolean isAccount(String card, String PIN);

    public double checkBalance();

    public String getCardNo();

    public String getName();
    boolean checkEnoughMoney(double i);

    public boolean isDeductAmount(String card,double i);

    public boolean changePIN(String newPIN);

    public void getData();

    boolean isWithDraw(double i,int typeCard);

    void logout();
}
