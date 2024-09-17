package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class NotReadyEvent implements ActionListener{

    private void addNotReadyMessage(){
        JDialog alert = new JDialog();
        alert.setLayout(new BorderLayout());
        alert.setLayout(null);
        alert.setSize(350, 350);
        alert.setTitle("Alerta");
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
