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
    public FichaHL(int vida, int ataque, int escudo, int fila , int col, String color, String nombre, String iconos){
        this.vida = vida;
        this.ataque = ataque;
        this.escudo = escudo;
        this.fila = fila;
        this.columna = col;
        this.color = color;
        this.nombre = nombre;
        this.iconos = iconos;
    }
    
    
    @Override
    public int atacarEs() {
        return 2;
    }

  
    public boolean movimiento(Ficha f) {
        boolean resp = false;
        if(f instanceof EspacioVacio){
            
            
            int d = f.getFila() - this.fila;
            if(d >= 2 || d <= -2){
                
            }
            int filaSig = f.getFila();
            int colSig = f.getColumna();
            resp = true;
            f = new FichaHL(vida,  ataque,  escudo,  filaSig ,  colSig , color, nombre, iconos);


            return resp;    
        }   
        return resp;
        
    }

    
}
