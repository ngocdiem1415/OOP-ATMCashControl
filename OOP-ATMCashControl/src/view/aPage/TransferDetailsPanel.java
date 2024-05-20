package view.aPage;

import control.IController;

import javax.swing.*;
import java.awt.*;

public class TransferDetailsPanel extends AbstractPanel {
    JLabel lb1, lb2, lb3, lb4, enter, cancel;
    JTextField tf1, tf2;
    IController controller;

    public TransferDetailsPanel(IController controller) {
        this.controller = controller;
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

    public static boolean makeDeposit(TransferDetailsPanel transferDetailsPanel) {
        String card = transferDetailsPanel.tf1.getText();
        Double money = Double.valueOf(transferDetailsPanel.tf2.getText());
        String currentAccount = transferDetailsPanel.controller.getCardNo();
//        System.out.println(money);
        if (currentAccount.equals(card)) {
            JOptionPane.showMessageDialog(null, "You cannot enter duplicate cards", "Error",
                    JOptionPane.ERROR_MESSAGE);
            transferDetailsPanel.tf1.setText("");
            transferDetailsPanel.tf2.setText("");
        } else if (transferDetailsPanel.controller.isCardAvailable(card)) {
//            System.out.println("tai khaon dich " +card);
            return transferDetailsPanel.controller.isDeductAmount(card, money);
        } else {
            JOptionPane.showMessageDialog(null, "Card does not exist", "Error",
                    JOptionPane.ERROR_MESSAGE);
            transferDetailsPanel.tf1.setText("");
            transferDetailsPanel.tf2.setText("");
        }
        return false;
    }
}
