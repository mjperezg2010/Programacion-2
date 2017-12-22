/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author mjper
 */
public class Cajero extends Thread {
    private String nombre;
    private String id_c;
    private ArrayList<Orden> listaorden = new ArrayList();
    private Ventana_C ventana = new Ventana_C();

    public Cajero(String nombre, String id) {
        this.nombre = nombre;
        this.id_c = id;
    }

    public Cajero() {
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_C() {
        return id_c;
    }

    public void setId(String id) {
        this.id_c = id;
    }

    public Ventana_C getVentana() {
        return ventana;
    }

    public void setVentana(Ventana_C ventana) {
        this.ventana = ventana;
    }

   

  

    public ArrayList<Orden> getListaorden() {
        return listaorden;
    }

    public void setListaorden(ArrayList<Orden> listaorden) {
        this.listaorden = listaorden;
    }

    //Ventana
   /* public void ventanaadmin(){
        JTable tabla= new JTable();
        JLabel labelcliente = new JLabel();
        JLabel labelprocesando = new JLabel();
        JTextField texto = new JTextField();
        
        
        
        
        
        
        
        
    }
    */
    
    
    @Override
    public String toString() {
        return nombre ;
    }
    
    @Override
    public void run(){
        
    }
    
    
}//Fin de la clase
