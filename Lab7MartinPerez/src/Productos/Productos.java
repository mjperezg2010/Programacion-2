/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Clases.Orden;
import Clases.Supermercado;

/**
 *
 * @author mjper
 */
public class Productos extends Supermercado{
    private String nombre;
    private double precio;
    private int tiempoprocesamiento;

    public Productos() {
    }

    public Productos(String nombre, double precio, int tiempoprocesamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoprocesamiento = tiempoprocesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempoprocesamiento() {
        return tiempoprocesamiento;
    }

    public void setTiempoprocesamiento(int tiempoprocesamiento) {
        this.tiempoprocesamiento = tiempoprocesamiento;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
    
    
}
