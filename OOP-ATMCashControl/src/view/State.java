package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class State {
	final static Color background = new Color(32, 83, 117);
	final static Color green_button = new Color(60, 179, 113);
	final static Color clear_button = new Color(112, 128, 144);
	final static Color red_button = new Color(220, 20, 60);
	final static Color blue_button = new Color(0, 191, 255);
	final static Icon logo_big = new ImageIcon("libs/logo-big.png");
	public static MouseAdapter retureHomePage(JComponent c, JFrame main, HomePage homePage) { // if c was clicked , hide
		return new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				JFrame homePageFrame = homePage;
				if (e.getSource().equals(c)) {
					homePageFrame.setVisible(true);
					homePageFrame.setLocationRelativeTo(null);
					homePageFrame.setSize(1200, 700);
					main.setVisible(false);
				}
			}
		};

	}

}
