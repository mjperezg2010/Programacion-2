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

/*
•	Nombre de la raza.
•	Numero de ki.
•	Número máximo de años.
•	Nombre del planeta.

*/
public class Seres_Vivos {
    private String raza,ki,maximoaños,nombreplaneta;

    public Seres_Vivos() {
    }

    public Seres_Vivos(String raza, String ki, String maximoaños, String nombreplaneta) {
        this.raza = raza;
        this.ki = ki;
        this.maximoaños = maximoaños;
        this.nombreplaneta = nombreplaneta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public String getMaximoaños() {
        return maximoaños;
    }

    public void setMaximoaños(String maximoaños) {
        this.maximoaños = maximoaños;
    }

    public String getNombreplaneta() {
        return nombreplaneta;
    }

    public void setNombreplaneta(String nombreplaneta) {
        this.nombreplaneta = nombreplaneta;
    }

    @Override
    public String toString() {
        return  raza;
    }
    
    
    
    
    
}
