package view;

import control.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements Observer, ActionListener {
    Controller control;
    ImageSetting image = new ImageSetting();


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void update() {

    }
}
