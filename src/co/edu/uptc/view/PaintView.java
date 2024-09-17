package co.edu.uptc.view;

import java.awt.*;
import javax.swing.JFrame;

public class PaintView extends JFrame {

    private DrawingArea drawSection;
    private ToolBarView toolSection;

    public PaintView() {
        setSize(1000, 800);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setTitle("Mini - paint");
        setFocusable(true);
        requestFocusInWindow();
        initComponents();
        addKeyListener(new HideToolBarEvent(this.toolSection));
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
        this.toolSection = new ToolBarView();
        this.add(this.toolSection,BorderLayout.NORTH);
    }

    private void addStatusBar(){
        StatusBarView stateBar = new StatusBarView();
        this.add(stateBar, BorderLayout.SOUTH);
    }

}
