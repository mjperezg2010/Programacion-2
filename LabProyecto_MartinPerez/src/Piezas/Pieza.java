/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piezas;

/**
 *
 * @author mjper
 */
public abstract  class Pieza{
    protected String Nombre,Color;
   

    public Pieza() {
    }

    public Pieza(String Nombre, String Color) {
        this.Nombre = Nombre;
        this.Color = Color;
    }
    
    
    public abstract boolean escoger(char[][] t, int i1, int j1);
    public abstract boolean ataque(char [][] t,int i1,int j1,int i2,int j2);
    
    
    

    @Override
    public String toString() {
        String s="";
        s= "Pieza: "+Nombre+"\n"
                +"Color: "+Color;
        return s;
    }
       
    
    
}
