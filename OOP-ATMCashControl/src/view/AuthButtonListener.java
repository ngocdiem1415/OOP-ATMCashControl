package view;

import java.awt.event.ActionListener;

public interface AuthButtonListener {
    public ActionListener logout();

    public ActionListener isWithdrawOneHundredThousand();

    public ActionListener isWithdrawTwoHundredThousand();

    public ActionListener isWithdrawThreeHundredThousand();

    public ActionListener isWithdrawOneMillion();

    public ActionListener isWithdrawTwoMillion();
    public ActionListener checkChangePIN();
}
