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
public class Familiares extends Persona {
    private String rol,trabajo, altura, peso;
    private ArrayList<Objetos> listo= new ArrayList();

    public Familiares(String rol, String trabajo, String altura, String peso, String Nombre, String Edad, String ID, String Sexo, String Estado_civil, String contraseña) {
        super(Nombre, Edad, ID, Sexo, Estado_civil, contraseña);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

   

    public Familiares() {
        super();
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public ArrayList<Objetos> getListo() {
        return listo;
    }

    public void setListo(ArrayList<Objetos> listo) {
        this.listo = listo;
    }
    
    
    
    
    
    
    
    
}//Fin de la clase
