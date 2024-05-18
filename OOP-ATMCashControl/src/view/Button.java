package view;

import javax.swing.*;

public class Button extends JButton {
    private static JButton[] arrSelection;

    public Button() {
        arrSelection = new JButton[8];
        int n = arrSelection.length;
        for (int i = 0; i < n; i++) {
            arrSelection[i] = new JButton();
            arrSelection[i].setText(i + "");
            if (i < n / 2) {
                arrSelection[i].setBounds(80, 225 + i * 62, 78, 52);
            } else {
                arrSelection[i].setBounds(480 + 160 + 60 + 10, 225 + (i - n / 2) * 62, 78, 52);
            }
        }
    }
}
