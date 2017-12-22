
package Clases;

public class Bruja extends Guerrero{
    
    private String sigloNacimiento, lugarResidencia;
    
    public Bruja() {
    }

    public Bruja(String sigloNacimiento, String lugarResidencia, String nombre, String edad, String lugarNacimiento, int poderAtaque, int salud, int costo) {
        super(nombre, edad, lugarNacimiento, poderAtaque, salud, costo);
        this.sigloNacimiento = sigloNacimiento;
        this.lugarResidencia = lugarResidencia;
    }

    public String getSigloNacimiento() {
        return sigloNacimiento;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setSigloNacimiento(String sigloNacimiento) {
        this.sigloNacimiento = sigloNacimiento;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    @Override
    public String toString() {
        return super.toString()+"Bruja" + "\nsigloNacimiento=" + sigloNacimiento + "\nlugarResidencia=" + lugarResidencia;
    }

    @Override
    public void Atacar(Guerrero x) {
        x.setSalud(x.getSalud()-x.getPoderAtaque());
        x.setPoderAtaque(x.getPoderAtaque() + 10);
    }
    
    
}
