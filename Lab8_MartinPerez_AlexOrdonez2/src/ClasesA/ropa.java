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
public class ropa extends Productos{
    private int talla;
    private String sexo;

    public ropa() {
        super();
    }

    public ropa(int talla, String sexo, String descripcion, String marca, int descuento, double precio) {
        super(descripcion, marca, descuento, precio);
        this.talla = talla;
        this.sexo = sexo;
    }

    

    @Override
    public String toString() {
        return "ropa{"+""+super.descripcion+"-----"+super.getPrecio()+'}';
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
