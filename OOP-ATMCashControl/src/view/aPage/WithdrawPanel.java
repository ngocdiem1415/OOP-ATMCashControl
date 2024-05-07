package view.aPage;

import javax.swing.*;

public class WithdrawPanel extends AbstractPanel {
    JLabel choosen0, choosen1, choosen2, choosen3, choosen4;
    public WithdrawPanel() {
        // TODO Auto-generated constructor stub
        JLabel choosen0 = new JLabel("100.000 VND");
        choosen0.setBounds(10, 262 - 62 - 62, 100, 22);
        add(choosen0);
        JLabel choosen1 = new JLabel("200.000 VND");
        choosen1.setBounds(10, 262 - 62, 100, 22);
        add(choosen1);
        JLabel choosen2 = new JLabel("500.000 VND");
        choosen2.setBounds(10, 262, 100, 22);
        add(choosen2);
        JLabel choosen3 = new JLabel("OTHER");
        choosen3.setBounds(10, 262 + 62, 100, 22);
        add(choosen3);
        JLabel choosen4 = new JLabel("1.000.000 VND", JLabel.RIGHT);
        choosen4.setBounds(360, 262 - 62 - 62, 120, 22);
        add(choosen4);
        JLabel choosen5 = new JLabel("2.000.000 VND", JLabel.RIGHT);
        choosen5.setBounds(360, 262 - 62, 120, 22);
        add(choosen5);
        JLabel choosen6 = new JLabel("BACK", JLabel.RIGHT);
        choosen6.setBounds(360, 262, 120, 22);
        add(choosen6);
        JLabel choosen7 = new JLabel("CANCEL", JLabel.RIGHT);
        choosen7.setBounds(360, 262 + 62, 120, 22);
        add(choosen7);
    }
}
