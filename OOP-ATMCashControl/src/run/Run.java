package run;

import control.Controller;
import model.AccountBank;
import model.CreditCard;
import model.ManagerAccount;

import java.awt.*;

public class Run {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    ManagerAccount test = new ManagerAccount();
                    Controller controller = new Controller(test);

                    AccountBank a1 = new CreditCard("21130298", "vuxuanchien", "21130298", "XUAN CHIEN", "VU", 1000000.0);
                    AccountBank a2 = new CreditCard("21130299", "dovietcuong", "21130299", "VIET CUONG", "DO", 1200000.0);
                    AccountBank a3 = new CreditCard("21130300", "nguyencaocuong", "21130300", "CAO CUONG", "NGUYEN", 200000.0);
                    AccountBank a4 = new CreditCard("21130342", "ngoduchai", "21130342", "DUC HAI", "NGO", 5000000.0);
                    AccountBank a5 = new CreditCard("21154163", "vutruonghai", "21154163", "TRUONG HAI", "VU", 7950000.0);
                    AccountBank a6 = new CreditCard("21130279", "tranquibang", "21130279", "QUI BANG", "TRAN", 999999999.0);

                    AccountBank a7 = new CreditCard("1", "tranquibang", "1", "QUI BANG", "TRAN", 9999.0);
                    test.add(a7);

                    test.add(a1);
                    test.add(a2);
                    test.add(a3);
                    test.add(a4);
                    test.add(a5);
                    test.add(a6);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}