/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class Equipo {
    //nombre, presupuesto, numero de copas ganadas, un estadio y una lista de sus jugadores. 
    private String nombre,numero_copas,estadio;
    private ArrayList<Jugador> listajugador = new ArrayList();
    private double presupuesto;

    public Equipo() {
    }

    public Equipo(String nombre, String numero_copas, String estadio, double presupuesto) {
        this.nombre = nombre;
        this.numero_copas = numero_copas;
        this.estadio = estadio;
        this.presupuesto = presupuesto;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_copas() {
        return numero_copas;
    }

    public void setNumero_copas(String numero_copas) {
        this.numero_copas = numero_copas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugador> getListajugador() {
        return listajugador;
    }

    public void setListajugador(ArrayList<Jugador> listajugador) {
        this.listajugador = listajugador;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return nombre + "    "+numero_copas;
    }
    
    
    
    
    
    
    
    
    
}
