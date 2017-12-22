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
public class Alumnos {

    private String nombre, carrera, usuario, contra, buzon;
    private int numcuen, edad, dinero;
    private ArrayList secciones = new ArrayList();

    public void setnombre(String nom) {
        nombre = nom;
    }

    public String getmaestro() {

        return nombre;
    }

    public void setcarrera(String carrera) {
        this.carrera = carrera;

    }

    public String getcarrera() {

        return carrera;
    }

    public void setusuario(String maestro) {
        this.usuario = usuario;
    }

    public String getusuario() {

        return usuario;
    }

    public void setcontraseña(String contra) {
        this.contra = contra;
    }

    public String getcontra() {

        return contra;
    }

    public void setbuzon(String bu) {
        buzon = bu;
    }

    public String getbuzon() {

        return buzon;
    }

    public void setnumcuenta(int num) {
        numcuen = num;
    }

    public int getnumcuenta() {

        return numcuen;
    }
    
    public void setedad(int num) {
        edad = num;
    }

    public int getedad() {

        return edad;
    }
    
    public void setdinero(int num) {
       dinero=num;
    }

    public int getdinero() {

        return dinero;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nCarrera: "+carrera+"\nUsuario: "+usuario+"\nContraseña: "+contra+"\nNumero de cuenta: "+numcuen+"\nEdad: "+edad+"\nDinero disponible: "+dinero;
    }
    
    public void lista(int seccion){
        secciones.add(seccion);
    }

}//Fon de la clase alumnos
