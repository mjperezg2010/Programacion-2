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
public class AdminAstro  {
   
    
   private ArrayList<Astronauta> listaastro = new ArrayList();
    private File archivo = null;

    public AdminAstro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Astronauta> getListaastro() {
        return listaastro;
    }

    public void setListaastro(ArrayList<Astronauta> listaastro) {
        this.listaastro = listaastro;
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
            
            for (Astronauta t : listaastro) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    
    
    //
     
     
      public void cargararchivo(){
        try {
            listaastro = new ArrayList();
            Astronauta temp;
        if (archivo.exists()){
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try {
                while ((temp=(Astronauta)objeto.readObject())!=null) {
                    listaastro.add(temp);
                    
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
