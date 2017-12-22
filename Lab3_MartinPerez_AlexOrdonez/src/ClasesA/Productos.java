/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesA;

/**
 *
 * @author Alex Ordonez
 */
public class Productos {
    private String descripcion,marca;
    private int descuento;
    private double precio;
    public Productos() {
    }

    public Productos(String descripcion, String marca, int descuento, double precio) {
        this.descripcion = descripcion;
        this.marca = marca;
        this.descuento = descuento;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

   
    
    
}
