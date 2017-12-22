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
public class Quiosco extends Locales {
    private String nombre_ex;
   // private Productos productosa;
    public Quiosco() {
        super();
    }

    public Quiosco(String nombre_ex, String nombre, String empleado_actual, int piso) {
        super(nombre, empleado_actual, piso);
        this.nombre_ex = nombre_ex;
        
        
        
    }

    public Quiosco(String nombre_ex, String nombre, int piso) {
        super(nombre, piso);
        this.nombre_ex = nombre_ex;
    }

    
    
    
    
    
    
   /* public Productos getProductosa() {
        return productosa;
    }

    public void setProductosa(Productos productos) {
        this.productosa = productos;
    }
*/
    
    
    
    public String getNombre_ex() {
        return nombre_ex;
    }

    public void setNombre_ex(String nombre_ex) {
        this.nombre_ex = nombre_ex;
    }

    @Override
    public String toString() {
        return "Quiosco{" + "nombre_ex=" + nombre_ex + '}';
    }
    
    
}
