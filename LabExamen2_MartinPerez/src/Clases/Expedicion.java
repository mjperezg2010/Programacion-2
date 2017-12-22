/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author mjper
 */
public class Expedicion extends Thread {
    private JProgressBar venida;
    private JProgressBar ida;
   
    private boolean avanzar;
    private boolean vive;
    private Nave_espacial nave;
    private Planeta planeta;
    

    public Expedicion() {
        this.nave=nave;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getVenida() {
        return venida;
    }

    public void setVenida(JProgressBar venida) {
        this.venida = venida;
    }

    public JProgressBar getIda() {
        return ida;
    }

    public Nave_espacial getNave() {
        return nave;
    }

    public void setNave(Nave_espacial nave) {
        this.nave = nave;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
    

    public void setIda(JProgressBar ida) {
        this.ida = ida;
    }
    
    

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    
    
           
            
            
   
   
    
    
    
    
    @Override
    public void run(){
        nave.setPlaneta(planeta);
        
        double tiempovenida= nave.CalcularTiemporegreso()*1000;
         double tiempoida =   nave.CalcularTiempoida()*1000;
         int t= (int) tiempoida;
         int tu= (int)tiempovenida;
         ida.setMaximum(t);
         while(vive){
            if(avanzar){
                ida.setValue(ida.getValue()+1);
                ida.setString(ida.getValue()+ " segundos de "+tiempoida);
                
                if(ida.getValue()==tiempoida){
                    vive=false;
                    JOptionPane.showMessageDialog(null , "La nave llego");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                
                
                //if (avanzar=false){
                    
               // }
            }//Fin if avanzar
            else{
                venida.setValue(venida.getValue()+1);
                
                venida.setString(venida.getValue()+ " segundos de "+tiempovenida);
                if(ida.getValue()==tiempovenida){
                    vive=false;
                    JOptionPane.showMessageDialog(null , "La nave regreso");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }//FIn while vive
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
