package co.edu.uptc.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class DrawingArea extends JPanel{

    public DrawingArea() {
        setLayout(null);
        setBackground(new Color(255,252,242));
        setBorder(new LineBorder(Color.lightGray));
    }

}

