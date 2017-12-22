/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesM;

/**
 *
 * @author mjper
 */
public class Empleados extends Personas{
    private String horario;
    private int producto;

    

    public Empleados() {
        super();
    }

    public Empleados(String horario, int producto, String username, String password, String correo, String nombrec, String id, String fecha) {
        super(username, password, correo, nombrec, id, fecha);
        this.horario = horario;
        this.producto = producto;
    }
    

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getProducto() {
        return producto;
    }
    
    
    

    public void setProducto(int producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Empleados{" + "horario=" + horario + ", producto=" + producto + '}';
    }

   
    
    
    
}
