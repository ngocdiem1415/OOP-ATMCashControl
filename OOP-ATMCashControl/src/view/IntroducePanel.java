package view;

import javax.swing.*;
import java.awt.*;

public class IntroducePanel extends AbstractPanel{
    JLabel label1,label2, label3, label4, label5, continues;

    public IntroducePanel() {
        setLayout(null);

        label1 = new JLabel("BEFORE CONDUCTING A TRANCACTION, CUSTOMERS SHOULD:", JLabel.CENTER);
        label1.setBounds(40, 50, 400, 40);
        Font boldFont1 = new Font(label1.getFont().getName(), Font.BOLD, label1.getFont().getSize());
        label1.setFont(boldFont1);
        add(label1);

        label2 = new JLabel( "Observe the ATM carefully to detect if the machine has been fitted with data", JLabel.LEFT);
        label2.setBounds(20, 50 + 50, 600, 40);
        add(label2);

        label3 = new JLabel( " skimming devices.", JLabel.LEFT);
        label3.setBounds(18, 120, 600, 40);
        add(label3);

        label4 = new JLabel(" - Do not proceed with the transaction if anything seems unusual." , JLabel.LEFT);
        label4.setBounds(20, 155, 600, 40);
        add(label4);

        label5 = new JLabel(" - Call 1900333333 immediately to verify the processor." , JLabel.LEFT);
        label5.setBounds(20, 180, 600, 40);
        add(label5);

        continues = new JLabel("CONTINUES" , JLabel.RIGHT);
        continues.setBounds(360, 262 + 52, 120, 22);
        Font boldFont2 = new Font(continues.getFont().getName(), Font.BOLD, continues.getFont().getSize());
        continues.setFont(boldFont2);
        add(continues);
    }
}
