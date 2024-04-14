package view;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class WelcomePanel extends AbstractPanel {
    JLabel label;
    public WelcomePanel() {
        this.setLayout(new BorderLayout());
        label = new JLabel("PLEASE INSERT YOUR CARD", JLabel.CENTER);
        Font boldFont = new Font(label.getFont().getName(), Font.BOLD, label.getFont().getSize());
        label.setFont(boldFont);
        this.add( label,BorderLayout.CENTER);

    }
}
