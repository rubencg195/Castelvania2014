/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 * @author Ruben
 */

public class panelImagen extends JPanel{
    private Image img;

    public panelImagen() {
        img = null;
    }
    public panelImagen(String dir) {
        if(dir != null){
            img = new ImageIcon(getClass().getResource(dir)).getImage();
        }
        
        
    }
    public void setImage(String dir){
        if(dir != null){
            img = new ImageIcon(getClass().getResource(dir)).getImage();
        }
        else{
            img = null;
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if(img != null){
        
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            this.setOpaque(false);
        }
        else{
            this.setOpaque(true);
        }
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
