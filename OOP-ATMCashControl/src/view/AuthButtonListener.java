package view;

import view.aPage.ChangePINPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface IButtonAction {
    public ActionListener logout();

    public ActionListener showChoosen();


    public ActionListener showIntrucduce();

    public ActionListener showUpdataPanel();

    public ActionListener showCheckBalance();

    public ActionListener showWithDraw();

    public ActionListener showMakeDeposits();

    public ActionListener isWithdrawOneHundredThousand();

    public ActionListener isWithdrawTwoHundredThousand();

    public ActionListener isWithdrawThreeHundredThousand();

    public ActionListener isWithdrawOneMillion();

    public ActionListener isWithdrawTwoMillion();

    public ActionListener showChangePIN();

    public ActionListener checkChangePIN();
}
