
package Clases;

public class Mago extends Guerrero{
    
    private String tipoMagia,elementoFavorito;
   
    public Mago() {
    }

    public Mago(String tipoMagia, String elementoFavorito, String nombre, String edad, String lugarNacimiento, int poderAtaque, int salud, int costo) {
        super(nombre, edad, lugarNacimiento, poderAtaque, salud, costo);
        this.tipoMagia = tipoMagia;
        this.elementoFavorito = elementoFavorito;
    }

    public String getTipoMagia() {
        return tipoMagia;
    }

    public String getElementoFavorito() {
        return elementoFavorito;
    }

    public void setTipoMagia(String tipoMagia) {
        this.tipoMagia = tipoMagia;
    }

    public void setElementoFavorito(String elementoFavorito) {
        this.elementoFavorito = elementoFavorito;
    }

    @Override
    public String toString() {
        return super.toString() + "Mago" + "\n  tipoMagia=" + tipoMagia + "\n   elementoFavorito=" + elementoFavorito;
    }

    @Override
    public void Atacar(Guerrero x) {
        x.setSalud(x.getSalud()-(poderAtaque+x.getPoderAtaque()/2));
    }
    
    
}
