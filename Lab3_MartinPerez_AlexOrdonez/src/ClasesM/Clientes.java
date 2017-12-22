/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesM;

import ClasesA.Productos;
import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class Clientes extends Personas {
    private ArrayList <Productos> lista= new ArrayList();
    private double dinero;

    public Clientes() {
        super();
    }

    public Clientes(double dinero, String username, String password, String correo, String nombrec, String id, String fecha) {
        super(username, password, correo, nombrec, id, fecha);
        this.dinero = dinero;
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Clientes{" +super.toString()+ "lista=" + lista + ", dinero=" + dinero + '}';
    }

    
   
    
}
