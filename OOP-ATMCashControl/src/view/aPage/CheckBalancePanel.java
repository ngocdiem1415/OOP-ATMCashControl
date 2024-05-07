package view.aPage;

import view.HomePage;

import javax.swing.*;
import java.awt.*;

public class CheckBalancePanel extends AbstractPanel{
    HomePage homePage;
    JLabel lb,lbbalance, back;
    public CheckBalancePanel(HomePage homePage) {
        this.homePage = homePage;
        setLayout(null);

        lb = new JLabel("Total available balance:", JLabel.CENTER);
        Font boldFont = new Font(lb.getFont().getName(), Font.BOLD, lb.getFont().getSize());
        lb.setBounds(10, 80, 500, 40);
        lb.setFont(boldFont);
        add(lb);

        lbbalance = new JLabel(homePage.checkBalance() + " VND", JLabel.CENTER);
        lbbalance.setBounds(10, 150, 120, 22);
        Font boldFont2 = new Font(lbbalance.getFont().getName(), Font.BOLD, lbbalance.getFont().getSize());
        lbbalance.setFont(boldFont2);
        add(lbbalance);

        back = new JLabel("BACK", JLabel.LEFT);
        back.setBounds(10, 202 + 120, 120, 22);
        Font boldFont3 = new Font(back.getFont().getName(), Font.BOLD, back.getFont().getSize());
        back.setFont(boldFont3);
        add(back);


    }
}
