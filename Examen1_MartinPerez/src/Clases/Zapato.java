/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mjper
 */
public class Zapato extends Objetos {
    
    
    private String talla,suela,confort;

    public Zapato() {
        super();
    }

    public Zapato(String talla, String suela, String confort, String color, String descripción, String marca, String tamaño, String calidad, String precio, String dueño) {
        super(color, descripción, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    
    
    
    
    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public String getConfort() {
        return confort;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }
    
    
    
    
    
}
