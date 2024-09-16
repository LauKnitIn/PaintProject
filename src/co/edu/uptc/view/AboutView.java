package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AboutView extends JDialog {
    
    private int YcordinateCount;
    private final String DIALOG_TITLE = "Acerca de";
    private final Color BACKGROUND_COLOR = new Color(255,252,242);
    private final int SIZE = 300;
    private final String [] LABELS_NAME = {"Mini-Paint","V0.2.0", "Aplicación de dibujo","Juan Pablo Martinez","Laura Correa","11/09/2024"};

    public AboutView(){
        this.YcordinateCount = 10;
        setLayout(new GridLayout(7,1));
        setSize((new Dimension(this.SIZE, this.SIZE)));
        setTitle(this.DIALOG_TITLE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(this.BACKGROUND_COLOR);
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        addLabels();
        addButton();

    }

    private void addLabels(){
        for (String LABELS_NAME1 : this.LABELS_NAME) {
            add(createLabel(LABELS_NAME1));
            this.setYcordinate(getYcordinate()+40);
        }
    }

    private JLabel createLabel(String labelName){
        JLabel label = new JLabel(labelName, SwingConstants.CENTER);
        sizeLabel(label);
        return label;
    }

    private void sizeLabel(JLabel label){
        label.setSize(new Dimension(80,20));
        int x = this.getWidth()/2-label.getWidth();
        label.setBounds(x, this.getYcordinate(), 150, 20);
    }

    private void addButton(){
        JButton closeButton = new JButton("Cerrar");
        closeButton.setSize(new Dimension(60, 30));
        closeButton.setPreferredSize(new Dimension(70, 30));
        int x = this.getWidth()/2-closeButton.getWidth()/2;
        closeButton.setBounds(x, this.getYcordinate(), 70, 30);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
        this.add(closeButton);
    }

    private int getYcordinate(){
        return this.YcordinateCount;
    }
    private void setYcordinate(int currentCordinate){
        this.YcordinateCount = currentCordinate;
    }

}
