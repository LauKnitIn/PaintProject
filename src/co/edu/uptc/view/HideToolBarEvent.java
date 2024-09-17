package co.edu.uptc.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HideToolBarEvent implements KeyListener{

    private ToolBarView c;

    public HideToolBarEvent(ToolBarView invoker){
        this.c = invoker;
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
       if(e.getKeyCode() == (KeyEvent.VK_F11)){
         this.c.removeAll();
       }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }


    
}
