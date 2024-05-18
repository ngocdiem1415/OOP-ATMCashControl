package view.aPage;

import javax.swing.*;
import java.awt.*;

public class ChoosenPanel extends AbstractPanel {
    public ChoosenPanel() {
        setLayout( null);
        JLabel title = new JLabel("Please select a transaction ", JLabel.CENTER);
        title.setBounds( 100,5,300, 100);
        Font boldFontT = new Font(title.getFont().getName(), Font.BOLD, title.getFont().getSize());
        title.setFont(boldFontT);
        add(title);

        JLabel choosen1 = new JLabel("CHECK BALANCE", JLabel.LEFT);
        choosen1.setBounds(10, 202 - 62, 120, 22);
        Font boldFont1 = new Font(choosen1.getFont().getName(), Font.BOLD, choosen1.getFont().getSize());
        choosen1.setFont(boldFont1);
        add(choosen1);

        JLabel choosen2 = new JLabel("WITHDRAW");
        choosen2.setBounds(10, 202, 100, 22);
        Font boldFont2 = new Font(choosen2.getFont().getName(), Font.BOLD, choosen2.getFont().getSize());
        choosen2.setFont(boldFont2);
        this.add(choosen2);

        JLabel choosen3 = new JLabel("MAKE DEPOSITS");
        choosen3.setBounds(10 , 202 + 62, 100, 22);
        Font boldFont3 = new Font(choosen3.getFont().getName(), Font.BOLD, choosen3.getFont().getSize());
        choosen3.setFont(boldFont3);
        add(choosen3);

        JLabel choosen4 = new JLabel("TRANSFER FUNDS");
        choosen4.setBounds(370 , 202 - 62, 120, 22);
        Font boldFont4 = new Font(choosen4.getFont().getName(), Font.BOLD, choosen4.getFont().getSize());
        choosen4.setFont(boldFont4);
        add(choosen4);

        JLabel choosen5 = new JLabel("CHANGE PIN");
        choosen5.setBounds(370 , 202 , 120, 22);
        Font boldFont5 = new Font(choosen5.getFont().getName(), Font.BOLD, choosen5.getFont().getSize());
        choosen5.setFont(boldFont5);
        add(choosen5);

        JLabel choosen6 = new JLabel("OTHER SERVICES");
        choosen6.setBounds(370, 202 + 62, 120, 22);
        Font boldFont6 = new Font(choosen6.getFont().getName(), Font.BOLD, choosen6.getFont().getSize());
        choosen6.setFont(boldFont6);
        add(choosen6);

        JLabel choosen7 = new JLabel("LOG OUT");
        choosen7.setBounds(370, 202 + 120, 120, 22);
        Font boldFont7 = new Font(choosen7.getFont().getName(), Font.BOLD, choosen7.getFont().getSize());
        choosen7.setFont(boldFont7);
        add(choosen7);
    }
}
