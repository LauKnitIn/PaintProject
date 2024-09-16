package co.edu.uptc.view;

import java.awt.*;
import javax.swing.JFrame;

public class PaintView extends JFrame {

    private DrawingArea drawSection;
    private VerticalToolbar toolSection;
    private boolean isToolbarOnLeft = true; 


    public PaintView() {
        setSize(1000, 800);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setTitle("Mini - paint");
        initComponents();
        setVisible(true);
    }

    private void initComponents(){
        addToolBar();
        addDrawingPanel();
        addStatusBar();
    }

    private void addDrawingPanel() {
        this.drawSection = new DrawingArea();
        this.add(this.drawSection, BorderLayout.CENTER);
    }

    private void addToolBar(){
        this.toolSection = new VerticalToolbar();
        this.add(this.toolSection,BorderLayout.NORTH);
    }

    public void toggleToolbarPosition() {
        this.remove(this.toolSection);

        if (isToolbarOnLeft) {
            this.add(this.toolSection, BorderLayout.EAST);
        } else {
            this.add(this.toolSection, BorderLayout.WEST);
        }

        isToolbarOnLeft = !isToolbarOnLeft;
        this.revalidate();
        this.repaint();
    }

    private void addStatusBar(){
        StatusBarView stateBar = new StatusBarView();
        this.add(stateBar, BorderLayout.SOUTH);
    }

}
