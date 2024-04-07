package view;

import control.Controller;

import javax.swing.*;
import java.awt.*;

public class Starting extends JFrame {
    ImageSetting image;
    Controller controller;
    JPanel mainPanel;

    public Starting(Controller controller){
        super("ATM");
        this.image = image;
        this.controller = controller;
        init();
        setIconImage(image.mainImage());
        setResizable(false);
        setVisible(true);
    }

    public void init(){

    }

}
