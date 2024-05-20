package view;

import java.awt.event.ActionListener;

public interface ScreenNavigationListener {
    public ActionListener showChoosen();
    public ActionListener showIntrucduce();

    public ActionListener showUpdataPanel();

    public ActionListener showCheckBalance();

    public ActionListener showWithDraw();

    public ActionListener showMakeDeposits();
    public ActionListener showChangePIN();

}
