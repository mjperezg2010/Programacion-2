
package Clases;

public class Arquero extends Guerrero{
    
    private String materialArco, materialArmadura;

    public Arquero(String materialArco, String materialArmadura, String nombre, String edad, String lugarNacimiento, int poderAtaque, int salud, int costo) {
        super(nombre, edad, lugarNacimiento, poderAtaque, salud, costo);
        this.materialArco = materialArco;
        this.materialArmadura = materialArmadura;
    }

    public Arquero() {
    }

    public String getMaterialArco() {
        return materialArco;
    }

    public String getMaterialArmadura() {
        return materialArmadura;
    }

    public void setMaterialArco(String materialArco) {
        this.materialArco = materialArco;
    }

    public void setMaterialArmadura(String materialArmadura) {
        this.materialArmadura = materialArmadura;
    }

    @Override
    public String toString() {
        return super.toString()+"Arquero" + "\nmaterialArco=" + materialArco + "\nmaterialArmadura=" + materialArmadura;
    }

    @Override
    public void Atacar(Guerrero x) {
        x.setSalud(x.getSalud()-poderAtaque);
        salud += 10;
    }
    
    
    
}
