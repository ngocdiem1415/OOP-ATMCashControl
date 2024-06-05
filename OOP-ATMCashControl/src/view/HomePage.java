package view;

import control.IController;
import model.ManagerCard;
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
    private IController controller;
    private ImageSetting image;
    public JTextField textCard;
    private static JButton[] arrSelection;
    public static Container monitor;
    public ButtonListener btaction = new ButtonListener(this);
    public String cardNo = "",userName = "";
    public AbstractPanel introducePanel, choosenPanel, withdrawPanel1, withdrawPanel2, transferDetailsPanel0,
            changePINPanel, checkBalancePanel, otherSevicesPanel, transferDetailsPanel1, completePanel;

    public HomePage(Observable obs, IController control, Login login) {
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
        withdrawPanel1 = new WithdrawPanel1();
        withdrawPanel2 = new WithdrawPanel2(controller, this);
        transferDetailsPanel0 = new TransferDetailsPanel0();
        transferDetailsPanel1 = new TransferDetailsPanel1(controller, this);
        completePanel = new CompletePanel();
        card = new CardLayout();

        textCard = new JTextField(60);
        monitor = getContentPane();
        monitor.setLayout(card);
        monitor.setBounds(188, 102, 491, 347);

        init(); // khoi tao
        initButtonForMonitor0();//khoi tao action lan dau cho cac nut
        updata();

    }
    private void init() {
        setSize(1157, 759);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage();

//        --------------
        monitor.add("IntroducePanel", introducePanel);
        monitor.add("ChoosenPanel", choosenPanel);
        monitor.add("WithdrawPanel1", withdrawPanel1);
        monitor.add("WithdrawPanel2", withdrawPanel2);
        monitor.add("ChangePINPanel", changePINPanel);
        monitor.add("CheckBalancePanel", checkBalancePanel);
        monitor.add("OtherSevicesPanel", otherSevicesPanel);
        monitor.add("transferDetailsPanel0", transferDetailsPanel0);
        monitor.add("transferDetailsPanel1", transferDetailsPanel1);
        monitor.add("CompletePage", completePanel);
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
    //action button cho IntroducePanel
    private void initButtonForMonitor0() {
        arrSelection[7].addActionListener(btaction.showChoosen());
    }
    //action button cho ChoosenPanel
    private void initButtonForMonitor1() {
        arrSelection[0].addActionListener(btaction.showCheckBalance());
        arrSelection[1].addActionListener(btaction.isWithdraw());
        arrSelection[2].addActionListener(btaction.showUpdataPanel());
        arrSelection[4].addActionListener(btaction.showTranferDetailPanel0());
        arrSelection[5].addActionListener(btaction.showChangePIN());
        arrSelection[6].addActionListener(btaction.showUpdataPanel());
        arrSelection[7].addActionListener(btaction.logout());
    }

    //action button cho CheckBalancePanel
    public void initButtonForMonitor2() {
        arrSelection[3].addActionListener(btaction.showChoosen());
    }

    //action button cho WithdrawPanel1
    public void initButtonForMonitor4() {
        arrSelection[0].addActionListener(btaction.isWithdrawOneHundredThousand());
        arrSelection[1].addActionListener(btaction.isWithdrawTwoHundredThousand());
        arrSelection[2].addActionListener(btaction.isWithdrawThreeHundredThousand());
        arrSelection[4].addActionListener(btaction.isWithdrawOneMillion());
        arrSelection[5].addActionListener(btaction.isWithdrawTwoMillion());
        arrSelection[6].addActionListener(btaction.isWithdrawOther());
        arrSelection[7].addActionListener(btaction.showChoosen());
    }

    //action button cho WithdrawPanel2
    private void initButtonForMonitor8() {
        arrSelection[3].addActionListener(btaction.showChoosen());
        arrSelection[7].addActionListener(btaction.isWithdrawAnyAmount());
    }

    //action button cho TranferDetailPanel
    private void initButtonForMonitor5() {
        arrSelection[0].addActionListener(btaction.showTranferDetailPanel1());
        arrSelection[4].addActionListener(btaction.showUpdataPanel());
        arrSelection[3].addActionListener(btaction.showChoosen());
    }

    private void initButtonForMonitor6() {
        arrSelection[3].addActionListener(btaction.showChoosen());
        arrSelection[7].addActionListener(btaction.tranferDetails());
    }

    //action button cho ChangePINPanel
    private void initButtonForMonitor7() {
        arrSelection[3].addActionListener(btaction.showChoosen());
        arrSelection[7].addActionListener(btaction.checkChangePIN());
    }

    //action button logout cho tat ca panel
    private void initButtonForMonitorLogout() {
        arrSelection[7].addActionListener(btaction.logout());
    }

    //xoa action button dang su dung
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

    //------------------------------
    public void showChoosenPanel() {
        card.show(monitor, "ChoosenPanel");
        removeActionListeners();
        initButtonForMonitor1();
    }

    public void showWithdrawPanel() {
        card.show(monitor, "WithdrawPanel1");
        System.out.println("show panel rut tien1");
        removeActionListeners();
        initButtonForMonitor4();
    }

    public void showWithdrawPanel2() {
        card.show(monitor, "WithdrawPanel2");
        System.out.println("show panel rut tien2");
        removeActionListeners();
        initButtonForMonitor8();
    }

    public void showChangePIN() {
        card.show(monitor, "ChangePINPanel");
        System.out.println("show panel đoi ma PIN");
        removeActionListeners();
        initButtonForMonitor7();
    }

    public void showTransferDetailsPanel0() {
        card.show(monitor, "transferDetailsPanel0");
        removeActionListeners();
        initButtonForMonitor5();
//        System.out.println("show panel chuyen tien0");
    }

    public void showTransferDetailsPanel1() {
        card.show(monitor, "transferDetailsPanel1");
        removeActionListeners();
        initButtonForMonitor6();
    }

    public void showOtherServicesPanel() {
        card.show(monitor, "OtherSevicesPanel");
        removeActionListeners();
        initButtonForMonitor2();
    }

    public void showCheckBalancePanel() {
        card.show(monitor, "CheckBalancePanel");
        removeActionListeners();
        initButtonForMonitor2();
    }

    public void showCompletePanel() {
        card.show(monitor, "CompletePage");
        removeActionListeners();
        initButtonForMonitorLogout();
    }

//-------------------------------

    public String checkBalance() {
        String balance = String.valueOf(controller.checkBalance());
        return balance;
    }

    public void isWithDraw(double i) {
        if (controller.isWithDraw(i)) {
            System.out.println("da rut duoc tien , chuyen sang panel khac");
            showCompletePanel();
        } else {
            String html = "The amount of money in your account is not enough to make the transaction";
            int w = 175;
            JOptionPane.showMessageDialog(null, String.format(html, w, w));
        }
    }

    public String getCardNo() {
        return controller.getCardNo();
    }

    public String getUserName() {
        return controller.getName();
    }

    public void visible() {
        controller.logout();
        this.setVisible(false);
    }

    @Override
    public void updata() {
        ManagerCard manager = (ManagerCard) obs;

        this.cardNo = manager.getCardNo();
        this.userName = manager.getUserName();

        System.out.println(cardNo + "update da duoc goi");
        textCard.setText(cardNo);
    }

}
