
package lab1_martinperez;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class Lab1_MartinPerez {

    static Scanner sca = new Scanner(System.in);

    
    public static void main(String[] args) {
        // TODO code application logic here
        int re = 0;
        do {
            boolean aux = true;

            JOptionPane.showMessageDialog(null, "Bienvenido al juego Tawlbwrdd");
            char[][] tablero = tablero();
            int i = 0, j = 0;

            imptab(tablero, i, j);

            do {
                boolean auxrey = false;

                //Turno de los atacantes
                tablero = atacantesturno(tablero);
                System.out.println("\n---------------------------------------------");
                tablero = eliminarpieza(tablero);
                imptab(tablero, i, j);

                //Turno de los defensores y rey
                tablero = defensoresreyturno(tablero);
                System.out.println("\n---------------------------------------------");
                tablero = eliminarpieza(tablero);
                imptab(tablero, i, j);
                System.out.println("\n");

                for (int k = 0; k < 11; k++) {
                    for (int l = 0; l < 11; l++) {
                        if (tablero[k][l] == 'X') {
                            auxrey = true;
                            break;
                        }
                    }
                }

                //Para ganar
                if (auxrey == false) {
                    aux = false;
                }
                if (tablero[0][0] == 'X' || tablero[0][10] == 'X' || tablero[10][0] == 'X' || tablero[10][10] == 'X') {
                    aux = false;
                }

            } while (aux);
            //Salir
            re = JOptionPane.showConfirmDialog(null, "¿Desea volver a jugar?");
        } while (re == 0);

    }//Fin del metodo main

    public static char[][] tablero() {
        char[][] tab = new char[11][11];
        int i = 0, j = 0;

        for (int k = 0; k < 11; k++) {
            for (int l = 0; l < 11; l++) {
                tab[k][l] = ' ';
            }

        }

        //Rey
        tab[5][5] = 'X';

        //Defensores horizontal
        tab[5][2] = '+';
        tab[5][3] = '+';
        tab[5][4] = '+';
        tab[5][6] = '+';
        tab[5][7] = '+';
        tab[5][8] = '+';
        //Defendores vertical
        tab[2][5] = '+';
        tab[3][5] = '+';
        tab[4][5] = '+';
        tab[6][5] = '+';
        tab[7][5] = '+';
        tab[8][5] = '+';

        //Atacantes horizontal
        tab[5][0] = '*';
        tab[5][1] = '*';
        tab[5][9] = '*';
        tab[5][10] = '*';

        tab[3][0] = '*';
        tab[4][0] = '*';
        tab[6][0] = '*';
        tab[7][0] = '*';

        tab[3][10] = '*';
        tab[4][10] = '*';
        tab[6][10] = '*';
        tab[7][10] = '*';

        //Atacantes vertical
        tab[0][5] = '*';
        tab[1][5] = '*';
        tab[9][5] = '*';
        tab[10][5] = '*';

        tab[0][3] = '*';
        tab[0][4] = '*';
        tab[0][6] = '*';
        tab[0][7] = '*';

        tab[10][3] = '*';
        tab[10][4] = '*';
        tab[10][6] = '*';
        tab[10][7] = '*';

        return tab;

    }

    //Imprimir matriz con recursion
    public static void imptab(char[][] tab, int i, int j) {
        if (i == 10 && j == 10) {
            System.out.print("[" + tab[i][j] + "]");
        } else {
            if (j == 10) {
                System.out.println("[" + tab[i][j] + "]");
                imptab(tab, i + 1, 0);
            } else {
                System.out.print("[" + tab[i][j] + "]");
                imptab(tab, i, j + 1);
            }
        }

    }//Fin del metod imprimir matriz

    public static boolean validacionmovimiento(char[][] tab,int x, int y) {
        boolean aux = false;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                //If p
                if (i == 0) {
                    if (tab[x][y] == '*' || tab[x][y] == '+' || tab[x][y] == 'X') {
                        if (tab[x][y + 1] != ' ' && tab[x][y - 1] == ' ' && tab[x+1][y] != ' ') {
                            aux = true;
                        }//Fin ultimo
                    }//Fin del if *

                }//Fin del if i==0
                else if(i==10){
                    if (tab[i][j] == '*' || tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i][j + 1] != ' ' && tab[i][j - 1] == ' ' && tab[i-1][j] != ' ') {
                            aux = true;
                        }//Fin ultimo
                    }//Fin del if *
                }
                else if(j==0){
                    if (tab[i][j] == '*' || tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i+1][j] != ' ' && tab[i-1][j] == ' ' && tab[i][j+1] != ' ') {
                            aux = true;
                        }//Fin ultimo
                    }//Fin del if *
                }else if (j==10){
                    if (tab[i][j] == '*' || tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i+1][j] != ' ' && tab[i-1][j] == ' ' && tab[i][j-1] != ' ') {
                            aux = true;
                        }//Fin ultimo
                    }//Fin del if *
                }else{
                    if (tab[i][j] == '*' || tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i][j + 1] != ' ' && tab[i][j - 1] == ' ' && tab[i+1][j] != ' ' && tab[i-1][j]!= ' ') {
                            aux = true;
                        }//Fin ultimo
                    }//Fin del if *
                    
                }
                
                    
                    
                    
               

                }//for 2 de la matriz

            }//for 1 de la matriz

            return aux;
        }

    

    public static char[][] atacantesturno(char[][] tab) {
        boolean aux = false;
        //Posicion de la ficha
        int posex = 0, posey = 0;
        //Pocision a mover
        int posx = 0, posy = 0;
        System.out.println("\n----------------------------------------------");
        JOptionPane.showMessageDialog(null, "Turno de los atacantes");

        //Escoger pieza
        JOptionPane.showMessageDialog(null, "Escriba las coordenadas de la pieza a elegir\nIngrese las coordenadas en numeros");
        //Ingresar posiciones de la pieza
        do {
            //Posiciones originales
            System.out.print("Ingrese la posicion (x) de la pieza que desea mover: ");
            posex = sca.nextInt();
            while (posex > 11 || posex < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posex = sca.nextInt();
            }
            System.out.print("Ingrese la posicion (y) de la pieza que desea mover: ");
            posey = sca.nextInt();
            while (posey > 11 || posey < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posey = sca.nextInt();
            }
            
            aux = validacionmovimiento(tab,posex,posey);

            if (tab[posex][posey] != '*' || aux) {
                JOptionPane.showMessageDialog(null, "Pieza equivocada");
                aux = true;

            }
            

            

        } while (aux);//Fin del while pocsiciones

        JOptionPane.showMessageDialog(null, "Escriba las coordenadas a la cual debe moverse\nIngrese las coordenadas en numeros");
        boolean aux1 = false;

        //Posiciones a la cual mover
        do {
            System.out.print("Ingrese la posicion (x) a la cual moverse: ");
            posx = sca.nextInt();
            while (posx > 11 || posx < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posx = sca.nextInt();
            }
            System.out.print("Ingrese la posicion (y) a la cual moverse");
            posy = sca.nextInt();
            while (posy > 11 || posy < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posy = sca.nextInt();
            }
            //Validar movimientos
            if (tab[posx][posy] != ' ' || (posex != posx && posey != posy)) {
                JOptionPane.showMessageDialog(null, "Movimiento erroneo\nIngrese las coordenadas otra vez");
                aux1 = true;

            }
        } while (aux1);//Fin while posicones a mover

        //Movimientos
        tab[posex][posey] = ' ';
        tab[posx][posy] = '*';

        return tab;

    }//Fin del metodo atacantes turno

    public static char[][] defensoresreyturno(char[][] tab) {
        boolean aux = false;
        //Posicion de la ficha
        int posex = 0, posey = 0;
        //Pocision a mover
        int posx = 0, posy = 0;
        System.out.println("\n----------------------------------------------");
        JOptionPane.showMessageDialog(null, "Turno de los defensores y Rey");

        //Escoger pieza
        JOptionPane.showMessageDialog(null, "Escriba las coordenadas de la pieza a elegir\nIngrese las coordenadas en numeros");
        //Ingresar posiciones de la pieza
        do {
            //Posiciones originales
            System.out.print("Ingrese la posicion (x) de la pieza que desea mover: ");
            posex = sca.nextInt();
            while (posex > 11 || posex < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posex = sca.nextInt();
            }
            System.out.print("Ingrese la posicion (y) de la pieza que desea mover: ");
            posey = sca.nextInt();
            while (posey > 11 || posey < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posey = sca.nextInt();
            }

            if (tab[posex][posey] != '+' && tab[posex][posey] != 'X') {
                JOptionPane.showMessageDialog(null, "Pieza equivocada\nIngrese otra posicion");
                aux = true;
            }
            
            aux = validacionmovimiento(tab);

        } while (aux);//Fin del while pocsiciones

        JOptionPane.showMessageDialog(null, "Escriba las coordenadas a la cual debe moverse\nIngrese las coordenadas en numeros");
        boolean aux1 = false;

        //Posiciones a la cual mover
        do {
            System.out.print("Ingrese la posicion (x) a la cual moverse: ");
            posx = sca.nextInt();
            while (posx > 11 || posx < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posx = sca.nextInt();
            }
            System.out.print("Ingrese la posicion (y) a la cual moverse");
            posy = sca.nextInt();
            while (posy > 11 || posy < 0) {
                System.out.print("Error posicion invalida\nIngrese otra:");
                posy = sca.nextInt();
            }
            //Validar movimientos
            if (tab[posx][posy] != ' ' || (posex != posx && posey != posy)) {
                JOptionPane.showMessageDialog(null, "Movimiento erroneo\nIngrese las coordenadas otra vez");
                aux1 = true;

            }
        } while (aux1);//Fin while posicones a mover

        //Movimientos
        //Posiciones pra mover al rey y defensores
        if (tab[posex][posey] == 'X') {
            tab[posx][posy] = 'X';
            tab[posex][posey] = ' ';
        } else {
            tab[posex][posey] = ' ';
            tab[posx][posy] = '+';
        }
        

        return tab;

    }//fin del metodo defensoresrertun

    public static char[][] eliminarpieza(char[][] tab) {

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                //If p
                if (i == 0 || i == 10) {
                    if (tab[i][j] == '*') {
                        if ((tab[i][j + 1] == '+' || tab[i][j + 1] == 'X') && (tab[i][j - 1] == '+' || tab[i][j - 1] == 'X')) {
                            tab[i][j] = ' ';
                        }//Fin ultimo
                    }//Fin del if *
                    if (tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i][j + 1] == '*' && tab[i][j - 1] == '*') {
                            tab[i][j] = ' ';
                        }//Fin ultimo 
                    }
                }//Fin del if i==0
                else if (j == 0 || j == 10) {
                    if (tab[i][j] == '*') {
                        if ((tab[i + 1][j] == '+' || tab[i + 1][j] == 'X') && (tab[i - 1][j] == '+' || tab[i - 1][j] == 'X')) {
                            tab[i][j] = ' ';
                        }//Fin ultimo
                    }//Fin del if *
                    if (tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i + 1][j] == '*' && tab[i - 1][j] == '*') {
                            tab[i][j] = ' ';
                        }//Fin ultimo 
                    }
                } else {
                    if (tab[i][j] == '*') {
                        if ((tab[i][j + 1] == '+' || tab[i][j + 1] == 'X') && (tab[i][j - 1] == '+' || tab[i][j - 1] == 'X')) {
                            tab[i][j] = ' ';
                        }//Fin ultimo
                        if ((tab[i + 1][j] == '+' || tab[i + 1][j] == 'X') && (tab[i - 1][j] == '+' || tab[i - 1][j] == 'X')) {
                            tab[i][j] = ' ';
                        }//Fin ultimo
                    }//Fin del if *

                    if (tab[i][j] == '+' || tab[i][j] == 'X') {
                        if (tab[i][j + 1] == '*' && tab[i][j - 1] == '*') {
                            tab[i][j] = ' ';
                        }//Fin ultimo 
                        if (tab[i + 1][j] == '*' && tab[i - 1][j] == '*') {
                            tab[i][j] = ' ';
                        }//Fin ultimo 
                    }

                }//Fin del else

            }//for 2 de la matriz

        }//for 1 de la matriz

        return tab;
    }

}//Fin de laclase
