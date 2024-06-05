package control;

public interface IController {
    boolean isCardAvailable(String card);
    boolean isAccount(String card, String PIN);
    double checkBalance();
    String getCardNo();
    String getName();
    boolean checkEnoughMoney(double i);
    boolean isTranferInternal(String card, double i);
    boolean changePIN(String newPIN);
//    void getData();
    boolean isWithDraw(double i);
    void logout();
}
