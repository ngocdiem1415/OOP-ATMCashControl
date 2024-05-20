package view;

import view.aPage.ChangePINPanel;
import view.aPage.TransferDetailsPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements AuthButtonListener {
    HomePage homePage;
    public ButtonListener(HomePage homePage) {
        this.homePage = homePage;
    }

    public ActionListener logout() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    homePage.setVisible(false);
                    homePage.login.visible();
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

    public ActionListener showWithDraw() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithDrawPanel();

            }
        };
    }

    public ActionListener showMakeDeposits() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithDrawPanel();

            }
        };
    }

    public ActionListener isWithdrawOneHundredThousand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(100000);

            }
        };
    }

    public ActionListener isWithdrawTwoHundredThousand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(200000);

            }
        };
    }

    public ActionListener isWithdrawThreeHundredThousand() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(300000);
            }
        };
    }

    public ActionListener isWithdrawOneMillion() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(1000000);

            }
        };
    }

    public ActionListener isWithdrawTwoMillion() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.isWithDraw(1000000);

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
}
