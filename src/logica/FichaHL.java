/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.JLabel;

/**
 *
 * @author andre
 */
public  final class FichaHL extends Ficha {
    

    public FichaHL() {
        vida = 5;
        ataque = 5;
        escudo = 2;
        nombre = "Hombre Lobo";
    }

    @Override
    public int atacarEs() {
        return 2;
    }

    @Override
    public boolean movimiento(Ficha f) {
        boolean resp = false;
        if(f instanceof EspacioVacio){
            resp = true;
            
            return resp;    
        }   
        return resp;
        
    }

    
}
