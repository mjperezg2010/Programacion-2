/*
Cosas  en lasque me quede
- validando para el el aflifil
 */
package labproyecto_martinperez;

import ClasesProyecto.Tablero;
import PiezasBlancas.*;
import Piezas.*;
import javax.swing.JOptionPane;

public class LabProyecto_MartinPerez {

    //Llamar clase tablero
    static Tablero tab = new Tablero(Tableroinicial());

    public static void main(String[] args) {
        //Inicio
        //fondo();

        //Fin de respuesta usuario
        int res = 0;

        //Boolean para fin del juego
        boolean finjuego = true;

        //Tablero matriz
        char[][] Juego = new char[8][8];

        Juego = tab.getTablero();
        //Clasede herencia

        ////////////////////Comienzo del juego
        do {//Do para volver a comenzar el juego
            JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de ajedrez!", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, tab.getInformacion());
            JOptionPane.showMessageDialog(null, tab.getReglas());
            JOptionPane.showMessageDialog(null, tab.getMovimientos());
            Juego=Tableroinicial();
            Piezas(Juego);
            boolean jaque;
             

            do {
               
                //Impirmir prueba 2
                System.out.println("------------------------------------\n");
                imprimir(Juego);

                //------------------------------Desarrollo del juego------------------------------------------
                //Turno inicial
                JOptionPane.showMessageDialog(null, "Empieza el jugardor 1 Negras (Mayusculas)");
                Juego = Turno1(Juego);
                imprimir(Juego);
                jaque = RecorrerTablero1(Juego, 0, 0);
                if (jaque == false) {
                    JOptionPane.showMessageDialog(null, "HA ganado el jugador 1");
                    break;

                }

                JOptionPane.showMessageDialog(null, "Empieza turno jugador 2");
                Juego = Turno2(Juego);
                imprimir(Juego);
                jaque = RecorrerTablero2(Juego, 0, 0);
                if (jaque == false) {
                    JOptionPane.showMessageDialog(null, "HA ganado el jugador 2");
                    break;

                }

                //Fin juego
            } while (finjuego);

            res = JOptionPane.showConfirmDialog(null, "¡El juego a finalizado!\n¿Le gustaria volver a comenzar?", "Finalizado", JOptionPane.YES_NO_OPTION);

        } while (res == 0);//Fin del do para comenzar de nuevo el juego

    }//Fin del metodo main

    public static char[][] Tableroinicial() {
        char[][] tab = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tab[i][j] = '⛝';

            }

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
        
        
        
        
         */

        //Las negras
        //Principales
        tab[0][0] = '♜';
        tab[0][7] = '♜';
        tab[0][1] = '♞';
        tab[0][6] = '♞';
        tab[0][2] = '♝';
        tab[0][5] = '♝';
        tab[0][3] = '♛';
        tab[0][4] = '♚';

        //Peones
        tab[1][0] = '♟';
        tab[1][1] = '♟';
        tab[1][2] = '♟';
        tab[1][3] = '♟';
        tab[1][4] = '♟';
        tab[1][5] = '♟';
        tab[1][6] = '♟';
        tab[1][7] = '♟';

        //Las blancas
        //Principales
        tab[7][0] = '♖';
        tab[7][7] = '♖';
        tab[7][1] = '♘';
        tab[7][6] = '♘';
        tab[7][2] = '♗';
        tab[7][5] = '♗';
        tab[7][3] = '♔';
        tab[7][4] = '♕';
        //pEONES
        tab[6][0] = '♙';
        tab[6][1] = '♙';
        tab[6][2] = '♙';
        tab[6][3] = '♙';
        tab[6][4] = '♙';
        tab[6][5] = '♙';
        tab[6][6] = '♙';
        tab[6][7] = '♙';

        //tab[5][0] = 'i';
        //MOdificacones
        return tab;

    }

    public static void imprimir(char[][] tab) {

        System.out.println("----------TABLERO------------\n");

        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("   " + k);
                    //se+="   " + k;

                }
                for (int k = 4; k < 8; k++) {
                    System.out.print("    " + k);
                    //se+="   " + k;

                }
                System.out.println(" ");
                //se+=" \n";
            }
            for (int j = 0; j < 8; j++) {

                if (j == 0) {
                    
                        System.out.print(i + " "+tab[i][j]);
                    //else if(j!=7 && tab[]){
                    //  System.out.print(i + "| " + tab[i][j]);
                    //se+=i + " | " + tab[i][j];
                    // }

                } else {

                    System.out.print(" | " + tab[i][j]);
                    //se+="|  " + tab[i][j];

                }

            }

            System.out.println(" |");
            //se+="|";

            if (i != 7) {
                System.out.println("  ____________________________________");
                //se+="  ________________________________";

            }

        }

    }//Fin del metodo imprimir

    public static void Piezas(char[][] Juego) {

        tab.imprimirTablero(Juego, 0, 0);
        JOptionPane.showMessageDialog(null, "Este es el tablero: \n" + tab.piezasne());
        JOptionPane.showMessageDialog(null, tab.piezasbla());

    }

    public static char[][] Turno1(char[][] t) {

        int i1 = 0, j1 = 0;
        int i2 = 0, j2 = 0;

        JOptionPane.showMessageDialog(null, "Elija las piezas a mover: ","Jugador1",JOptionPane.INFORMATION_MESSAGE);
        //Validar no se salga del tablero o pieza este vacia
        boolean aux = false;
        do {
            try{
            aux = false;
            i1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fila: ","Jugador1",JOptionPane.INFORMATION_MESSAGE));
            while (i1 < 0 || i1 > 7) {
                i1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la fila: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
            }

            j1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la columna: ","Jugador1",JOptionPane.INFORMATION_MESSAGE));
            while (j1 < 0 || j1 > 7) {
                j1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la columna: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
            }
            //Validar no agarre pieza que no es del o vacia
            //  T, A, C , D , R , +
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
        
        
        
        
         */
            if (t[i1][j1] != '♛' && t[i1][j1] != '♝' && t[i1][j1] != '♞' && t[i1][j1] != '♜' && t[i1][j1] != '♚' && t[i1][j1] != '♟') {
                JOptionPane.showMessageDialog(null, "Las posiciones ingresadas no contiene las piezas del jugador\nIntente de nuevo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
                //Else if de las torre

            } else if (t[i1][j1] == '♜') {
                Pieza p = new TorreN();
                JOptionPane.showMessageDialog(null, "" + p);
                aux = p.escoger(t, i1, j1);

            }//Fin del if si es na torre
            //Else if  si es Alfil
            else if (t[i1][j1] == '♝') {
                Pieza p = new AlfilN();
                JOptionPane.showMessageDialog(null, "" + p);
                aux = p.escoger(t, i1, j1);
            } else if (t[i1][j1] == '♞') {
                Pieza p = new CaballoN();
                JOptionPane.showMessageDialog(null, "" + p);
                aux = p.escoger(t, i1, j1);

            } else if (t[i1][j1] == '♚') {
                Pieza r = new ReyN();
                JOptionPane.showMessageDialog(null, "" + r);
                aux = r.escoger(t, i1, j1);
            } else if (t[i1][j1] == '♛') {
                Pieza r = new DamaN();
                JOptionPane.showMessageDialog(null, "" + r);
                aux = r.escoger(t, i1, j1);

            } else if (t[i1][j1] == '♟') {
                Pieza p = new PeonN();
                JOptionPane.showMessageDialog(null, "" + p);
                aux = p.escoger(t, i1, j1);
            }

           }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Ocurrio un error", "Advertencia", JOptionPane.WARNING_MESSAGE);
              aux = true;
            }
        } while (aux);

        return Ataque1(t, i1, j1);

    }//Fin del metodo turno

    public static char[][] Ataque1(char[][] t, int i1, int j1) {
        int i2=0, j2=0;
        boolean aux = false;
        do {
            try {
            i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fila a moverse: ","Jugador1",JOptionPane.INFORMATION_MESSAGE));
            while (i2 < 0 || i2 > 7) {
                i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la fila de nuevo: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
            }

            j2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la columna a moverse: ","Jugador1",JOptionPane.INFORMATION_MESSAGE));
            while (j2 < 0 || j2 > 7) {
                j2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la columna de nuevo: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
            }

            if (t[i1][j1] == '♜') {
                Pieza p = new TorreN();
                aux = p.ataque(t, i1, j1, i2, j2);

            } else if (t[i1][j1] == '♝') {
                Pieza p = new AlfilN();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♞') {
                Pieza p = new CaballoN();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♛') {
                Pieza p = new DamaN();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♚') {
                Pieza p = new ReyN();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♟') {
                Pieza p = new PeonN();
                aux = p.ataque(t, i1, j1, i2, j2);
            }

            if (i1 == i2 && j1 == j2) {
                JOptionPane.showMessageDialog(null, "Escogio la misma pieza","Jugador1",JOptionPane.INFORMATION_MESSAGE);
            }
            if (aux || (t[i2][j2] != '♖' && t[i2][j2] != '♗' && t[i2][j2] != '♘' && t[i2][j2] != '♕' && t[i2][j2] != '♔' && t[i2][j2] != '♙' && t[i2][j2] != '⛝')) {
                aux = true;
                JOptionPane.showMessageDialog(null, "No puede moverse de esa manera","Jugador1",JOptionPane.INFORMATION_MESSAGE);
            }

            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Ocurrio un error", "Advertencia", JOptionPane.WARNING_MESSAGE);
              aux = true;
            }
        } while (aux);
        t[i2][j2] = t[i1][j1];
        t[i1][j1] = '⛝';

        return t;
    }

    public static char[][] Turno2(char[][] t) {
        int i1 = 0, j1 = 0;
        int i2 = 0, j2 = 0;

        JOptionPane.showMessageDialog(null, "Elija las piezas a mover: ","Jugador2",JOptionPane.INFORMATION_MESSAGE);
        //Validar no se salga del tablero o pieza este vacia
        boolean aux = false;
        do {
            try {
                aux = false;
                i1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fila: ","Jugador2",JOptionPane.INFORMATION_MESSAGE));
                while (i1 < 0 || i1 > 7) {
                    i1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la fila: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
                }

                j1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la columna: ","Jugador2",JOptionPane.INFORMATION_MESSAGE));
                while (j1 < 0 || j1 > 7) {
                    j1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la columna: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
                }

                //Validar no agarre pieza que no es del o vacia
                //  T, A, C , D , R , +
                if (t[i1][j1] != '♕' && t[i1][j1] != '♗' && t[i1][j1] != '♘' && t[i1][j1] != '♖' && t[i1][j1] != '♔' && t[i1][j1] != '♙') {
                    JOptionPane.showMessageDialog(null, "Las posiciones ingresadas no contiene las piezas del jugador\nIntente de nuevo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    aux = true;
                    //Else if de las torre

                } else if (t[i1][j1] == '♖') {
                    Pieza p = new TorreB();
                    JOptionPane.showMessageDialog(null, "" + p);
                    aux = p.escoger(t, i1, j1);

                }//Fin del if si es na torre
                else if (t[i1][j1] == '♗') {
                    Pieza p = new AlfilB();
                    JOptionPane.showMessageDialog(null, "" + p);
                    aux = p.escoger(t, i1, j1);
                } else if (t[i1][j1] == '♘') {
                    Pieza p = new CaballoB();
                    JOptionPane.showMessageDialog(null, "" + p);
                    aux = p.escoger(t, i1, j1);
                } else if (t[i1][j1] == '♕') {
                    Pieza p = new DamaB();
                    JOptionPane.showMessageDialog(null, "" + p);
                    aux = p.escoger(t, i1, j1);
                } else if (t[i1][j1] == '♔') {
                    Pieza p = new ReyB();
                    JOptionPane.showMessageDialog(null, "" + p);
                    aux = p.escoger(t, i1, j1);
                } else if (t[i1][j1] == '♙') {
                    Pieza p = new PeonB();
                    JOptionPane.showMessageDialog(null, "" + p);
                    aux = p.escoger(t, i1, j1);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error", "Advertencia", JOptionPane.WARNING_MESSAGE);
                aux = true;
            }
        } while (aux);

        return Ataque2(t, i1, j1);
    }

    public static char[][] Ataque2(char[][] t, int i1, int j1) {

        int i2=0, j2=0;
        boolean aux = false;
        do {
            try {
            i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fila a moverse: ","Jugador2",JOptionPane.INFORMATION_MESSAGE));
            while (i2 < 0 || i2 > 7) {
                i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la fila de nuevo: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
            }

            j2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la columna a moverse: ","Jugador2",JOptionPane.INFORMATION_MESSAGE));
            while (j2 < 0 || j2 > 7) {
                j2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion invalida\nIngrese la columna de nuevo: ", "¡Error!", JOptionPane.WARNING_MESSAGE));
            }

            if (t[i1][j1] == '♖') {
                Pieza p = new TorreB();
                aux = p.ataque(t, i1, j1, i2, j2);

            } else if (t[i1][j1] == '♗') {
                Pieza p = new AlfilB();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♘') {
                Pieza p = new CaballoB();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♕') {
                Pieza p = new DamaB();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♔') {
                Pieza p = new ReyB();
                aux = p.ataque(t, i1, j1, i2, j2);
            } else if (t[i1][j1] == '♙') {
                Pieza p = new PeonB();
                aux = p.ataque(t, i1, j1, i2, j2);
            }

            if (i1 == i2 && j1 == j2) {
                JOptionPane.showMessageDialog(null, "Escogio la misma pieza","Jugador2",JOptionPane.INFORMATION_MESSAGE);
            }
            if (aux || (t[i2][j2] != '♜' && t[i2][j2] != '♝' && t[i2][j2] != '♞' && t[i2][j2] != '♛' && t[i2][j2] != '♚' && t[i2][j2] != '♟' && t[i2][j2] != '⛝')) {
                aux = true;
                JOptionPane.showMessageDialog(null, "No puede moverse de esa manera","Jugador2",JOptionPane.INFORMATION_MESSAGE);
            }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error", "Advertencia", JOptionPane.WARNING_MESSAGE);
            aux = true;
            }
        } while (aux);
        t[i2][j2] = t[i1][j1];
        t[i1][j1] = '⛝';

        return t;
    }

    public static boolean RecorrerTablero1(char matriz[][], int filas, int cols) {
        boolean aux = false;

        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            if (matriz[filas][cols] == '♔') {
                return true;
            }

        } else {
            if (cols == matriz[0].length - 1) {
                if (matriz[filas][cols] == '♔') {
                    return true;
                } else {
                    return RecorrerTablero1(matriz, filas + 1, 0);
                }
            } else {
                if (matriz[filas][cols] == '♔') {
                    return true;
                } else {
                    return RecorrerTablero1(matriz, filas, cols + 1);
                }
            }
        }//Fin del else

        return aux;
    }//Fin del metodo 

    public static boolean RecorrerTablero2(char matriz[][], int filas, int cols) {
        boolean aux = false;
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            if (matriz[filas][cols] == '♚') {
                return true;
            }

        } else {
            if (cols == matriz[0].length - 1) {
                if (matriz[filas][cols] == '♚') {
                    return true;
                } else {
                    return RecorrerTablero2(matriz, filas + 1, 0);
                }
            } else {
                if (matriz[filas][cols] == '♚') {
                    return true;
                } else {
                    return RecorrerTablero2(matriz, filas, cols + 1);
                }
            }
        }//Fin del else

        return aux;
    }//Fin del metodo 

   
//Fin de la clase
}
