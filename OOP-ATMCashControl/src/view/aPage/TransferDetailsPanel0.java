package view.aPage;

import javax.swing.*;
import java.awt.*;

public class TransferDetailsPanel0 extends AbstractPanel{
    JLabel lb1, lb2, back;

    public TransferDetailsPanel0() {
        setLayout(null);

        lb1 = new JLabel("INTERNAL TRANSFER", JLabel.LEFT);
        lb1.setBounds(10, 202 - 62, 120, 22);
        Font boldFont1 = new Font(lb1.getFont().getName(), Font.BOLD, lb1.getFont().getSize());
        lb1.setFont(boldFont1);
        add(lb1);

        lb2 = new JLabel("TRANSFER FUNDS");
        lb2.setBounds(370 , 202 - 62, 120, 22);
        Font boldFont4 = new Font(lb2.getFont().getName(), Font.BOLD, lb2.getFont().getSize());
        lb2.setFont(boldFont4);
        add(lb2);

        back = new JLabel("BACK", JLabel.LEFT);
        back.setBounds(10, 202 + 120, 120, 22);
        Font boldFont5 = new Font(back.getFont().getName(), Font.BOLD, back.getFont().getSize());
        back.setFont(boldFont5);
        add(back);
    }
}
