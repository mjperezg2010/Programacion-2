/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mjper
 */
public class Sonda_Espacial extends Nave_espacial{
    private String material,peso;

    public Sonda_Espacial(String material, String peso, String num, String velocidad, Planeta planeta) {
        super(num, velocidad, planeta);
        this.material = material;
        this.peso = peso;
    }

    public Sonda_Espacial() {
        super();
    }

    
    
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

   

    @Override
    public String toString() {
        return "Sonda_Espacial"+super.getNum();
    }

    @Override
    public double CalcularTiempoida() {
        double tiempoida=0.0;
         tiempoida= Double.parseDouble(super.getPlaneta().getDistancia())/Double.parseDouble(super.getVelocidad());
         return tiempoida;
    }

    @Override
    public double CalcularTiemporegreso() {
        double tiempoida=CalcularTiempoida();
        
        double tiemporegreso=0.0;
        
        
        tiemporegreso= 9.8*tiempoida;
        
        return tiemporegreso;
    }

   
    
    
    
    
    
}
