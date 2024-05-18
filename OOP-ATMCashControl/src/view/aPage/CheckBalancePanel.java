package view.aPage;

import view.HomePage;

import javax.swing.*;
import java.awt.*;

public class CheckBalancePanel extends AbstractPanel{
    HomePage homePage;
    JLabel lbText,lbCardNo, lbName ,lbbalance, back;
    public CheckBalancePanel(HomePage homePage) {
        this.homePage = homePage;
        setLayout(null);

        lbText = new JLabel("TOTAL AVAILABLE BALANCE ");
        Font boldFont = new Font(lbText.getFont().getName(), Font.BOLD, lbText.getFont().getSize());
        lbText.setBounds(180, 50, 500, 40);
        lbText.setFont(boldFont);
        add(lbText);

        lbCardNo = new JLabel( "CardNo:   " +homePage.getCardNo());
        lbCardNo.setBounds(192, 100, 500, 40);
        Font boldFont2 = new Font(lbCardNo.getFont().getName(), Font.BOLD, lbCardNo.getFont().getSize());
        lbCardNo.setFont(boldFont2);
        add(lbCardNo);

        lbName = new JLabel("Customer:   " +homePage.getUserName(), JLabel.CENTER);
        lbName.setBounds(10, 120, 500, 40);
        Font boldFont3 = new Font(lbName.getFont().getName(), Font.BOLD, lbName.getFont().getSize());
        lbName.setFont(boldFont3);
        add(lbName);

        lbbalance = new JLabel(homePage.checkBalance() + " VND", JLabel.CENTER);
        lbbalance.setBounds(10, 180, 500, 40);
        Font boldFont4 = new Font(lbbalance.getFont().getName(), Font.BOLD, lbbalance.getFont().getSize());
        lbbalance.setFont(boldFont4);
        add(lbbalance);

        back = new JLabel("BACK", JLabel.LEFT);
        back.setBounds(10, 202 + 120, 120, 22);
        Font boldFont5 = new Font(back.getFont().getName(), Font.BOLD, back.getFont().getSize());
        back.setFont(boldFont5);
        add(back);


    }
}
