
package Clases;

public class Jugador {
    
    private String nombre;
    private int puntos;
    private double dinero;
    private Guerrero guerrero;

    public Jugador() {
    }

    public Jugador(String nombre, int puntos, double dinero, Guerrero guerrero) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.dinero = dinero;
        this.guerrero = guerrero;
    }

    @Override
    public String toString() {
        return "Jugador\n" + "nombre=" + nombre + "\npuntos=" + puntos + "\ndinero=" + dinero + "\nguerrero=" + guerrero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public double getDinero() {
        return dinero;
    }

    public Guerrero getGuerrero() {
        return guerrero;
    }
    
    
}
