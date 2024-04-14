package view;

import control.Controller;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements Observer, ActionListener {
    private Observer obs;
    private Controller controller;
    private ImageSetting image;
    private JTextField textSTK;
    private JButton[] arrSelection = new JButton[8];
    private JButton btnOk;
     WelcomePage monitor;

    public Login(Observer obs, Controller control, ImageSetting image, Login login) {
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        this.controller = control;
        this.image = new ImageSetting();

        init(); // khoi tao
        update();
    }

    public Login() {
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        this.controller = controller;
        this.image = new ImageSetting();

        textSTK = new JTextField(60);
        monitor = new WelcomePage();
        this.add(monitor);

        init(); // khoi tao
        update();

    }

    // main method
    public static void main(String[] args) {
        Login myATM = new Login();
    }

    private void init() {
        setSize(1157, 759);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage();
        setLookAndFeel();

//        --------------------------------------
        textSTK.setBounds(940, 270, 140, 30);
        textSTK.setHorizontalAlignment(JPasswordField.CENTER);
        this.add(textSTK);

        btnOk = new JButton("OK");
        btnOk.setBounds(975, 330, 70, 20);
        this.add(btnOk);

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
        JPanel content;
        setContentPane(content = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                // TODO Auto-generated method stub
                super.paintComponent(g);
                g.drawImage(image, 0, -10, null);
            }
        });
        content.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void update() {

    }
}
