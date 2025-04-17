package com.mycompany.ateliejunino;
import javax.swing.*;
import java.awt.*;

public class TelaBase extends JFrame{

    public void positionScreen(int x, int y, int width, int heigth) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        setBounds(x, y, screenSize.width - width, heigth);
    }

}
