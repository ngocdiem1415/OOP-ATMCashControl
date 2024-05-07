package view;

import javax.swing.*;
import java.awt.*;

public class ImageSetting {
    private Image image;

    public ImageSetting() {
    }

    public Image mainImage(){
        image = new ImageIcon("src/image/screen_main.jpg").getImage();
        return image;
    }

    public Icon loginImage(){
        image = new ImageIcon("src/image/bank.png").getImage();
        image.getScaledInstance(100,100, Image.SCALE_AREA_AVERAGING);
        Icon icon = new ImageIcon(image);
        return icon;
    }

}
