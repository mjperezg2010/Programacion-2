/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piezas;

import javax.swing.JOptionPane;

/**
 *
 * @author mjper
 */
public class CaballoN extends Pieza {

    public CaballoN() {
        super("Caballo", "Negras");
    }

    @Override
    public boolean escoger(char[][] t, int i1, int j1) {
        boolean aux = false;
        //Cuantro esquinas
        // 0,0
        if (i1 == 0 && j1 == 0) {
            if ((t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }
            //7,0
        } else if (i1 == 7 && j1 == 0) {
            if ((t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //7,7
        } else if (i1 == 7 && j1 == 7) {
            if ((t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //0,7
        } else if (i1 == 0 && j1 == 7) {
            if ((t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //Fin esquinas
            //laterales
        } else if (i1 == 0 && (j1 != 0 && j1 != 7 && j1 != 1 && j1 != 6)) {
            if ((t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } else if (j1 == 0 && (i1 != 0 && i1 != 7 && i1 != 1 && i1 != 6)) {
            if ((t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 7 && (j1 != 0 && j1 != 7 && j1 != 1 && j1 != 6)) {

            if ((t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } else if (j1 == 7 && (i1 != 0 && i1 != 7 && i1 != 1 && i1 != 6)) {

            if ((t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //Fin laterales
            //Esquinas interiores
            //0,1
        } else if (i1 == 0 && j1 == 1) {
            if ((t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //1,0
        } else if (i1 == 1 && j1 == 0) {
            if ((t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            // 6,0
        } else if (i1 == 6 && j1 == 0) {
            if ((t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //7,1
        } else if (i1 == 7 && j1 == 1) {
            if ((t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //7,6
        } else if (i1 == 7 && j1 == 6) {
            if ((t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza--", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //6,7

        } else if (i1==6 && j1==7) {
            if ((t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza--", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            // 1,7
        } else if (i1 == 1 && j1 == 7) {
            if ((t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza--", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }
            //0,6
        } else if (i1 == 0 && j1 == 6) {
            System.out.println("hola");
            if ((t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza--", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //Esquinas interiores finales
            //1,1

        } else if (i1 == 1 && j1 == 1) {
            if ((t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza--", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }
            //6,1

        } else if (i1 == 6 && j1 == 1) {

            if ((t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

            //6,6
        } else if (i1 == 6 && j1 == 6) {
            if ((t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //1,6
        } else if (i1 == 1 && j1 == 6) {
            if ((t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //laterales interiores final
            //
        } else if (j1 == 2 && (11 != 0 && j1 != 1 && j1 != 6 && j1 != 7)) {
            if ((t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 6 && (j1 != 0 && j1 != 1 && j1 != 6 && j1 != 7)) {
            if ((t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        } else if (j1 == 6 && (11 != 0 && j1 != 1 && j1 != 6 && j1 != 7)) {
            if ((t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 1 && (j1 != 0 && j1 != 1 && j1 != 6 && j1 != 7)) {
            if ((t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } else {

            if ((t[i1 + 2][j1 + 1] != '♖' && t[i1 + 2][j1 + 1] != '♗' && t[i1 + 2][j1 + 1] != '♕' && t[i1 + 2][j1 + 1] != '♔' && t[i1 + 2][j1 + 1] != '♙' && t[i1 + 2][j1 + 1] != '⛝')
                    && (t[i1 - 2][j1 + 1] != '♖' && t[i1 - 2][j1 + 1] != '♗' && t[i1 - 2][j1 + 1] != '♕' && t[i1 - 2][j1 + 1] != '♔' && t[i1 - 2][j1 + 1] != '♙' && t[i1 - 2][j1 + 1] != '⛝')
                    && (t[i1 + 2][j1 - 1] != '♖' && t[i1 + 2][j1 - 1] != '♗' && t[i1 + 2][j1 - 1] != '♕' && t[i1 + 2][j1 - 1] != '♔' && t[i1 + 2][j1 - 1] != '♙' && t[i1 + 2][j1 - 1] != '⛝')
                    && (t[i1 - 2][j1 - 1] != '♖' && t[i1 - 2][j1 - 1] != '♗' && t[i1 - 2][j1 - 1] != '♕' && t[i1 - 2][j1 - 1] != '♔' && t[i1 - 2][j1 - 1] != '♙' && t[i1 - 2][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 + 2] != '♖' && t[i1 - 1][j1 + 2] != '♗' && t[i1 - 1][j1 + 2] != '♕' && t[i1 - 1][j1 + 2] != '♔' && t[i1 - 1][j1 + 2] != '♙' && t[i1 - 1][j1 + 2] != '⛝')
                    && (t[i1 + 1][j1 + 2] != '♖' && t[i1 + 1][j1 + 2] != '♗' && t[i1 + 1][j1 + 2] != '♕' && t[i1 + 1][j1 + 2] != '♔' && t[i1 + 1][j1 + 2] != '♙' && t[i1 + 1][j1 + 2] != '⛝')
                    && (t[i1 + 1][j1 - 2] != '♖' && t[i1 + 1][j1 - 2] != '♗' && t[i1 + 1][j1 - 2] != '♕' && t[i1 + 1][j1 - 2] != '♔' && t[i1 + 1][j1 - 2] != '♙' && t[i1 + 1][j1 - 2] != '⛝')
                    && (t[i1 - 1][j1 - 2] != '♖' && t[i1 - 1][j1 - 2] != '♗' && t[i1 - 1][j1 - 2] != '♕' && t[i1 - 1][j1 - 2] != '♔' && t[i1 - 1][j1 - 2] != '♙' && t[i1 - 1][j1 - 2] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }
        }

        return aux;

    }//FIn metodo escoger
    
   

    @Override
    public boolean ataque(char[][] t, int i1, int j1, int i2, int j2) {
       boolean aux=false;
       
       if((j2!=j1+1 || i2!=i1-2)
               && (i2!=i1-2 || j2!=j1-1)
               && (i2!=i1-1 || j2!=j1+2)
               && (i2!=i1-1 || j2!=j1-2)
               && (i2!=i1+1 || j2!=j1-2)
               && (i2!=i1+1 || j2!=j1+2)
               && (i2!=i1+2 || j2!=j1-1)
               && (i2!=i1+2 || j2!=j1+1)
               ){
           aux=true;
           
       }
       
       
       
       
       return aux;
    }

   

}//Fin de la clase
