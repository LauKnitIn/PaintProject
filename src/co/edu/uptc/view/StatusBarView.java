package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class StatusBarView extends JPanel{

    private JLabel colorLabel;
    private JLabel countLabel;
    private final Color backgroundColor = new Color(217, 217, 217);
    private int elementsCount;
    private Color currentColor;

    public StatusBarView(){
        this.elementsCount = 0;
        this.currentColor = Color.black;
        setLayout(new BorderLayout());
        setBorder(new LineBorder(Color.lightGray));
        setPreferredSize(new Dimension(200, 20));
        setBackground(this.backgroundColor);
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        addLabels();
    }

    private void addLabels(){
       this.colorLabel= new JLabel("Color: ");
       add(this.colorLabel,BorderLayout.WEST);

        this.countLabel = new JLabel("Cantidad Elementos: " + this.elementsCount);
        add(this.countLabel,BorderLayout.EAST);
    }

    public void updateStatusBar(Color color, int count) {
        this.colorLabel.setText("Color: " + color.toString());
        this.countLabel.setText("Elementos: " + count);
    }
    
}
