package view;

import control.Controller;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements Observer, ActionListener {
    private CardLayout card;
    private Observer obs;
    private Controller controller;
    private ImageSetting image;
    private String currentPanel = "";
    private JTextField textSTK;
    private JButton[] arrSelection;
    private JButton btnOk;
    private JPanel monitor;
    private AbstractPanel welcomePanel, pinRequestPanel, introducePanel, choosenPanel, withdrawPanel ;

    public MainPage(Observer obs, Controller control, ImageSetting image, MainPage login) {
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        this.controller = control;
        this.image = new ImageSetting();

        init(); // khoi tao
        update();
    }

    public MainPage() {
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        this.controller = controller;
        this.image = new ImageSetting();

        welcomePanel = new WelcomePanel();
        pinRequestPanel = new PinRequestPanel();
        introducePanel = new IntroducePanel();
        choosenPanel = new ChoosenPanel();
        withdrawPanel = new WithdrawPanel();
        card = new CardLayout();

        textSTK = new JTextField(60);
        btnOk = new JButton("OK");
        monitor = new JPanel();
        monitor.setLayout(card);
        monitor.setBounds(188, 102, 491, 347);

        init(); // khoi tao
        update();
        setVisible(true);

    }

    // main method
    public static void main(String[] args) {
        MainPage myATM = new MainPage();
    }

    private void init() {
        setSize(1157, 759);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage();
        setLookAndFeel();

//        --------------
//        monitor.add("WelcomePanel", welcomePanel);
//        monitor.add("PinRequestPanel", pinRequestPanel);
//        monitor.add("IntroducePanel", introducePanel);
//        monitor.add("ChoosenPanel", choosenPanel);
        add(monitor);
//        show("WelcomePage");

//        --------------------------------------
        textSTK.setBounds(940, 270, 140, 30);
        textSTK.setHorizontalAlignment(JPasswordField.CENTER);
        this.add(textSTK);

        btnOk.setBounds(975, 330, 65, 25);
        this.add(btnOk);

        // setBounds for buttons and add they
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
            this.add(arrSelection[i]);
        }

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

    public String getCurrentPage() {
        return currentPanel;
    }

    public boolean isWelcomePanel() {
        return getCurrentPage().equals("WelcomePanel") ? true : false;
    }

    public JTextField getTextSTK() {
        return this.textSTK;
    }

    public void setTextSTK() {
        this.textSTK = textSTK;
    }
}
