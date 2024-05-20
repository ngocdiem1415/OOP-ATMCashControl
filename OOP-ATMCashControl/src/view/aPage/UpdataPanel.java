package view.aPage;

import javax.swing.*;
import java.awt.*;

public class UpdataPanel extends AbstractPanel{
    JLabel lb, back;
    public UpdataPanel() {
        setLayout(null);

        lb = new JLabel("UPDATING ...", JLabel.CENTER);
        Font boldFont = new Font(lb.getFont().getName(), Font.BOLD, lb.getFont().getSize());
        lb.setBounds(10, 120, 500, 40);
        lb.setFont(boldFont);
        add(lb);

        back = new JLabel("BACK", JLabel.LEFT);
        back.setBounds(10, 202 + 120, 120, 22);
        Font boldFont2 = new Font(back.getFont().getName(), Font.BOLD, back.getFont().getSize());
        back.setFont(boldFont2);
        add(back);

    }
}
