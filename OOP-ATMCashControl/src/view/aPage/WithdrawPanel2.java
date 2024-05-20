package view.aPage;

import control.IController;
import view.HomePage;

import javax.swing.*;
import java.awt.*;

public class WithdrawPanel2 extends AbstractPanel{
    JLabel lb1, cancel, enter;
    public JTextField tf1;
    IController controller;
    HomePage homePage;
    public WithdrawPanel2(IController controller, HomePage homePage) {
        this.homePage = homePage;
        this.controller = controller;
        setLayout(null);

        lb1 = new JLabel("Enter the amount you want to withdraw:  ", JLabel.CENTER);
        lb1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb1.setBounds(120, 100, 250, 30);
        this.add(lb1);

        tf1 = new JTextField();
        tf1.setColumns(15);
        tf1.setBounds(120, 150, 250, 30);
        this.add(tf1);

        cancel = new JLabel("BACK", JLabel.LEFT);
        cancel.setBounds(10, 202 + 120, 120, 22);
        Font boldFont5 = new Font(cancel.getFont().getName(), Font.BOLD, cancel.getFont().getSize());
        cancel.setFont(boldFont5);
        add(cancel);

        enter = new JLabel("ENTER", JLabel.RIGHT);
        enter.setBounds(360, 202 + 120, 120, 22);
        Font boldFont7 = new Font(enter.getFont().getName(), Font.BOLD, enter.getFont().getSize());
        enter.setFont(boldFont7);
        add(enter);
    }

    public static void isWithdrawAnyAmount(HomePage homePage, WithdrawPanel2 withdrawPanel2) {
        double money = Double.parseDouble(withdrawPanel2.tf1.getText());
        System.out.println(money);
        homePage.isWithDraw(money);
    }
}
