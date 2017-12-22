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
public class TorreN extends Pieza {

    public TorreN() {
        super("Torre", "Negras");
    }

    public TorreN(String Nombre, String Color) {
        super("Torre", "Negras");
    }

    @Override
    public boolean escoger(char[][] t, int i1, int j1) {
        boolean aux = false;

        if (i1 == 0 && (j1 != 0 && j1 != 7)) {

            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♘' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != '♘' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza--", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }//Fin if espacio alredero

        } else if (j1 == 0 && (i1 != 0 && i1 != 7)) {

            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♘' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != '♘' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != '♘' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }//Fin if espacio alredero
        } else if (i1 == 0 && j1 == 0) {
            if ((t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != '♘' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != '♘' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } else if (i1 == 7 && (j1 != 0 && j1 != 7)) {
            if ((t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != '♘' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != '♘' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != '♘' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }
        } else if (i1 == 7 && j1 == 0) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != '♘' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != '♘' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        } else if (i1 == 7 && j1 == 7) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != '♘' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != '♘' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        } else if (j1 == 7 && (i1 != 7 && i1 != 0)) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != '♘' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != '♘' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != '♘' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        } else if (i1 == 0 && j1 == 7) {
            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != '♘' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != '♘' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } else {

            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != '♘' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != '♘' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != '♘' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != '♘' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }//Fin if espacio alredero

        }

        return aux;

    }

    @Override
    public boolean ataque(char[][] t, int i1, int j1, int i2, int j2) {
        boolean aux = false;
       
        if (i2 != i1 && j2 != j1) {
            aux = true;
        }

        if (i2 != i1 && j2 == j1) {
           
            if (i2 > i1) {
                for (int x = i1 + 1; x < i2; x++) {
                    if (t[x][j2] != '⛝') {
                       
                        aux = true;
                        break;
                    }
                }
            }//FIn if 2
            else if (i2 < i1) {
                for (int x = i2 + 1; x < i1; x++) {
                    if (t[x][j2] != '⛝') {
                        
                        aux = true;
                        break;
                    }
                }//Fin del for
            }
        }//Fin if principal
        else if (i1 == i2 && j1 != j2) {
           
            if (j2 > j1) {
                for (int x = j1+1; x < j2; x++) {
                    if(t[i2][x]!='⛝'){
                        
                        aux = true;
                        break;
                    }
                }
            }//Fin segundo if
            else if(j2<j1){
                for (int x = j2+1; x < j1; x++) {
                    if(t[i2][x]!='⛝'){
                        
                        aux = true;
                        break;
                    }
                }
            }

        }//Fin if principal

        return aux;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}//Fin de la clase
