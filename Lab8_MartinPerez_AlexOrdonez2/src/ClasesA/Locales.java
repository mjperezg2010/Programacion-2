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
public class Locales {
    private String nombre,empleado_actual;
    private int piso;
    protected ArrayList<Empleados> empleados = new ArrayList();
    protected ArrayList<Productos> productos= new ArrayList();
    protected ArrayList<String> facturacion= new ArrayList();

    public Locales() {
    }

    public Locales(String nombre, String empleado_actual, int piso) {
        this.nombre = nombre;
        this.empleado_actual = empleado_actual;
        this.piso = piso;
        
    }

    public Locales(String nombre, int piso) {
        this.nombre = nombre;
        this.piso = piso;
    }

    public ArrayList<String> getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(ArrayList<String> facturacion) {
        this.facturacion = facturacion;
    }
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpleado_actual() {
        return empleado_actual;
    }

    public void setEmpleado_actual(String empleado_actual) {
        this.empleado_actual = empleado_actual;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", empleado_actual=" + empleado_actual + ", piso=" + piso + ", empleados=" + empleados + ", productos=" + productos + '}';
    }
    
}
