/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ruben Chevez G
 */
public class Board extends JFrame{
    
    panelImagen panel  = new panelImagen();
    panelImagen panel2  = new panelImagen();
    JLabel[] labels = new JLabel[36];
    
    public Board() throws HeadlessException {
        super(" CASTELVANIA GAME----RUBEN CHEVEZ  V 1.0");
        setSize(1280, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setImage("background.png");
        panel2.setImage("board.png");
        setContentPane(panel);
        
        panel.setLayout(  null );
        panel.add(panel2);
        
        panel2.setLayout( new GridLayout( 6, 6 ));
        panel2.setSize(650, 650);
        panel2.setLocation(315, 20);
        
        for(int c = 0; c < 36; c++){
            labels[c] = new JLabel();
            panel2.add(  labels[c] );
        }

        setLocationRelativeTo(null);
        
       
    }
    
    
    
    
    
    
}
