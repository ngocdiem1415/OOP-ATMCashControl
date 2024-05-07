package control;

import model.ManagerAccount;
import view.Login;

public class Controller {
    private ManagerAccount manager;
    private Login login;
    public Controller(ManagerAccount manager) {

        super();
        this.manager = manager;
        login = new Login(manager, this);
        login.setVisible(true);

    }
    public boolean isAccount(String PIN, String card){
        return manager.verifyAccount(PIN,card);
    }


    public double checkBalance(){
        return manager.isBalance();
    }
}

