package view;

import view.aPage.ChangePINPanel;
import view.aPage.TransferDetailsPanel;
import view.aPage.WithdrawPanel2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener {
    HomePage homePage;
    int typeCard;
    public ButtonListener(HomePage homePage) {
        this.homePage = homePage;
        this.typeCard = -1;
    }

    public ActionListener logout() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    homePage.visible();
                    homePage.login.visible();
                    typeCard = -1;
//                homePage.getData();
            }
        };
    }

    public ActionListener showChoosen() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showChoosenPanel();

            }
        };
    }


    public ActionListener showIntrucduce() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showIntruducePanel();
            }
        };
    }

    public ActionListener showUpdataPanel() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showOtherServicesPanel();
            }
        };
    }

    public ActionListener showCheckBalance() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showCheckBalancePanel();

            }
        };
    }

    public ActionListener showWithDraw0() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithDrawPanel0();

            }
        };
    }

    public ActionListener showWithDraw1() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithDrawPanel1();

            }
        };
    }

    public ActionListener showMakeDeposits() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithDrawPanel1();

            }
        };
    }

    public ActionListener isWithdrawOneHundredThousand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(100000,typeCard);

            }
        };
    }

    public ActionListener isWithdrawTwoHundredThousand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(200000,typeCard);

            }
        };
    }

    public ActionListener isWithdrawThreeHundredThousand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(300000,typeCard);
            }
        };
    }

    public ActionListener isWithdrawOneMillion() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(1000000,typeCard);

            }
        };
    }

    public ActionListener isWithdrawTwoMillion() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(1000000,typeCard);

            }
        };
    }

    public ActionListener showChangePIN() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showChangePIN();
            }
        };
    }

    public ActionListener checkChangePIN() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ChangePINPanel.checkSynchronizationNewPIN((ChangePINPanel) homePage.changePINPanel)){
                    homePage.showCompletePanel();
                };
            }
        };
    }

    public ActionListener showMakeDepositPanel() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showMakeDepositsPanel1();
            }
        };
    }

    public ActionListener showTransferDetails() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransferDetailsPanel.updataAccountToMakeDeposits(homePage, (TransferDetailsPanel) homePage.transferDetailsPanel);
                homePage.showMakeDepositsPanel2();
            }
        };
    }

    public ActionListener makeDeposit() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TransferDetailsPanel.makeDeposit((TransferDetailsPanel) homePage.transferDetailsPanel)) {
                    homePage.showCompletePanel();
                }
            }
        };
    }

    public ActionListener isWithdrawOther() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithdrawPanel2();
            }
        };
    }

    public ActionListener isWithdrawAnyAmount() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WithdrawPanel2.isWithdrawAnyAmount(homePage, (WithdrawPanel2) homePage.withdrawPanel2,typeCard);
            }
        };
    }

    public ActionListener getCommand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithDrawPanel1();
//                typeCard = Integer.parseInt(e.getActionCommand());
                System.out.println(typeCard);
            }
        };
    }
}
