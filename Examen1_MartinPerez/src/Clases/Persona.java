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
public class Persona {
    protected String Nombre, Edad, ID, Sexo, Estado_civil,contraseña;
    protected ArrayList listam = new ArrayList();

    public Persona() {
    }

    public Persona(String Nombre, String Edad, String ID, String Sexo, String Estado_civil,String contraseña) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.Sexo = Sexo;
        this.Estado_civil = Estado_civil;
        this.contraseña=contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }

    public ArrayList getListam() {
        return listam;
    }

    public void setListam(ArrayList listam) {
        this.listam = listam;
    }

    @Override
    public String toString() {
        return  Nombre;
    }
    
    
    
    
}
