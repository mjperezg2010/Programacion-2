/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesProyecto;

/**
 *
 * @author mjper
 */
public class Tablero extends Ajedrez {

    private char[][] Tablero = new char[8][8];
    public String piezas;
   
    

    //Constructores
    public Tablero(char[][] tablero) {
        this.Tablero=tablero;
    }

    public Tablero() {
        super();
    }

    
    public void setTablero(char[][] Tablero) {
        this.Tablero = Tablero;
    }
    

    
    
    
    

    
    
    public  void imprimirTablero(char matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            System.out.print( matriz[filas][cols] +"   ");
            
            
            
            
        } else {
            if (cols == matriz[0].length-1) {   
                System.out.println( matriz[filas][cols] ); 
                
                
                imprimirTablero(matriz, filas+1, 0);
            } else {
                System.out.print( matriz[filas][cols] +"   "); 
                 
                
                imprimirTablero(matriz, filas, cols+1);
            }
        }       
    }
  
    

    public char[][] getTablero() {
        return Tablero;
    }
    
    public String piezasne(){
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
        String s= "Instrucciones de las piezas: \n"
                    + "A. Jugador -Negras-\n"
                    + "     1. Las torres estan representadas por:     '♜' \n"
                    + "     2. Los alfiles estan representados por:    '♝' \n"
                    + "     3. Los caballos estan representados por:   '♞' \n"
                    + "     4. La reina esta representada por:         '♛' \n"
                    + "     5. El rey esta representado por:           '♚' \n"
                    + "     6. Los peones estan representados por:     '♟' \n";
                    
        return s;
    }
    public String piezasbla(){
        String s= "Instrucciones de las piezas: \n"
                    + "B. Jugador -Blancas-\n"
                    + "     1. Las torres estan representadas por:     '♖' \n"
                    + "     2. Los alfiles estan representados por:    '♗' \n"
                    + "     3. Los caballos estan representados por:   '♘' \n"
                    + "     4. La reina esta representada por:         '♕' \n"
                    + "     5. El rey esta representado por:           '♔' \n"
                    + "     6. Los peones estan representados por:     '♙' \n";
                    
        return s;
    }
    


}//Fin de la clase Tablero
