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
public class Objetos {
    protected String color, descripción, marca, tamaño, calidad, precio;
    protected Object dueño;
    public Objetos() {
    }

    public Objetos(String color, String descripción, String marca, String tamaño, String calidad, String precio, Object dueño) {
        this.color = color;
        this.descripción = descripción;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.precio = precio;
        this.dueño = dueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Object getDueño() {
        return dueño;
    }

    public void setDueño(Object dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return  descripción;
    }
    
    
    
    
    
}
