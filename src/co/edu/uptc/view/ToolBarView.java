package co.edu.uptc.view;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;


public class ToolBarView extends JPanel{

    private final Color backgroundColor = new Color(217, 217, 217);
    private final Font textFont = new Font("Arial", Font.PLAIN, 14);
    private JToolBar toolsBar;
    private final String [] menuIcons = {"/Resources/IMG/engranaje.png", "/Resources/IMG/tools.png","/Resources/IMG/info.png"};
    private final String [][] ITEMS_NAMES = {
        {"Color", "Limpiar","Salir"},
        {"Linea","Circulo","Rectangulo"},
        {"Conoce del proyecto"}
    };

    public ToolBarView(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(this.backgroundColor);
        setBounds(0,0,1000,20);
        setFocusable(true);
        initComponents();
    }

    private void initComponents(){
        addMenuBar();
    }   

    private void addMenuBar(){
        this.toolsBar = new JToolBar(JToolBar.HORIZONTAL);
        this.toolsBar.setRollover(true);
        createButtons();
        add(this.toolsBar);
    }

    private void createButtons(){
        for (String buttonName : this.menuIcons) {
            JButton option =  new JButton();
            option.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
            String currentDir = System.getProperty("user.dir");
            ImageIcon IMG = new ImageIcon(currentDir+buttonName);
            option.setIcon(new ImageIcon(IMG.getImage().getScaledInstance(40,35, Image.SCALE_SMOOTH)));
            option.setOpaque(true);
            this.toolsBar.add(option);
        }
        addButtonOptions();
    }

    private void addButtonOptions(){
        for(int i = 0; i < this.toolsBar.getComponents().length; i++){
            optionsMenu(this.ITEMS_NAMES[i], (JButton) this.toolsBar.getComponent(i));
        }
    }

    private void optionsMenu(String [] optionsName, JButton optionButton){
        JPopupMenu options = new JPopupMenu();
       for (String name : optionsName) {
            JMenuItem option = new JMenuItem(name);
            option.setActionCommand(name.toUpperCase());
            assignOptionsAction(option);
            options.add(option);
            options.addSeparator();
       }
       showMenu(optionButton, options);
    }

    private void assignOptionsAction(JMenuItem option){
        if (option.getActionCommand().equals("CONOCE DEL PROYECTO")) {
            option.addActionListener(new InfoEvent());
        }else{
            option.addActionListener(new NotReadyEvent());
        }
    }

    private void showMenu(JButton option, JPopupMenu options){
        option.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
               options.show(option, e.getX(), e.getY());
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
    
}
