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
public class Astronauta implements Serializable {
    //nombre, nacionalidad, sueldo, experiencia, sexo y peso.
    private String nombre,nacionalidad,exp,sexo,peso;
    private double sueldo;

      private static final long SerialVersionUID = 7747L;
    public Astronauta() {
    }

    public Astronauta(String nombre, String nacionalidad, String exp, String sexo, String peso, double sueldo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.exp = exp;
        this.sexo = sexo;
        this.peso = peso;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
}//Fin clase
