package co.edu.uptc.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HideToolBarEvent implements KeyListener{

  private ToolBarView toolsCopy;

    public HideToolBarEvent(ToolBarView toolBar){
      this.toolsCopy = toolBar;
    }


    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
      if (e.getKeyCode() == KeyEvent.VK_F11) {
        this.toolsCopy.setVisible(!this.toolsCopy.isVisible());
      }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }


    
}
