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
public class ReyN extends Pieza {

    String Nombre, Color;

    public ReyN() {
        super("El rey", "Negra");
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public boolean escoger(char[][] t, int i1, int j1) {
        boolean aux = false;
        //Esquinaes
        //1,0
        if (i1 == 0 && j1 == 0) {
            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != 'c' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != 'c' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //7,0
        } else if (i1 == 7 && j1 == 0) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != 'c' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != 'c' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

            //7,7
        } else if (i1 == 7 && j1 == 7) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != 'c' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != 'c' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //0,7
        } else if (i1 == 0 && j1 == 7) {
            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != 'c' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != 'c' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //Laterales
            //i==0
        } else if (i1 == 0 && (j1 != 0 && j1 != 7)) {
            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != 'c' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != 'c' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != 'c' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //j1==0
        } else if (j1 == 0 && (i1 != 0 && i1 != 7)) {
            if ((t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != 'c' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != 'c' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != 'c' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //i==7
        } else if (i1 == 7 && (j1 != 0 && j1 != 7)) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != 'c' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != 'c' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != 'c' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
            //j==7
        } else if (j1 == 7 && (i1 != 0 && i1 != 7)) {
            if ((t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != 'c' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != 'c' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != 'c' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')) {

            }
        } else {
            if ((t[i1 + 1][j1] != '♖' && t[i1 + 1][j1] != '♗' && t[i1 + 1][j1] != 'c' && t[i1 + 1][j1] != '♕' && t[i1 + 1][j1] != '♔' && t[i1 + 1][j1] != '♙' && t[i1 + 1][j1] != '⛝')
                    && (t[i1 - 1][j1] != '♖' && t[i1 - 1][j1] != '♗' && t[i1 - 1][j1] != 'c' && t[i1 - 1][j1] != '♕' && t[i1 - 1][j1] != '♔' && t[i1 - 1][j1] != '♙' && t[i1 - 1][j1] != '⛝')
                    && (t[i1][j1 + 1] != '♖' && t[i1][j1 + 1] != '♗' && t[i1][j1 + 1] != 'c' && t[i1][j1 + 1] != '♕' && t[i1][j1 + 1] != '♔' && t[i1][j1 + 1] != '♙' && t[i1][j1 + 1] != '⛝')
                    && (t[i1][j1 - 1] != '♖' && t[i1][j1 - 1] != '♗' && t[i1][j1 - 1] != 'c' && t[i1][j1 - 1] != '♕' && t[i1][j1 - 1] != '♔' && t[i1][j1 - 1] != '♙' && t[i1][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        }//Fin else

        return aux;
    }
    /*
        //Negras
        ♜  Torre
        ♝  Alfil
        ♞  Caballo
        ♟  PEON
        ♛ reina
        ♚ rey
        
        //Blancas
        ♔ Rey
        ♕ REina
        ♖ toorre
        ♗ Alfil
        ♘ Caballo
        ♙Peon
            
        ⛝ vacio
        
        */

    @Override
    public boolean ataque(char[][] t, int i1, int j1, int i2, int j2) {
        boolean aux = false;

        if ((i2 != i1 - 1 || j2 != j1)
                && (i2 != i1 + 1 || j2 != j1)
                && (i2 != i1 || j2 != j1 + 1)
                && (i2 != i1 || j2 != j1 - 1)) {
            aux=true;

        }

        return aux;
    }//Fin metodo ataque

}//Fin de la clasee
