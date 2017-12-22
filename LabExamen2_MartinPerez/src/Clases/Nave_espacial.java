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
public abstract class Nave_espacial {
    //un número de serie, un planeta destino (e ste de stino deberá ser elegido de plane tas creados anteriormente), y una velocidad.
    protected String num,velocidad;
    protected Planeta planeta;

    public Nave_espacial() {
    }

    public Nave_espacial(String num, String velocidad, Planeta planeta) {
        this.num = num;
        this.velocidad = velocidad;
        this.planeta = planeta;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
    
    
    
    
    
    public abstract double CalcularTiempoida();
    public abstract double CalcularTiemporegreso();
        
    
    
}
