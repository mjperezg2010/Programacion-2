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
public class Ropa extends Objetos {
    private String talla, material,pais_elaboracion;

    public Ropa() {
        super();
    }

    public Ropa(String talla, String material, String pais_elaboracion, String color, String descripción, String marca, String tamaño, String calidad, String precio, String dueño) {
        super(color, descripción, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.material = material;
        this.pais_elaboracion = pais_elaboracion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais_elaboracion() {
        return pais_elaboracion;
    }

    public void setPais_elaboracion(String pais_elaboracion) {
        this.pais_elaboracion = pais_elaboracion;
    }
    
    
    
    
    
    
    
    
    
}
