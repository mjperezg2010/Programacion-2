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
public class Clasesad {

    private String nombre;
    private int seccion;
    private int cantalum;
    private String maestro;
    private int unidadesv;
    private ArrayList nombres = new ArrayList();
    private ArrayList nombresclase = new ArrayList();

    public Clasesad() {
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {

        return nombre;
    }
    
    public void setseccion(int secci){
        seccion=secci;
    }
    
    public int getseccion(){
        
        return seccion;
    }
    
    public void setscantidadalumnos(int cant){
        cantalum=cant;
    }
    
    public int getcantidadalumnos(){
        
        return cantalum;
    }
    
    public void setmaestro(String maestro) {
        this.maestro=maestro;
    }

    public String getmaestro() {

        return maestro;
    }
    
    public void setunidadesvalorativas(int cant){
        unidadesv=cant;
    }
    
    public int getunidadesvalorativas(){
        
        return unidadesv;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nSeccion: "+seccion+"\nCantidad de alumnos: "+cantalum+"\nMaestro: "+maestro+"\nUnidades Valorativas: "+unidadesv;
    }
    
    
    public void lista(String nombreal){
        nombres.add(nombreal);
    }
    
    public void listaclases(String nombrecl){
        nombresclase.add(nombrecl);
    }
    
    public void listadeclases(){
        for (Object n : nombresclase) {
            System.out.println(n);
        }
        System.out.println(" ");
    }
    
    
    
    
    

}//Fin de la clase clases
