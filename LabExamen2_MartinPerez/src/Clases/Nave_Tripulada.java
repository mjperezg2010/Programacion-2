/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author mjper
 */
public class Nave_Tripulada extends Nave_espacial{
    
    private String lugar_despeje;
    ArrayList <Astronauta> listastro = new ArrayList();

    public Nave_Tripulada(String lugar_despeje, String num, String velocidad, Planeta planeta) {
        super(num, velocidad, planeta);
        this.lugar_despeje = lugar_despeje;
    }

    public Nave_Tripulada() {
        super();
    }

    
    
    
    public String getLugar_despeje() {
        return lugar_despeje;
    }

    public void setLugar_despeje(String lugar_despeje) {
        this.lugar_despeje = lugar_despeje;
    }

    public ArrayList<Astronauta> getListastro() {
        return listastro;
    }

    public void setListastro(ArrayList<Astronauta> listastro) {
        this.listastro = listastro;
    }

  

    @Override
    public String toString() {
        return "Nave_Tripulada"+super.getNum();
    }

    @Override
    public double CalcularTiempoida() {
        double tiempoida=0.0;
        double sumapeso=0.0;
         for (Astronauta astronauta : listastro) {
            sumapeso+=Double.parseDouble(astronauta.getPeso());
        }
        return tiempoida=Double.parseDouble(super.getPlaneta().getDistancia())/  (Double.parseDouble(super.velocidad)*((sumapeso*sumapeso)/100)) ;
    }

    @Override
    public double CalcularTiemporegreso() {
         double sumapeso=0.0;
        
        double tiemporegreso=0.0;
        for (Astronauta astronauta : listastro) {
            sumapeso+=Double.parseDouble(astronauta.getPeso());
        }
        
       return tiemporegreso=Double.parseDouble(super.getPlaneta().getDistancia())/  ((Double.parseDouble(super.velocidad)*(sumapeso)/100)) ;
        
        
        
    }
    
    
    
    
    
}
