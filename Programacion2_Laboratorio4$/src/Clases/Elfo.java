
package Clases;

public class Elfo extends Guerrero{
    
    private String tipoArma, rangoMilitat;

    public Elfo(String tipoArma, String rangoMilitat, String nombre, String edad, String lugarNacimiento, int poderAtaque, int salud, int costo) {
        super(nombre, edad, lugarNacimiento, poderAtaque, salud, costo);
        this.tipoArma = tipoArma;
        this.rangoMilitat = rangoMilitat;
    }

    public Elfo() {
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public String getRangoMilitat() {
        return rangoMilitat;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public void setRangoMilitat(String rangoMilitat) {
        this.rangoMilitat = rangoMilitat;
    }

    @Override
    public String toString() {
        return super.toString()+"Elfo" + "\ntipoArma=" + tipoArma + "\nrangoMilitat=" + rangoMilitat;
    }

    @Override
    public void Atacar(Guerrero x) {
        x.setSalud(x.getSalud()-poderAtaque);
    }
    
    
}
