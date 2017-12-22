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
public class ObjetoHogar extends Objetos{
    
    private String  tiempo_vida, área_casa, instrucciones_armado, fecha_compra;

    public ObjetoHogar() {
        super();
    }

    public ObjetoHogar(String tiempo_vida, String área_casa, String instrucciones_armado, String fecha_compra, String color, String descripción, String marca, String tamaño, String calidad, String precio, String dueño) {
        super(color, descripción, marca, tamaño, calidad, precio, dueño);
        this.tiempo_vida = tiempo_vida;
        this.área_casa = área_casa;
        this.instrucciones_armado = instrucciones_armado;
        this.fecha_compra = fecha_compra;
    }

    public String getTiempo_vida() {
        return tiempo_vida;
    }

    public void setTiempo_vida(String tiempo_vida) {
        this.tiempo_vida = tiempo_vida;
    }

    public String getÁrea_casa() {
        return área_casa;
    }

    public void setÁrea_casa(String área_casa) {
        this.área_casa = área_casa;
    }

    public String getInstrucciones_armado() {
        return instrucciones_armado;
    }

    public void setInstrucciones_armado(String instrucciones_armado) {
        this.instrucciones_armado = instrucciones_armado;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
    
    
    
    
    
    
}
