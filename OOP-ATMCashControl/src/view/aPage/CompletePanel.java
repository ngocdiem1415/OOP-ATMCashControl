package view.aPage;

import javax.swing.*;
import java.awt.*;

public class ExchangeCompletePage extends AbstractPanel{
    JLabel complete, choosen7;
    public ExchangeCompletePage() {
        setLayout(null);

       complete = new JLabel("EXCHANGE COMPLETED!", JLabel.CENTER);
        complete.setBounds((int) (getSize().getWidth() / 2) - 100, getSize().height / 2, 200, 22);
        Font boldFont7 = new Font(complete.getFont().getName(), Font.BOLD, complete.getFont().getSize());
        complete.setFont(boldFont7);
        add(complete);

        choosen7 = new JLabel("BACK", JLabel.RIGHT);
        choosen7.setBounds(360, 262 + 62, 120, 22);
        Font boldFont8 = new Font(choosen7.getFont().getName(), Font.BOLD, choosen7.getFont().getSize());
        choosen7.setFont(boldFont8);
        add(choosen7);
    }
}
