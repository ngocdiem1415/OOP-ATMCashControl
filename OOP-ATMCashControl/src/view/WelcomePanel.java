package view;

import javax.swing.*;
import java.awt.*;

public class WelcomePage extends AbstractPage {
    public WelcomePage() {
        // TODO Auto-generated constructor stub
        this.setLayout(new BorderLayout());
        this.add(new JLabel("PLEASE INSERT YOUR CARD", JLabel.CENTER), BorderLayout.CENTER);

    }
}
