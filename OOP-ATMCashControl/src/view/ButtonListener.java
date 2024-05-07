package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener {
    public static class showChoosen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            HomePage.showChoosenPanel();
        }
    }

    public static class showIntrucduce implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            HomePage.showIntruducePanel();
        }
    }

    public static class showOtherServices implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            HomePage.showOtherServicesPanel();
        }
    }

    public static class showCheckBalance implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            HomePage.showCheckBalancePanel();
        }
    }

    public static class showWithDraw implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            HomePage.showMakeDepositsPanel();
        }
    }

    public static class showMakeDeposits implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            HomePage.showMakeDepositsPanel();
        }
    }
}
