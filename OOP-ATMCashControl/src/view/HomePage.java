package view;

import control.Controller;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements Observer, ActionListener {
    Login login;
    private Observer obs;
    private Controller controller;
    private ImageSetting image;
    private JPasswordField passwordField, changePasswordField;
    private JTextField textSTK;
    private JPanel monitor;
    private JButton[] arrSelection = new JButton[8];
    private JButton btnOk;

    public HomePage (Observer obs ,Controller control, ImageSetting image, Login login){
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        this.controller = control;
        this.image  = new ImageSetting();
        this.login = login;

        init(); // khoi tao
        update();
    }

    public HomePage()  {
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        this.controller = controller;
        this.image  = new ImageSetting();
        this.login = login;

        passwordField = new JPasswordField();
        changePasswordField = new JPasswordField();

        init(); // khoi tao
        update();
    }

    // main method
    public static void main(String[] args) {
        HomePage myATM = new HomePage( );
    }

    private void init() {
        setSize(1157, 759);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage();
//        getContentPane().setLayout(null);

//        --------------------------------------

        passwordField.setBounds(900, 130, 200, 20);
        passwordField.setHorizontalAlignment(JPasswordField.CENTER);
        this.add(passwordField);

        changePasswordField.setBounds(140, 130, 200, 20);
        changePasswordField.setHorizontalAlignment(JPasswordField.CENTER);
        this.add(changePasswordField);


        // setBounds for buttons and add they
        int n = arrSelection.length;
        for (int i = 0; i < n; i++) {
            arrSelection[i] = new JButton();
            arrSelection[i].setText(i + "");
            if (i < n / 2) {
                arrSelection[i].setBounds(80, 225 + i * 62, 78, 52);
            } else {
                arrSelection[i].setBounds(480 + 160 + 60 + 10, 225 + (i - n / 2) * 62, 78, 52);
            }
            this.add(arrSelection[i]);
        }
        setVisible(true);
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
        Image imageIcon = image.mainImage();
        Image image = imageIcon.getScaledInstance(1157, 759, Image.SCALE_SMOOTH);
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void update() {

    }
}
