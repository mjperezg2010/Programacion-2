
package Clases;

public class Dragon extends Guerrero{

    private String color,raza;

    public Dragon() {
    }

    public Dragon(String color, String raza, String nombre, String edad, String lugarNacimiento, int poderAtaque, int salud, int costo) {
        super(nombre, edad, lugarNacimiento, poderAtaque, salud, costo);
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "Dragon" + "\n   color=" + color + "\n   raza=" + raza;
    }

    @Override
    public void Atacar(Guerrero x) {
        x.setSalud(x.getSalud()-poderAtaque);
        x.setPoderAtaque((x.getPoderAtaque() - x.getPoderAtaque()*0.25));
    }
    
    
    
    
    
    
}
