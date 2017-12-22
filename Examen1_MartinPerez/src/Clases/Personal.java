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
public class Personal extends Persona{
    private String  ocupacion_casa, horario_trabajo, tiempo_trabajando,sueldo;

    public Personal(String ocupacion_casa, String horario_trabajo, String tiempo_trabajando, String sueldo, String Nombre, String Edad, String ID, String Sexo, String Estado_civil, String contraseña) {
        super(Nombre, Edad, ID, Sexo, Estado_civil, contraseña);
        this.ocupacion_casa = ocupacion_casa;
        this.horario_trabajo = horario_trabajo;
        this.tiempo_trabajando = tiempo_trabajando;
        this.sueldo = sueldo;
    }

    

    public Personal() {
    }

    public String getOcupacion_casa() {
        return ocupacion_casa;
    }

    public void setOcupacion_casa(String ocupacion_casa) {
        this.ocupacion_casa = ocupacion_casa;
    }

    public String getHorario_trabajo() {
        return horario_trabajo;
    }

    public void setHorario_trabajo(String horario_trabajo) {
        this.horario_trabajo = horario_trabajo;
    }

    public String getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(String tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
    
    
    
}//Fin de la clase
