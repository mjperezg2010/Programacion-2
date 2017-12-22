/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author mjper
 */
public class Planeta  implements Serializable{
    // los cuales constan de un nombre, temperatura media, se necesita saber si tiene anillos o no, tipo de superficie y distancia de la Tierra. 
    private String   nombre,temperatura_media,tipo_superficie,distancia;
    
    private boolean anillos;

    
    private static final long SerialVersionUID = 7147L;
    public Planeta(String nombre, String temperatura_media, String tipo_superficie, String distancia, boolean anillos) {
        this.nombre = nombre;
        this.temperatura_media = temperatura_media;
        this.tipo_superficie = tipo_superficie;
        this.distancia = distancia;
        this.anillos = anillos;
    }

    public Planeta() {
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura_media() {
        return temperatura_media;
    }

    public void setTemperatura_media(String temperatura_media) {
        this.temperatura_media = temperatura_media;
    }

    public String getTipo_superficie() {
        return tipo_superficie;
    }

    public void setTipo_superficie(String tipo_superficie) {
        this.tipo_superficie = tipo_superficie;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
    
    
}
