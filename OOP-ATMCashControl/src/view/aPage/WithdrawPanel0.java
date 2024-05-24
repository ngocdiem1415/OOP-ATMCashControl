package view.aPage;

import javax.swing.*;
import java.awt.*;

public class WithdrawPanel0 extends AbstractPanel{
    JLabel lb0, lb1;

    public WithdrawPanel0() {
        setLayout(null);
        lb0 = new JLabel("Credit card: ");
        lb0.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb0.setBounds(80, 80, 409, 44);
        this.add(lb0);

        lb1 = new JLabel("Visa card: ");
        lb1.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lb1.setBounds(80, 120, 250, 30);
        this.add(lb1);
    }
}
