/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesA;

/**
 *
 * @author Alex Ordonez
 */
public class comida extends Productos {
    private String fecha_ca;

    public comida(String fecha_ca, String descripcion, String marca, int descuento, double precio) {
        super(descripcion, marca, descuento, precio);
        this.fecha_ca = fecha_ca;
    }

    public String getFecha_ca() {
        return fecha_ca;
    }

    public void setFecha_ca(String fecha_ca) {
        this.fecha_ca = fecha_ca;
    }
    
    
}
