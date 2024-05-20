package view.aPage;

import control.Controller;
import control.IController;

import javax.swing.*;
import java.awt.*;

public class ChangePINPanel extends AbstractPanel {
        JLabel lbtitle, lb2, lb3, lb4, back, enter;
       public JPasswordField pf1, pf2, pf3;
    IController controller;

    public ChangePINPanel(IController controller) {
        this.controller = controller;
        setLayout(null);

        lbtitle = new JLabel("CHANGE YOUR PIN ", JLabel.CENTER);
        lbtitle.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lbtitle.setBounds(40, 30, 400, 40);
        this.add(lbtitle);

        lb2 = new JLabel("PIN: ");
        lb2.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb2.setBounds(80, 80, 409, 44);
        this.add(lb2);

        pf1 = new JPasswordField();
        pf1.setColumns(8);
        pf1.setBounds(190, 80, 250, 30);
        this.add(pf1);

        lb3 = new JLabel("New PIN: ");
        lb3.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb3.setBounds(80, 120, 250, 30);
        this.add(lb3);

        pf2 = new JPasswordField();
        pf2.setColumns(8);
        pf2.setBounds(190, 120, 250, 30);
        this.add(pf2);

        lb4 = new JLabel("Re-Enter PIN: ");
        lb4.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb4.setBounds(80, 160, 250, 30);
        this.add(lb4);

        pf3 = new JPasswordField();
        pf3.setColumns(8);
        pf3.setBounds(190, 160, 250, 30);
        this.add(pf3);

        back = new JLabel("BACK", JLabel.LEFT);
        back.setBounds(10, 202 + 120, 120, 22);
        Font boldFont5 = new Font(back.getFont().getName(), Font.BOLD, back.getFont().getSize());
        back.setFont(boldFont5);
        add(back);

        enter = new JLabel("ENTER", JLabel.RIGHT);
        enter.setBounds(360, 202 + 120, 120, 22);
        Font boldFont7 = new Font(enter.getFont().getName(), Font.BOLD, enter.getFont().getSize());
        enter.setFont(boldFont7);
        add(enter);

    }

    public static boolean checkSynchronizationNewPIN(ChangePINPanel changePINPanel) {
        String newpin = String.valueOf(changePINPanel.pf2.getPassword());
        String re_newPIN = String.valueOf(changePINPanel.pf3.getPassword());
        if(  re_newPIN.equals(newpin)){
            return changePINPanel.controller.changePIN(newpin);
        }else {
            JOptionPane.showMessageDialog(null, "New PIN are not synchronized. Enter new PIN", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
