/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mjper
 */
public class Universo {
    private String nombre;
    private ArrayList<Seres_Vivos> listaseresvivos= new ArrayList();
     private File archivo=null;

    public Universo(String path) {
        archivo = new File(path);
    }

    public Universo() {
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seres_Vivos> getListaseresvivos() {
        return listaseresvivos;
    }

    public void setListaseresvivos(ArrayList<Seres_Vivos> listaseresvivos) {
        this.listaseresvivos = listaseresvivos;
    }
    
    
    //Agregar al arrayList
    public void agregarservivo(Seres_Vivos ser) {
        this.listaseresvivos.add(ser);
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Seres_Vivos t : listaseresvivos) {
                bw.write(t.getRaza() + "|");
                bw.write(t.getKi() + "|");
                bw.write(t.getMaximoaños() + "|");
                bw.write(t.getNombreplaneta()+"|");
                bw.write("\n");
            }
            
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        if (archivo.exists()) {
            Scanner sc = null;
            listaseresvivos = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("\\|");
                while (sc.hasNext()) {
                   // System.out.println(sc.next());
                    
                    listaseresvivos.add(new Seres_Vivos(sc.next(),sc.next(),sc.next(),sc.next()));
                    
                }
                
            } catch (Exception e) {
            }
            
            sc.close();
        }//Fin del if 
    }
    
    
    
    
    
}
