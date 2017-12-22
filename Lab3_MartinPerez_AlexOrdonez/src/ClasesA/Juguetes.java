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
public class Juguetes extends Productos{
    private String tipo;

    public Juguetes() {
        super();
    }

    public Juguetes(String tipo, String descripcion, String marca, int descuento, double precio) {
        super(descripcion, marca, descuento, precio);
        this.tipo = tipo;
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
