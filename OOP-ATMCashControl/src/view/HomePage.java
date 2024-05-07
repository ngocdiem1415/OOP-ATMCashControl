package view;

import control.Controller;
import model.ManagerAccount;
import model.Observable;
import view.aPage.*;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class HomePage extends JFrame implements Observer{
    public static CardLayout card;
    private Login login;
    private Observable obs;
    private static Controller controller;
    private ImageSetting image;
    private JTextField textCard;
    private static JButton[] arrSelection;
    public static Container monitor;

    private String cardNo = "";
    private String userName = "";

    private AbstractPanel introducePanel, choosenPanel, withdrawPanel, checkBalancePanel, otherSevices;

    public HomePage(Observable obs, Controller control, Login login) {
        super("ATM");
        setLookAndFeel();
        this.obs = obs;
        obs.addObs(this);
        this.controller = control;
        this.image = new ImageSetting();
        this.login = login;


        introducePanel = new IntroducePanel();
        choosenPanel = new ChoosenPanel();
        checkBalancePanel = new CheckBalancePanel(this);
        otherSevices = new OtherSevices();
        withdrawPanel = new WithdrawPanel();
        card = new CardLayout();

        textCard = new JTextField(60);
        monitor = getContentPane();
        monitor.setLayout(card);
        monitor.setBounds(188, 102, 491, 347);

        init(); // khoi tao
        initButtonForMonitor0();
        update();

    }

    private void init() {
        setSize(1157, 759);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage();

////        --------------
        monitor.add("IntroducePanel", introducePanel);
        monitor.add("ChoosenPanel", choosenPanel);
        monitor.add("WithdrawPanel", withdrawPanel);
        monitor.add("CheckBalancePanel", checkBalancePanel);
        monitor.add("OtherSevicesPanel", otherSevices);
//        monitor.add("OtherSevices", otherSevices);
        add(monitor);

//        --------------------------------------
        textCard.setBounds(940, 270, 140, 30);
        textCard.setHorizontalAlignment(JPasswordField.CENTER);
        this.add(textCard);

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

    //        --------------------------------------

    public static void initButtonForMonitor0(){
        arrSelection[7].addActionListener(new ButtonListener.showChoosen());
    }

    private static void initButtonForMonitor1() {
        arrSelection[0].addActionListener(new ButtonListener.showCheckBalance());
//        arrSelection[1].addActionListener(new ButtonListener.showIntrucduce());
//        arrSelection[2].addActionListener(new ButtonListener.showIntrucduce());
//        arrSelection[4].addActionListener(new ButtonListener.showIntrucduce());
//        arrSelection[5].addActionListener(new ButtonListener.showIntrucduce());
        arrSelection[6].addActionListener(new ButtonListener.showOtherServices());
        arrSelection[7].addActionListener(new ButtonListener.showIntrucduce());
    }

    public static void initButtonForMonitor6() {
        arrSelection[3].addActionListener(new ButtonListener.showChoosen());

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

    public static void showIntruducePanel() {
        card.show(monitor, "IntroducePanel");
        System.out.println("chay cancel");
        initButtonForMonitor0();
    }

    public static void showChoosenPanel() {
        card.show(monitor, "ChoosenPanel");
        initButtonForMonitor1();
    }

    public static void showMakeDepositsPanel() {
    }

    public static void showOtherServicesPanel() {
        card.show(monitor, "OtherSevicesPanel");
        initButtonForMonitor6();
    }
    public static void showCheckBalancePanel() {
        card.show(monitor, "CheckBalancePanel");
        initButtonForMonitor6();
    }

    public String checkBalance(){
        String balance = String.valueOf(controller.checkBalance());
        return balance;
    }
    @Override
    public void update() {
        ManagerAccount manager = (ManagerAccount) obs;

        this.cardNo = manager.getCardNo();
        this.userName = manager.getUserName();

        System.out.println(cardNo + "update da duoc goi");
        textCard.setText(cardNo);
    }
}
