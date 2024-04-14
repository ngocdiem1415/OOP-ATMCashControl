package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PinRequestPanel extends AbstractPanel {
    JLabel label, choosen1, choosen2;
    private JPasswordField passwordField;
    public PinRequestPanel() {
        this.setLayout(null);

        label = new JLabel("PLEASE TYPE YOUR PIN CODE", JLabel.CENTER);
        label.setBounds(40, 100, 400, 40);
        Font boldFont1 = new Font(label.getFont().getName(), Font.BOLD, label.getFont().getSize());
        label.setFont(boldFont1);
        add(label);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 130, 200, 20);
        passwordField.setHorizontalAlignment(JPasswordField.CENTER);
        add(passwordField);

        choosen1 = new JLabel("CANCEL", JLabel.LEFT);
        choosen1.setBounds(5, 262 + 52, 120, 22);
        Font boldFont2 = new Font(choosen1.getFont().getName(), Font.BOLD, choosen1.getFont().getSize());
        choosen1.setFont(boldFont2);
        add(choosen1);

        choosen2 = new JLabel("ENTER", JLabel.RIGHT);
        choosen2.setBounds(360, 262 + 52, 120, 22);
        Font boldFont3 = new Font(choosen2.getFont().getName(), Font.BOLD, choosen2.getFont().getSize());
        choosen2.setFont(boldFont3);
        add(choosen2);

        choosen1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if ( e.getSource() == choosen1){
                    passwordField.setText("");
                }
            }
        });

    }
}
