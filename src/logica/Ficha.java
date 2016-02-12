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
public abstract class Ficha extends JLabel{
    protected int vida, ataque, escudo, fila, columna;
    protected String color,nombre, iconos;
    protected JLabel labels[][];
    
    public Ficha() {
    }
    
    public int getFila() {
        return fila;
    }

    public String getIconos() {
        return iconos;
    }

    public int getColumna() {
        return columna;
    }

    public String getNombre() {
        return nombre;
    }
    
    public final int getVida() {
        return vida;
    }

    public final int getAtaque() {
        return ataque;
    }

    public final int getEscudo() {
        return escudo;
    }
    
    public abstract int atacarEs();
    
    public abstract boolean movimiento(Ficha f);
  
    public int restarPuntos(int x) {
        escudo -= x;
        if(escudo == 0){
            vida -=x;
            return vida;
        }
        return escudo;
    }

    
    public int restarEs(int x, String a) {
        if(a.equalsIgnoreCase("Muerte")){
            vida -= (x/2);
            return vida;
        }
        vida -= 1;
        return vida;
    }
    ;
}
