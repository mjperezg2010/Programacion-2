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
public class Maestros {
    private String nombre;
    private String titulo;
    private String salario;
    private String maestria;
    private String usuario;
    private String contraseña;
    private String cantclases;
    private ArrayList secciones = new ArrayList();
    
    public Maestros(){
        
    }
    
    //MUtadores
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getnombre(){
        
        return nombre;
    }
    
    public void settitulo(String titulo){
        this.nombre= titulo;
    }
    
    public String gettitulo(){
        
        return titulo;
    }
    
    public void setsalario(String salario){
        this.salario=salario;
    }
    
    public String getsalario(){
        
        return salario;
    }
    
    public void setmaestria(String maestria){
        this.maestria=maestria;
    }
    
    public String getmaestria(){
        
        return maestria;
    }
    
    public void setusuario(String usuario){
        this.usuario=usuario;
    }
    
    public String getusuario(){
        
        return usuario;
    }
    
    public void setcontraseña(String contra){
        contraseña=contra;
    }
    
    public String getcontraseña(){
        
        return contraseña;
    }
    
    public void setcantidadclases(String cl){
        cantclases=cl;
    }
    
    public String getcantidadclases(){
        
        return cantclases;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nTitulo: "+titulo+"\nMaestria: "+maestria+"\nUsuario: "+usuario+"\nContraseña: "+contraseña+"\nCantidad maxima de clases: "+cantclases;
    }
    
    
    public void lista(int seccion){
        secciones.add(seccion);
    }

    
    
    
   
    
   

    
    
}//Fin de la case mawtros
