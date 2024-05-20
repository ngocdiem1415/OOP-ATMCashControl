package view.aPage;

import javax.swing.*;
import java.awt.*;

public class WithdrawPanel1 extends AbstractPanel {
    JLabel choosen0, choosen1, choosen2, choosen3, choosen4;
    public WithdrawPanel1() {
        setLayout(null);
        Font boldFont = new Font(null, Font.BOLD, 12);

        JLabel choosen0 = new JLabel("100.000 VND");
        choosen0.setBounds(10, 262 - 62 - 62, 100, 22);
        choosen0.setFont(boldFont);
        add(choosen0);

        JLabel choosen1 = new JLabel("200.000 VND");
        choosen1.setBounds(10, 262 - 62, 100, 22);
        choosen1.setFont(boldFont);
        add(choosen1);

        JLabel choosen2 = new JLabel("500.000 VND");
        choosen2.setBounds(10, 262, 100, 22);
        choosen2.setFont(boldFont);
        add(choosen2);

        JLabel choosen4 = new JLabel("1.000.000 VND", JLabel.RIGHT);
        choosen4.setBounds(360, 262 - 62 - 62, 120, 22);
        choosen4.setFont(boldFont);
        add(choosen4);

        JLabel choosen5 = new JLabel("2.000.000 VND", JLabel.RIGHT);
        choosen5.setBounds(360, 262 - 62, 120, 22);
        choosen5.setFont(boldFont);
        add(choosen5);

        JLabel choosen6 = new JLabel("OTHER", JLabel.RIGHT);
        choosen6.setBounds(360, 262, 120, 22);
        choosen6.setFont(boldFont);
        add(choosen6);

        JLabel choosen7 = new JLabel("BACK", JLabel.RIGHT);
        choosen7.setBounds(360, 262 + 62, 120, 22);
        choosen7.setFont(boldFont);
        add(choosen7);
    }
}
