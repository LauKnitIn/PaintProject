package co.edu.uptc.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;


public class ToolBarView extends JPanel{

    private final Color backgroundColor = new Color(217, 217, 217);
    private final Font textFont = new Font("Arial", Font.PLAIN, 14);
    private JMenuBar menuBar;
    private JToolBar toolsBar;
    private final int MENU_AMOUNT = 3;
    private final String [] menuIcons = {"engranaje.png", "tools.png","info.png"};
    private final String [][] ITEMS_NAMES = {
        {"Color", "Limpiar","Salir"},
        {"Linea","Circulo","Rectangulo"},
        {"Conoce del proyecto"}
    };

    public ToolBarView(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setBackground(this.backgroundColor);
        setBounds(0,0,1000,30);
        initComponents();
    }

    private void initComponents(){
        addMenuBar();
    }   

    private void addMenuBar(){
       // this.menuBar = new JMenuBar();
        this.toolsBar = new JToolBar(JToolBar.HORIZONTAL);
        //this.toolsBar.setBounds(0, 0, 1000, 30);
        this.toolsBar.setRollover(true);
        //this.menuBar.setBounds(0, 0, 1000, 30);
        //add(this.menuBar);
        add(this.toolsBar);
        //addMenus();
        addButtons();
    }

    private void addButtons(){
        for (String buttonName : this.menuIcons) {
            JButton option =  new JButton();
            option.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.darkGray));
            ImageIcon IMG = new ImageIcon(buttonName);
            option.setIcon(new ImageIcon(IMG.getImage().getScaledInstance(40,35, Image.SCALE_SMOOTH)));
            option.setOpaque(true);
            this.toolsBar.add(option);
        }
    }

    private void addButtonOptions(){
        for(int i = 0; i < this.toolsBar.getComponents().length; i++){
            this.toolsBar.getComponent(i).add(null);
        }
    }

    private JPopupMenu optionsMenu(){
        for(int i = 0; i < this.toolsBar.getComponents().length; i++){
            JPopupMenu options = new JPopupMenu();
           
        }
        return null;
    }

   /* private void addMenus(){
        for (int i = 0; i < this.MENU_AMOUNT; i++) {
            this.menuBar.add(createMenu(this.menuTitles[i]));
        }
        addMenuItems();
    }*/

    /*private JMenu createMenu(String menuTitle){
        JMenu menu = new JMenu(menuTitle);
        menu.setFont(this.textFont);
        menu.setBorder(new BevelBorder(BevelBorder.RAISED, Color.lightGray, Color.lightGray));
        return menu;
    }*/

    /*private void addMenuItems(){
       for (int i = 0; i < this.menuBar.getMenuCount(); i++) {
           for(String itemName: ITEMS_NAMES[i] ){
                this.menuBar.getMenu(i).add(createMenuItem(itemName));
                this.menuBar.getMenu(i).addSeparator();
           }
       }      
    }*/

    /*private JMenuItem createMenuItem(String itemName){
        JMenuItem menuItem = new JMenuItem(itemName);
        menuItem.setFont(this.textFont);
        if (!(itemName.equals("Conoce del proyecto"))) {
            menuItem.addActionListener(new NotReadyEvent());
        }else{
            menuItem.addActionListener(new InfoEvent());
        }
        return menuItem;
    }*/
    
}
