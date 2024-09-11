package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class NotReadyEvent implements ActionListener{

    private void addNotReadyMessage(){
        JDialog alert = new JDialog();
        alert.setLayout(new BorderLayout());
        alert.setLayout(null);
        alert.setSize(350, 350);
        alert.setTitle("Alera");
        JLabel message = new JLabel("Esta funcionalidad aun no esta disponible");
        message.setBounds(45, 80, 250, 100);
        alert.add(message, BorderLayout.CENTER);
        alert.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addNotReadyMessage();
    }




    
}
