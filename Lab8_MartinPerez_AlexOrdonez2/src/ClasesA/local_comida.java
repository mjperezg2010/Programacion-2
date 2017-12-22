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
public class local_comida extends Locales{
    //private ArrayList <

    public local_comida() {
        super();
    }

    public local_comida(String nombre, String empleado_actual, int piso) {
        super(nombre, empleado_actual, piso);
    }

    public local_comida(String nombre, int piso) {
        super(nombre, piso);
    }

    @Override
    public String toString() {
        return "local_comida{"+super.getNombre() + '}';
    }

    
    
    
    
    
    
}
