/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiezasBlancas;

import Piezas.Pieza;
import javax.swing.JOptionPane;

/**
 *
 * @author mjper
 */
public class PeonB extends Pieza {

    public PeonB() {
        super("Peon", "Blancas");
    }

    @Override
    public boolean escoger(char[][] t, int i1, int j1) {
        boolean aux = false;

        //laterales
        //j=0
        if (j1 == 0) {
            if ((t[i1 - 1][j1] != '⛝')
                    && (t[i1 - 1][j1 + 1] != '♜' && t[i1 - 1][j1 + 1] != '♝' && t[i1 - 1][j1 + 1] != '♞' && t[i1 - 1][j1 + 1] != '♛' && t[i1 - 1][j1 + 1] != '♚' && t[i1 - 1][j1 + 1] != '♟')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //j==7
        } else if (j1 == 7) {
            if ((t[i1 - 1][j1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♜' && t[i1 - 1][j1 - 1] != '♝' && t[i1 - 1][j1 - 1] != '♞' && t[i1 - 1][j1 - 1] != '♛' && t[i1 - 1][j1 - 1] != '♚' && t[i1 - 1][j1 - 1] != '♟')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } else if (j1 != 7 && j1 != 0) {
            if ((t[i1 - 1][j1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♜' && t[i1 - 1][j1 - 1] != '♝' && t[i1 - 1][j1 - 1] != '♞' && t[i1 - 1][j1 - 1] != '♛' && t[i1 - 1][j1 - 1] != '♚' && t[i1 - 1][j1 - 1] != '♟')
                    && (t[i1 - 1][j1 + 1] != '♜' && t[i1 - 1][j1 + 1] != '♝' && t[i1 - 1][j1 + 1] != '♞' && t[i1 - 1][j1 + 1] != '♛' && t[i1 - 1][j1 + 1] != '♚' && t[i1 - 1][j1 + 1] != '♟')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        }

        return aux;
    }

    @Override
    public boolean ataque(char[][] t, int i1, int j1, int i2, int j2) {
        boolean aux = false;

        if (i2 == i1 - 1 && j2 == j1) {
            if (t[i2][j2] != '⛝') {
                aux = true;
            }

        } else if ((i2 == i1 - 1 && j2 == j1 + 1) || (i2 == i1 - 1 && j2 == j1 - 1)) {
            if (t[i2][j2] == '⛝') {
                aux = true;
            }

        } else if (i1 == 6) {
            if (i2 == i1 - 1 || i2 == i1 - 2) {
                aux = false;
            }else{
                aux = true;
            }
        } else {
            aux = true;
        }

        return aux;
    }

}
