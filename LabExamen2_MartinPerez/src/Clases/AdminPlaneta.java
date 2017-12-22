/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class AdminPlaneta {
     private ArrayList<Planeta> listaplanets = new ArrayList();
    private File archivo = null;

    public AdminPlaneta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planeta> getListaplanets() {
        return listaplanets;
    }

    public void setListaplanets(ArrayList<Planeta> listaplanets) {
        this.listaplanets = listaplanets;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
     public void escribirArchivo() throws IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw= null;
        
        try {
            fw= new FileOutputStream(archivo);
            bw= new ObjectOutputStream(fw);
            
            for (Planeta t : listaplanets) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    
    
    public void cargararchivo(){
        try {
            listaplanets = new ArrayList();
            Planeta temp;
        if (archivo.exists()){
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                while ((temp=(Planeta)objeto.readObject())!=null) {
                    listaplanets.add(temp);
                    
                }
                
            } catch (Exception e) {
                //Encontro el final del archivo
            }
            objeto.close();
            entrada.close();
            
        }//Fin if
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//Fin metod cargar archivo
    
    
    
    
    
}
