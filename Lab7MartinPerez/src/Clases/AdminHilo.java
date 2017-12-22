/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Productos.Productos;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mjper
 */
public class AdminHilo extends Thread {

    private boolean avanzar;
    private boolean vive;
    private Cliente cliente;

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

    public AdminHilo() {
        vive = true;
        avanzar=true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        System.out.println("joo---"+cliente.getOrden().getCajero().getNombre());
        //cliente.getOrden().getCajero().getVentana().setVisible(true);
        cliente.getOrden().getCajero().getVentana().getJl_cajero().setText(cliente.getOrden().getCajero().toString());
        
        while (vive) {
            
            //cliente.getOrden().getCajero().getVentana().setVisible(true);
            
            if (avanzar) {
                for (Productos li : cliente.getOrden().getListaproductos()) {
                    cliente.getOrden().getCajero().getVentana().getjTextField1().setText(li.toString());
                    try {
                        Thread.sleep(li.getTiempoprocesamiento() * 1000);
                    } catch (InterruptedException ex) {

                    }
                    
                    Object[] newrow = {
                        li.toString(),
                        cliente.toString(), li.getTiempoprocesamiento()};
                    DefaultTableModel modelo = (DefaultTableModel) cliente.getOrden().getCajero().getVentana().getJt_cajero().getModel();
                    modelo.addRow(newrow);
                    cliente.getOrden().getCajero().getVentana().getJt_cajero().setModel(modelo);
                    

                }//Fin for
                System.out.println("salio for");
                avanzar=false;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {

                }
            }//fIN FI
        }//Fin while

    }//7Fin metodo run

}//Fin clase
