package co.edu.uptc.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class VerticalToolbar extends JPanel {
    
    private final Color backgroundColor = new Color(217, 217, 217);
    private final Font textFont = new Font("Arial", Font.PLAIN, 14);
    private final String [] BUTTON_NAMES = {"Configuracion", "Herramientas","Acerca de","Cambiar"};
    private final String [][] BUTTON_OPTIONS = {{"Color","Limpiar","Salir"},
    {"Linea","Circulo","Rectangulo"},
    {"Informacion del proyecto"},
    {"Cambiar de lado"}
    };

    public VerticalToolbar() {
        setPreferredSize(new Dimension(200, 100)); 
        setBackground(this.backgroundColor);
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        layout.setVgap(10);
        setLayout(layout);
        initComponents();
    }


    private void initComponents() {
        createButtons();
    }

    private void createButtons(){
        for (int i = 0; i < this.BUTTON_NAMES.length; i++) {
            JButton option = new JButton(this.BUTTON_NAMES[i]);
            option.setPreferredSize(new Dimension(150,25));
                JPopupMenu options = createButtonOptions(this.BUTTON_OPTIONS[i]);
                createButtonAction(option, options);
                add(option); 
        }
        
    }

    private JPopupMenu createButtonOptions(String [] menuOptions){
        JPopupMenu options = new JPopupMenu();
        for (String optionName : menuOptions) {
            JMenuItem option = new JMenuItem(optionName);
            option.setActionCommand(optionName.toUpperCase());
            assignAction(option);
            options.add(option);
        }
        return options;
    }

    private void createButtonAction(JButton button, JPopupMenu buttonOptions){
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               buttonOptions.show(e.getComponent(), e.getX(), e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }
            
        });
    }

    private void assignAction(JMenuItem option){
        if (option.getActionCommand().equals("INFORMACION DEL PROYECTO")) {
            option.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   new AboutView();
                }
            });
        }else if (option.getActionCommand().equals("CAMBIAR DE LADO")) {
            option.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ((PaintView) SwingUtilities.getWindowAncestor(VerticalToolbar.this)).toggleToolbarPosition();
                }
            });
            
        }else{
            option.addActionListener(new NotReadyEvent());
        }
    }

}