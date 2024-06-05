package view;

import view.aPage.ChangePINPanel;
import view.aPage.TransferDetailsPanel1;
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

    //-----------------------------------------
    // show cac panel
    public ActionListener showChoosen() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showChoosenPanel();

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

    public ActionListener isWithdraw() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showWithdrawPanel();
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

    public ActionListener showTranferDetailPanel0() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePage.showTransferDetailsPanel0();
//                System.out.println("showTransferDetailsPanel0");
            }
        };
    }

    public ActionListener showTranferDetailPanel1() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    TransferDetailsPanel1.updataAccountToMakeDeposits(homePage, (TransferDetailsPanel1) homePage.transferDetailsPanel1);
                    homePage.showTransferDetailsPanel1();
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };
    }

    public ActionListener tranferDetails() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TransferDetailsPanel1.tranferInternal((TransferDetailsPanel1) homePage.transferDetailsPanel1)) {
                    homePage.showCompletePanel();
                }
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
                try {
                    if (ChangePINPanel.checkSynchronizationNewPIN((ChangePINPanel) homePage.changePINPanel)) {
                        homePage.showCompletePanel();
                    }
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };
    }

//-----------------------------------------
// chon so tien can rut

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

    public ActionListener isWithdrawAnyAmount() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WithdrawPanel2.isWithdrawAnyAmount(homePage, (WithdrawPanel2) homePage.withdrawPanel2);
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };
    }

}
