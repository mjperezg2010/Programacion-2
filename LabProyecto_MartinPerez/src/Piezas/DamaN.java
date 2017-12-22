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
public class DamaN extends Pieza {

    String Nombre, Color;

    public DamaN() {
        super("La Reina", "Negra");
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
    
     

    @Override
    public boolean ataque(char[][] t, int i1, int j1, int i2, int j2) {
        boolean aux = false;
        boolean aux1 = true;
        boolean torre = false;

        if ((i1 == i2 && j1 != j2) || (i1 != i2 && j1 == j2)) {
            aux = true;
            torre = true;

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
            torre = true;
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
                            torre = true;
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
                            torre = true;
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
                            torre = true;
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
                            torre = true;
                            break;
                        }
                        y--;

                    }

                }//Fin if principal

            }//Fin entrar a la validacion maxuma
        }

        if (torre) {
            
            aux=false;
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
                    for (int x = j1 + 1; x < j2; x++) {
                        if (t[i2][x] != '⛝') {

                            aux = true;
                            break;
                        }
                    }
                }//Fin segundo if
                else if (j2 < j1) {
                    for (int x = j2 + 1; x < j1; x++) {
                        if (t[i2][x] != '⛝') {

                            aux = true;
                            break;
                        }
                    }
                }

            }//Fin if principal
        }

        return aux;

    }//Fin metodoo ataque

}
