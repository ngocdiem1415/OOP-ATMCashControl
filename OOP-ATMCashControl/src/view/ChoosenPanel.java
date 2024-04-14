package view;

import javax.swing.*;

class ChoosenPage extends AbstractPage {
    JLabel choosen1, choosen2, choosen3, choosen4;
    public ChoosenPage() {
        // TODO Auto-generated constructor stub
        choosen1 = new JLabel("WITHDRAW");
        choosen1.setBounds(10, 262, 100, 22);
        this.add(choosen1);

        choosen2 = new JLabel("CHANGE PIN");
        choosen2.setBounds(10, 262 + 62, 100, 22);
        add(choosen2);

        choosen3 = new JLabel("CHECK ACCOUNT", JLabel.LEFT);
        choosen3.setBounds(10, 262 - 62, 120, 22);
        add(choosen3);

        choosen4 = new JLabel("CANCEL", JLabel.RIGHT);
        choosen4.setBounds(360, 262 + 62, 120, 22);
        add(choosen4);
    }
}
