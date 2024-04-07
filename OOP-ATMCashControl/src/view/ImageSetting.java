package view;

import javax.swing.*;
import java.awt.*;

public class ImageSetting {
    private Image image;

    public ImageSetting() {
    }

    public Image mainImage(){
        image = new ImageIcon("image/screen_main.jpg").getImage();
        return image;
    }

}
