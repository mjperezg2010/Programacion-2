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
public class Jugador {
    // Mientras que los jugadores constan de un nombre, 
    //precio, posición (atacante, mediocampista, defensa o portero), disponibilidad, habilidad (100%), técnica (100%) y resistencia física (100%).
    
    private String nombre,posicion,habilidad,tecnica,resistencia;
    private double precio;
    private boolean disponibilidad;

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, boolean disponibilidad, String habilidad, String tecnica, String resistencia, double precio) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        //if(disponibilidad){
        return  nombre+"    "+"    "+precio+"    "+posicion  +"     "+disponibilidad;
       // }else{
         //   return  nombre+"  "+"   "+precio+" "+posicion  +"  No Disponible" ;
       // }
    }
    
    
    
    
    
    
    
}//Fin clase
