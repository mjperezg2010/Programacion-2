
package Clases;

public abstract class Guerrero {
    
    protected String nombre, edad, lugarNacimiento;
    protected int poderAtaque, salud, costo;
    
    public abstract void Atacar(Guerrero x);
    
    public Guerrero(String nombre, String edad, String lugarNacimiento, int poderAtaque, int salud, int costo) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.poderAtaque = poderAtaque;
        this.salud = salud;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Guerrero\n" + "nombre=" + nombre + "\nedad=" + edad + "\nlugarNacimiento=" + lugarNacimiento + "\npoderAtaque=" + poderAtaque + "\nsalud=" + salud + "\ncosto=" + costo + "\n";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Guerrero() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public int getSalud() {
        return salud;
    }

    public int getCosto() {
        return costo;
    }
    
    
}
