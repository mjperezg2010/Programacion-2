
package Clases;

import java.util.ArrayList;

public class Partida {
    
    private String nombre;
    public ArrayList<Ataque> ataques = new ArrayList();

    public Partida() {
    }

    public Partida(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Partida{" + "nombre=" + nombre + '}';
    }
    
     
}
