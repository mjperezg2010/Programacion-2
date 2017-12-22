/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesProyecto;


public class Ajedrez {
    protected String reglas,informacion,movimientos;

    public Ajedrez() {
        this.reglas="Cada pieza tiene sus propios movimientos el objetivo\nes comerse a la pieza del rey del otro jugador\n"
                + "Hay dos jugadoras las piezas negras y blancas, en eset juego son las mayusculas y las minusculas (sucesivamente)";
        this.informacion="El juego de ajedrez es un juego de mesa de dos jugadores que se juega en un tablero de 8 x 8\n"
                + "Cuyo final se logra cuando uno de los jugadores gana";
        this.movimientos="- Las Torres: solo pueden moverse de manera horizntal y vertical para culaquier direcion\n"
                + "- Los Alfiles: Solo pueden moverse de manera diagonal a culaquier lado\n"
                + "- Los Caballos: Solo pueden moverse en un movimineto 'L' de tres casillas\n"
                + "- Los Peones: Solo pueden moverse una casilla vertical y para comer en diagonal\n    *Solo se mueven par delante no retroceden,\n"
                + "      si no se ha movido el peon puede moverse dos casillas,si llega al final puede promoverse";
        
    }
    
    public void settodo(){
        
    }

    public String getReglas() {
        return reglas;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getMovimientos() {
        return movimientos;
    }
    
    

    
    
    
    
    
}
