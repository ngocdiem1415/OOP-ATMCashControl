package view;

import control.Controller;
import control.IController;
import model.Observable;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {
    private ImageSetting image;
    private Observable obs;
    private IController controller;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JLabel lbtitle,lblIconUser, lbCard, lbPassword, lblLogin;
    private JButton btnLogin;
    private JPanel pnlMain;

    public Login(Observable obs, IController controller) {
        this.obs = obs;
        this.controller = controller;
        this.image = new ImageSetting();
        init();
        actionListener();
    }

    private void init() {
        setTitle("ATM");
        setBounds(100, 100, 650, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        pnlMain = new JPanel();
        pnlMain.setLayout(null);
        pnlMain.setBounds(10, 11, 614, 539);
        pnlMain.setBackground(State.background);
        getContentPane().add(pnlMain);

        lbtitle = new JLabel("WELCOME TO ATM");
        lbtitle.setForeground(Color.WHITE);
        lbtitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbtitle.setBounds(200, 160, 450, 40);
        pnlMain.add(lbtitle);

        lblIconUser = new JLabel("");
        lblIconUser.setIcon(image.loginImage());
        lblIconUser.setBounds(250, 10, 150, 150);
        pnlMain.add(lblIconUser);

        lbCard = new JLabel("Card No: ");
        lbCard.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbCard.setForeground(Color.WHITE);
        lbCard.setBounds(50, 232, 409, 44);
        pnlMain.add(lbCard);

        txtUsername = new JTextField();
        txtUsername.setText("22130038");
        txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
        txtUsername.setColumns(8);
        txtUsername.setBounds(170, 232, 409, 44);
        pnlMain.add(txtUsername);

        lbPassword = new JLabel("PIN: ");
        lbPassword.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lbPassword.setForeground(Color.WHITE);
        lbPassword.setBounds(50, 321, 409, 44);
        pnlMain.add(lbPassword);

        txtPassword = new JPasswordField();
        txtPassword.setText("22130038");
        txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
        txtPassword.setColumns(8);
        txtPassword.setBounds(170, 321, 409, 44);
        pnlMain.add(txtPassword);

        btnLogin = new JButton("LOGIN");
        btnLogin.setBackground(State.background);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusable(false);
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 23));
        btnLogin.setBounds(257, 422, 136, 44);
        btnLogin.setBorder(new LineBorder(Color.WHITE, 3));
        pnlMain.add(btnLogin);

        lblLogin = new JLabel("");
        lblLogin.setIcon(State.logo_big);
        lblLogin.setBounds(65, -40, 263, 251);
        pnlMain.add(lblLogin);

        // text action
        txtUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getSource() == txtUsername) {
                    txtUsername.setText("");
                }
            }
        });

        txtPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == txtPassword) {
                    txtPassword.setText("");
                }
            }
        });
    }

    private void actionListener() {
        // push the button Login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(btnLogin)) {
                    System.out.println(txtUsername.getText());
                    System.out.println(txtPassword.getText());
                    checkAccount();
                }
            }
        });
    }

    private void checkAccount() {
        if (controller.isAccount(txtUsername.getText(), txtPassword.getText())) {
            this.setVisible(false);

            HomePage homePage = new HomePage(obs, controller, this);
            homePage.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Card No or PIN is incorect",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void visible() {
        this.setVisible(true);
    }

}