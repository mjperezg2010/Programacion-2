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
public class Personas {
    protected String username,password,correo,nombrec,id,fecha;

    public Personas() {
    }

    public Personas(String username, String password, String correo, String nombrec, String id, String fecha) {
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.nombrec = nombrec;
        this.id = id;
        this.fecha = fecha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Personas{" + "username=" + username + ", password=" + password + ", correo=" + correo + ", nombrec=" + nombrec + ", id=" + id + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
