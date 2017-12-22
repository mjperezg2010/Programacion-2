/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Productos.Productos;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class Orden {
    private Cajero cajero;
    private Cliente cliente;
    private ArrayList<Productos> listaproductos = new ArrayList();
    
    
    
    
     //private static final long SerialVersionUID = 746L;

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Productos> listaproductos) {
        this.listaproductos = listaproductos;
    }
    
    
    
    
    
    
    
}
