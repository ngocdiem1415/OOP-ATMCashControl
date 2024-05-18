package view;

import control.Controller;
import model.ManagerAccount;
import model.Observable;
import view.aPage.*;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements Observer {
    public static CardLayout card;
    public Login login;
    private Observable obs;
    private static Controller controller;
    private ImageSetting image;
    public JTextField textCard;
    private static JButton[] arrSelection;
    public static Container monitor;
    public ButtonListener btaction = new ButtonListener(this);

    public String cardNo = "";
    public String userName = "";
    public AbstractPanel introducePanel, choosenPanel, withdrawPanel, changePINPanel, checkBalancePanel, otherSevicesPanel, successPanel, exchangeCompletePanel;

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
        otherSevicesPanel = new UpdataPanel();
        changePINPanel = new ChangePINPanel(controller);
        withdrawPanel = new WithdrawPanel();
        successPanel = new SuccessPanel();
        exchangeCompletePanel = new ExchangeCompletePage();
        card = new CardLayout();

        textCard = new JTextField(60);
        monitor = getContentPane();
        monitor.setLayout(card);
        monitor.setBounds(188, 102, 491, 347);

        init(); // khoi tao
        initButtonForMonitor0();
        update();

    }

    public static void visible(HomePage homePage) {
        homePage.setVisible(false);
        homePage.login.setVisible(true);
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
        monitor.add("ChangePINPanel", changePINPanel);
        monitor.add("CheckBalancePanel", checkBalancePanel);
        monitor.add("OtherSevicesPanel", otherSevicesPanel);
        monitor.add("SuccessPanel", successPanel);
        monitor.add("ExchangeCompletePage", exchangeCompletePanel);
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

    public void initButtonForMonitor0() {
        arrSelection[7].addActionListener(btaction.showChoosen());
    }

    private void initButtonForMonitor1() {
        arrSelection[0].addActionListener(btaction.showCheckBalance());
        arrSelection[1].addActionListener(btaction.showWithDraw());
//        arrSelection[2].addActionListener(new ButtonListener.showIntrucduce());
        arrSelection[4].addActionListener(btaction.showUpdataPanel());
        arrSelection[5].addActionListener(btaction.showChangePIN());
        arrSelection[6].addActionListener(btaction.showUpdataPanel());
        arrSelection[7].addActionListener(btaction.logout());
    }


    public void initButtonForMonitor2() {
        arrSelection[0].addActionListener(btaction.isWithdrawOneHundredThousand());
        arrSelection[1].addActionListener(btaction.isWithdrawTwoHundredThousand());
        arrSelection[2].addActionListener(btaction.isWithdrawThreeHundredThousand());
        arrSelection[4].addActionListener(btaction.isWithdrawOneMillion());
        arrSelection[5].addActionListener(btaction.isWithdrawTwoMillion());
//        arrSelection[6].addActionListener();
        arrSelection[7].addActionListener(btaction.showChoosen());
    }

    private void initButtonForMonitor5() {
        arrSelection[3].addActionListener(btaction.showChoosen());
        arrSelection[7].addActionListener(btaction.checkChangePIN());
    }

    public void initButtonForMonitor6() {
        arrSelection[3].addActionListener(btaction.showChoosen());
    }

    private void initButtonForMonitor7() {
        arrSelection[7].addActionListener(btaction.logout());
    }

    public static void removeActionListeners() {
        for (int i = 0; i < arrSelection.length; i++) {
            for (ActionListener al : arrSelection[i].getActionListeners()) {
                arrSelection[i].removeActionListener(al);
            }
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

    public void showIntruducePanel() {
        card.show(monitor, "IntroducePanel");
        initButtonForMonitor0();
    }

    public void showChoosenPanel() {
        card.show(monitor, "ChoosenPanel");
        removeActionListeners();
        initButtonForMonitor1();
    }

    public void showWithDrawPanel() {
        card.show(monitor, "WithdrawPanel");
        System.out.println("show panel chuyen tien");
        removeActionListeners();
        initButtonForMonitor2();
    }

    public void showChangePIN() {
        card.show(monitor, "ChangePINPanel");
        System.out.println("show panel đoi ma PIN");
        removeActionListeners();
        initButtonForMonitor5();
    }

    public static void showMakeDepositsPanel() {
    }

    public void showOtherServicesPanel() {
        card.show(monitor, "OtherSevicesPanel");
        removeActionListeners();
        initButtonForMonitor6();
    }

    public void showCheckBalancePanel() {
        card.show(monitor, "CheckBalancePanel");
        removeActionListeners();
        initButtonForMonitor6();
    }

    public void showSuccessPanel() {
        card.show(monitor, "SuccessPanel");
        removeActionListeners();
        initButtonForMonitor7();
    }

    public void showExchangeCompletePanel() {
        card.show(monitor, "ExchangeCompletePage");
        removeActionListeners();
        initButtonForMonitor7();
    }
    public String checkBalance() {
        String balance = String.valueOf(controller.checkBalance());
        return balance;
    }


    public String getCardNo() {
        return controller.getCardNo();
    }

    public String getUserName() {
        return controller.getName();
    }

    public static void isWithDraw(double i) {
        if (!controller.checkWithdraw(i)) {
            String html = "The amount of money in your account is not enough to make the transaction";
            int w = 175;
            JOptionPane.showMessageDialog(null, String.format(html, w, w));
            JOptionPane.showMessageDialog(null, "The amount of money in your account is not enough to make the transaction",
                    "Notification",
                    JOptionPane.CLOSED_OPTION);
        } else {
            int output = JOptionPane.showConfirmDialog(null,
                    "The amount of money in your account is not enough to make the transaction",
                    "Notification",
                    JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                System.out.println("da rut duoc tien , chuyen sang panel khac");
//                showSuccessPanel();
                card.show(monitor, "SuccessPanel");
            } else if (output == JOptionPane.NO_OPTION) {
            }
        }
    }


    @Override
    public void update() {
        ManagerAccount manager = (ManagerAccount) obs;

        this.cardNo = manager.getCardNo();
        this.userName = manager.getUserName();

        System.out.println(cardNo + "update da duoc goi");
        textCard.setText(cardNo);
    }


    public void getData() {
        controller.getData();
    }
}
