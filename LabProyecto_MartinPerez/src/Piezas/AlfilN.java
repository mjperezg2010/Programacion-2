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
public class AlfilN extends Pieza {

    public AlfilN() {
        super("Alfil", "Negras");
    }

    @Override
    public boolean escoger(char[][] t, int i1, int j1) {
        boolean aux = false;
        //Esquinas
        if (i1 == 0 && j1 == 0) {
            if ((t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        } else if (i1 == 7 && j1 == 0) {
            if (t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝') {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 7 && j1 == 7) {
            if (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝') {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 0 && j1 == 7) {
            if (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝') {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 0 && (j1 != 0 && j1 != 7)) {
            if ((t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

            }

        } else if (j1 == 0 && (i1 != 0 && i1 != 7)) {
            if ((t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (i1 == 7 && (j1 != 0 && j1 != 7)) {
            if ((t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else if (j1 == 7 && (i1 != 0 && i1 != 7)) {
            if ((t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }

        } else {
            if ((t[i1 + 1][j1 + 1] != '♖' && t[i1 + 1][j1 + 1] != '♗' && t[i1 + 1][j1 + 1] != '♕' && t[i1 + 1][j1 + 1] != '♔' && t[i1 + 1][j1 + 1] != '♙' && t[i1 + 1][j1 + 1] != '⛝')
                    && (t[i1 + 1][j1 - 1] != '♖' && t[i1 + 1][j1 - 1] != '♗' && t[i1 + 1][j1 - 1] != '♕' && t[i1 + 1][j1 - 1] != '♔' && t[i1 + 1][j1 - 1] != '♙' && t[i1 + 1][j1 - 1] != '⛝')
                    && (t[i1 - 1][j1 + 1] != '♖' && t[i1 - 1][j1 + 1] != '♗' && t[i1 - 1][j1 + 1] != '♕' && t[i1 - 1][j1 + 1] != '♔' && t[i1 - 1][j1 + 1] != '♙' && t[i1 - 1][j1 + 1] != '⛝')
                    && (t[i1 - 1][j1 - 1] != '♖' && t[i1 - 1][j1 - 1] != '♗' && t[i1 - 1][j1 - 1] != '♕' && t[i1 - 1][j1 - 1] != '♔' && t[i1 - 1][j1 - 1] != '♙' && t[i1 - 1][j1 - 1] != '⛝')) {
                JOptionPane.showMessageDialog(null, "No puede mover esta pieza", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;

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

        }//Fin del else
        return aux;
    }

    @Override
    public boolean ataque(char[][] t, int i1, int j1, int i2, int j2) {
        boolean aux = false;
        boolean aux1 = true;

        if ((i1 == i2 && j1 != j2) || (i1 != i2 && j1 == j2)) {
            aux = true;

        }
        int n1 = (i2 - i1);
        int n2 = (j2 - j1);

        if (n1 < 0) {
            n1 = n1 * -1;
        }
        if (n2 < 0) {
            n2 = n2 * -1;
        }

        if (n1 != n2) {
            
            aux1 = false;
            aux = true;
        }

        if (aux1) {
            if (i1 != i2 && j1 != j2) {
                //If diagonal 1  los dos positivos
                if (i2 > i1 && j2 > j1) {
                    int y = j1 + 1;
                    for (int x = i1 + 1; x < i2; x++) {

                        if (t[x][y] != '⛝') {
                           
                            aux = true;
                            break;
                        }
                        y++;
                    }
                }//Fin segundo if
                //If 2 i-  y j+
                else if (i2 < i1 && j2 > j1) {
                    int y = j1 + 1;
                    for (int x = i1 - 1; x < i2; x--) {
                        if (t[x][y] != '⛝') {
                            
                            aux = true;
                            break;
                        }
                        y++;
                    }

                }//Fin del segundo if
                //i+ ,  j-0
                else if (i2 > i1 && j2 < j1) {
                    
                    int y = j1 - 1;
                    for (int x = i1 + 1; x < i2; x++) {
                        if (t[x][y] != '⛝') {
                            
                            aux = true;
                            break;
                        }
                        y--;
                    }

                }//Fn segundo if
                //i- , j-
                else if (i2 < i1 && j2 < j1) {
                    int y = j1 - 1;
                    for (int x = i1 - 1; x < j2; x--) {
                        if (t[x][y] != '⛝') {
                            
                            aux = true;
                            break;
                        }
                        y--;

                    }

                }//Fin if principal

            }//Fin entrar a la validacion maxuma
        }
            return aux;
        }//Fin metodo ataque

    }//Fin de la clase alfil
