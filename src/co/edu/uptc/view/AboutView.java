package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class AboutView extends JDialog {
    
    private final String DIALOG_TITLE = "Acerca de";
    private final Color BACKGROUND_COLOR = new Color(255,252,242);
    private final int SIZE = 300;
    private final String [] LABELS_NAME = {"Mini-Paint","V1.0", "Aplicación de dibujo","Juan Pablo Martinez","Laura Correa","11/09/2024"};

    public AboutView(){
        setSize((new Dimension(300, 300)));
        GridLayout layout = new GridLayout(7,1,30,1);
        setLayout(layout);
        setBackground(this.BACKGROUND_COLOR);
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        addLabels();
        addCloseButton();
    }

    private void addLabels(){
        for (String LABELS_NAME1 : LABELS_NAME) {
            add(createLabel(LABELS_NAME1));
        }
    }

    private JLabel createLabel(String labelName){
        JLabel infoLabel = new JLabel(labelName);
        return infoLabel;
    }

    private void addCloseButton(){
        JButton closeButton = new JButton("Cerrar");
        closeButton.setPreferredSize(new Dimension(30, 30));
        this.add(closeButton);
        closeButton.setVisible(true);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}
