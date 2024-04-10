package view;

import control.Controller;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Main extends JFrame implements Observer, ActionListener {
    //    Controller control;
    ImageSetting image = new ImageSetting();
//
//    public Main(Controller control, ImageSetting image) throws HeadlessException {
//        this.control = control;
//        this.image = image;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//
    @Override
    public void update() {

    }


    private CardLayout card;
    private JPasswordField passwordField;
    private JPasswordField changePasswordField;
    private JTextField textSTK;
    private JPanel monitor;
    private JButton[] arrSelection = new JButton[8];
    private JButton btnOk;

    // main method
    public static void main(String[] args) {
        Main myATM = new Main( );
        myATM.setTitle("ATM BIDV ĐH NÔNG LÂM");
    }

    public Main() {
        setLookAndFeel();
        changePasswordField = new JPasswordField();
        passwordField = new JPasswordField();
        card = new CardLayout();
    }

    public void addActionListener(ActionListener ac) {
        for (JButton jButton : arrSelection) {
            jButton.addActionListener(ac);
        }
        btnOk = new JButton("OK");
        btnOk.setBounds(940, 340, 140, 20);
        btnOk.addActionListener(ac);
        textSTK.setBounds(940, 275, 140, 24);
        textSTK.addActionListener(ac);
        add(monitor);
        add(btnOk);
        add(textSTK);
        repaint();
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }

    private void setIconImage() {
        ImageIcon imageIcon = new ImageIcon(".\\images\\abccc.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1157, 759, Image.SCALE_SMOOTH);
        setIconImage(image);
        JPanel contet;
        setContentPane(contet = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                // TODO Auto-generated method stub
                super.paintComponent(g);
                g.drawImage(image, 0, -10, null);
            }
        });
        contet.setLayout(null);

    }

    public JTextField getTextSTK() {
        return this.textSTK;
    }

    public String getMonitor() {
        String str = "";
        int n = monitor.getComponentCount();
        for (int i = 0; i < n; i++) {
            if (monitor.getComponent(i).isShowing()) {
                str = monitor.getComponent(i).toString();
                break;
            }
        }
        char[] x = str.toCharArray();
        int batdau = 0;
        int ketthuc = 0;
        int m = x.length;
        for (int i = 0; i < m; i++) {
            if (x[i] == '.') {
                batdau = i + 1;
            } else if (x[i] == '[') {
                ketthuc = i;
                break;
            }
        }
        System.out.println(str.substring(batdau, ketthuc));
        return str.substring(batdau, ketthuc);
    }

    public String getChangePIN() {
        String newPass = "";
        char[] x = changePasswordField.getPassword();
        for (char c : x) {
            newPass += c;
        }
        return newPass;
    }

    public JPasswordField getChangePasswordField() {
        return changePasswordField;
    }

    public String getPass() {
        String str = "";
        char[] x = passwordField.getPassword();
        for (char c : x) {
            str += c;
        }
        passwordField.setText("");
        passwordField.requestFocus();
        return str;
    }

    public JPasswordField getPasswordField() {

        return passwordField;
    }

    public void showWelcomePage() {
        this.show("WelcomePage");
        textSTK.requestFocus();
    }

    public void showChoosenPage() {
        this.show("ChoosenPage");
    }

    public void showWithdrawPage() {
        this.show("WithdrawPage");
    }

    public void showCheckAccountPage() {
        this.show("CheckAccountPage");
    }

    public void showChangePinPage() {
        this.show("ChangePinPage");
        changePasswordField.requestFocus();
    }

    public void showPinRequestPage() {
        this.show("PinRequestPage");
        passwordField.requestFocus();
    }

    public boolean isWelcomePage() {
        return getCurrentPage().equals("WelcomePage") ? true : false;
    }

    public boolean isOtherExchangePage() {
        return getCurrentPage().equals("OtherExchangePage") ? true : false;
    }

    public boolean isChoosenPage() {
        return getCurrentPage().equals("ChoosenPage") ? true : false;
    }

    public boolean isWithdrawPage() {
        return getCurrentPage().equals("WithdrawPage") ? true : false;
    }

    public boolean isChangePINPage() {
        return getCurrentPage().equals("ChangePinPage") ? true : false;
    }

    public boolean isCheckAccountPage() {
        return getCurrentPage().equals("CheckAccountPage") ? true : false;
    }

    public boolean isExchangeCompletedPage() {
        return getCurrentPage().equals("ExchangeCompletePage") ? true : false;
    }

    public boolean isExchangeFailedPage() {
        return getCurrentPage().equals("ExchangeFailedPage") ? true : false;
    }

    // cac phuong thuc su dung de chuyen doi giua cac container;
    public void next() {
        card.next(monitor);
    }

    public void previous() {
        card.previous(monitor);
    }

    private String currentPage = "";

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage() {
        currentPage = getMonitor();
    }

    public void show(String name) {
        card.show(monitor, name);
        setCurrentPage();
    }

    public void showExchangeFailedPage() {
        // TODO Auto-generated method stub
        this.show("ExchangFailedPage");
    }

    public boolean isPinRequestPage() {
        // TODO Auto-generated method stub
        if (getCurrentPage().equals("PinRequestPage")) {
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
