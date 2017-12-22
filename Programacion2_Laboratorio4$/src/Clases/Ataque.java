
package Clases;

public class Ataque {
    
    public String nombre;
    public Jugador jugadores[] = new Jugador[2];
    public int posJ1;
    public int posJ2;

    public Ataque() {
    }

    public Ataque(String nombre, Jugador j1, Jugador j2, int a, int b) {
        this.nombre = nombre;
        jugadores[0] = j1;
        jugadores[1] = j2;
        posJ1 = a;
        posJ2 = b;
    }

    public int getPosJ1() {
        return posJ1;
    }

    public int getPosJ2() {
        return posJ2;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ataque{" + "nombre=" + nombre + ", posJ1=" + posJ1 + ", posJ2=" + posJ2 + '}';
    }
    
    
}
