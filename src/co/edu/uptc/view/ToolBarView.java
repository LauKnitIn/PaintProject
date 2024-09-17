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
    private final String [] menuIcons = {"/co/edu/uptc/Resources/IMG/engranaje.png", "/co/edu/uptc/Resources/IMG/tools.png","/co/edu/uptc/Resources/IMG/info.png"};
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
        System.out.println("11111");
        createButtons();
        add(this.toolsBar);
    }

    private void createButtons(){
        for (String buttonName : this.menuIcons) {
            System.out.println("DIREC:" + buttonName);
            JButton option =  new JButton();
            option.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
            ImageIcon IMG = new ImageIcon(getClass().getResource(buttonName));
            //ImageIcon IMG = new ImageIcon("C:\\Users\\LENOVO\\Documents\\Universidad\\4° Semester\\Programacion II\\PaintProject\\Project\\src\\co\\edu\\uptc\\Resources\\IMG\\Alerta.png");
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
