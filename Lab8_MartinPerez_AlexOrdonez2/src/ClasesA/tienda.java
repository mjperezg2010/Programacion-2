/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesA;

import ClasesM.Empleados;
import java.util.ArrayList;

/**
 *
 * @author Alex Ordonez
 */
public class tienda extends Locales{
    private int tamano;
    
    
    //nuevo
    //private ArrayList<Productos> listaprod= new ArrayList();
    
    //

    public tienda() {
        super();
    }

    public tienda(int tamano, String nombre, String empleado_actual, int piso) {
        super(nombre, empleado_actual, piso);
        this.tamano = tamano;
    }

    public tienda(int tamano, String nombre, int piso) {
        super(nombre, piso);
        this.tamano = tamano;
    }
    
    
    
    

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        if(tamano>18){
            this.tamano = tamano;
        }
    }

    @Override
    public String toString() {
        return "tienda{"+super.getNombre()+"---" + "tamano=" + tamano + '}';
    }
    
    
}
