/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class adminOrden {
    private ArrayList <Orden> listaPersona = new ArrayList();
    private File archivo = null;

    public adminOrden(String path) {
         archivo = new File(path);
    }

    
    
    
    
    public ArrayList<Orden> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Orden> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    
    
    
}
