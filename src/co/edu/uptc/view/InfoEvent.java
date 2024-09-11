package co.edu.uptc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoEvent implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutView info = new AboutView();
    }
    
}
