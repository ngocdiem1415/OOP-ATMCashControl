package view.aPage;

import control.IController;
import view.HomePage;

import javax.swing.*;
import java.awt.*;

public class TransferDetailsPanel1 extends AbstractPanel {
    JLabel lb1, lb2, lb3, lb4, enter, cancel;
    JTextField tf1, tf2;
    IController controller;
    HomePage homePage;

    public TransferDetailsPanel1(IController controller, HomePage homePage) {
        this.controller = controller;
        this.homePage = homePage;
        setLayout(null);

        lb1 = new JLabel("Transfer Account: ");
        lb1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb1.setBounds(80, 80, 409, 44);
        this.add(lb1);

        lb2 = new JLabel();
        lb2.setBounds(190, 80, 250, 30);
        this.add(lb2);

        lb3 = new JLabel("Recipient Account: ");
        lb3.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb3.setBounds(80, 120, 250, 30);
        this.add(lb3);

        tf1 = new JTextField();
        tf1.setColumns(5);
        tf1.setBounds(190, 120, 250, 30);
        this.add(tf1);

        lb3 = new JLabel("The account owner enters the amount:  ");
        lb3.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb3.setBounds(80, 160, 250, 30);
        this.add(lb3);

        tf2 = new JTextField();
        tf2.setColumns(15);
        tf2.setBounds(120, 190, 250, 30);
        this.add(tf2);

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

    public static void updataAccountToMakeDeposits(HomePage homePage, TransferDetailsPanel1 transferDetailsPanel) {
        String card = homePage.getCardNo();
        transferDetailsPanel.lb2.setText(card);
    }

    public static boolean tranferInternal(TransferDetailsPanel1 transferDetailsPanel) {
        String card = transferDetailsPanel.tf1.getText();
        Double money = Double.valueOf(transferDetailsPanel.tf2.getText());
        String currentAccount = transferDetailsPanel.controller.getCardNo();
//        System.out.println(money);
        //kiem tra tai khoan chuyen tien va tai khoan nhan tien co giong nhau khong
        //bao loi
        if (currentAccount.equals(card)) {
            JOptionPane.showMessageDialog(null, "You cannot enter duplicate cards", "Error",
                    JOptionPane.ERROR_MESSAGE);
            transferDetailsPanel.tf1.setText("");
            transferDetailsPanel.tf2.setText("");
            //kiem tra tai khoan nhan tien co ton tai khong
            //bao loi neu khong ton tai
        } else if (transferDetailsPanel.controller.isCardAvailable(card)) {
            if ( !transferDetailsPanel.controller.checkEnoughMoney(money)) {
                JOptionPane.showMessageDialog(null, "The account doesn't have enough money", "Error",
                        JOptionPane.ERROR_MESSAGE);
                transferDetailsPanel.tf2.setText("");
            } else if ( money < 10000.0) {
                JOptionPane.showMessageDialog(null, "The minimum amount is 10 000", "Error",
                        JOptionPane.ERROR_MESSAGE);
                transferDetailsPanel.tf2.setText("");
            }else{
//            System.out.println("tai khaon dich " +card);
                return transferDetailsPanel.controller.isTranferInternal(card, money);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Card does not exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
            transferDetailsPanel.tf1.setText("");
            transferDetailsPanel.tf2.setText("");
        }
        return false;
    }
}
