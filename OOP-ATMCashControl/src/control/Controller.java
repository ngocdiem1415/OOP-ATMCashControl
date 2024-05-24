package control;

import model.IManager;
import model.Observable;
import view.Login;

public class Controller implements IController{
    private IManager manager;
    private Login login;
    public Controller(IManager manager) {

        super();
        this.manager = manager;
        login = new Login((Observable) manager, this);
        login.setVisible(true);

    }

    public boolean isCardAvailable(String card) {
        return manager.isCardAvailable(card);
    }

    public boolean isAccount(String card, String PIN){
        return manager.verifyAccount(card,PIN);
    }


    public double checkBalance(){
        return manager.isBalance();
    }

    public String getCardNo() {
        return manager.getCardNo();
    }

    public String getName() {
        return manager.getUserName();
    }

    @Override
    public boolean checkEnoughMoney(double i) {
        return manager.checkEnoughMoney(i);
    }

    public boolean isDeductAmount(String card, double i) {
        return manager.isDeductAmount(card,i) ;
    }

    public boolean changePIN(String newPIN) {
//        System.out.println( manager.changePIN(newPIN));
        return manager.changePIN(newPIN);
    }

    public void getData() {
        manager.data();
    }

    @Override
    public boolean isWithDraw(double i,int typeCard) {
        return manager.isWithDraw(i,typeCard);
    }

    @Override
    public void logout() {
        manager.logout();
    }
}

