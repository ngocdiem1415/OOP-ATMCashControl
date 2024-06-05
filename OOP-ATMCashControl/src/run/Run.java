package run;

import control.Controller;
import model.Card;
import model.CreditCard;
import model.ManagerCard;
import model.VisaCard;

import java.awt.*;

public class Run {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    ManagerCard test = new ManagerCard();
                    Controller controller = new Controller(test);

                    Card a1 = new CreditCard("22130038", "Nguyen Thi Ngoc Diem", "22130038", "Diem", "Nguyen", 1000000.0);
                    Card a2 = new CreditCard("1", "Nguyen Van Ba", "1", "Ba", "Nguyen", 1200000.0);
                    Card a3 = new CreditCard("2", "Nguyen Hoang Bich", "2", "Bich", "Nguyen", 200000.0);
                    Card a4 = new CreditCard("3", "Nguyen Van Dung", "3", "Dung", "Nguyen", 5000000.0);
                    Card a5 = new VisaCard("11", "Huynh Thi Hoa", "11", "Hoa", "Huynh", 7950000.0);
                    Card a6 = new VisaCard("12", "Tran Anh Thu", "12", "Thu", "Tran", 999999999.0);
                    Card a7 = new VisaCard("13", "Tran Thi Hue", "13", "Hue", "Tran", 99999.0);
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