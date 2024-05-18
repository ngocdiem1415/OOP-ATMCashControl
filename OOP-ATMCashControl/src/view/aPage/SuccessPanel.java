package view.aPage;

import javax.swing.*;
import java.awt.*;

public class SuccessPanel extends AbstractPanel{
    JLabel label1,label2, choosen3;

    public SuccessPanel() {

        setLayout(null);

        label1 = new JLabel("SUCCESSFULL", JLabel.CENTER);
        label1.setBounds(40, 50, 400, 40);
        Font boldFont1 = new Font(label1.getFont().getName(), Font.BOLD, label1.getFont().getSize());
        label1.setFont(boldFont1);
        add(label1);

        label2 = new JLabel( "Please double check your funds before leaving");
        label2.setBounds(50, 50 + 30, 600, 40);
        add(label2);

        JLabel choosen3 = new JLabel("CLOSE", JLabel.RIGHT);
        choosen3.setBounds(355, 202 + 120, 120, 22);
        Font boldFont7 = new Font(choosen3.getFont().getName(), Font.BOLD, choosen3.getFont().getSize());
        choosen3.setFont(boldFont7);
        add(choosen3);
    }
}
