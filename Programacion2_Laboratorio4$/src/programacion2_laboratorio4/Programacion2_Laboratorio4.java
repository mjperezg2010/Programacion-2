package programacion2_laboratorio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Clases.*;

public class Programacion2_Laboratorio4 {

    static ArrayList<Guerrero> guerreros = new ArrayList();
    static ArrayList<Jugador> jugadores = new ArrayList();
    static ArrayList<Partida> partidas = new ArrayList();

    public static void main(String[] args) {
        boolean salida = true;
        JOptionPane.showMessageDialog(null, "Bienvenido al juego");
        do {
            try {
                // TODO code application logic here
                
                int op = 0;
                int aux = 0;
                do {
                    op = menu();
                    switch (op) {

                        case 1:
                            Creacionguerreros();
                            break;
                        case 2:
                            if (guerreros.size() < 1) {
                                JOptionPane.showMessageDialog(null, "No hay guerreros en la lista");
                            } else {
                                Eliminarguerreos();
                            }

                            break;
                        case 3:
                            if (guerreros.size() < 1) {
                                JOptionPane.showMessageDialog(null, "No hay guerreros en la lista");

                            } else {
                                registrojugadores();
                            }
                            break;

                        case 4:
                            if (jugadores.size() < 1) {
                                JOptionPane.showMessageDialog(null, "No hay guerreros en la lista o jugadores");
                            } else {
                                iniciopartida();
                            }

                            break;
                        case 5:
                            if (partidas.size() < 1) {
                                JOptionPane.showMessageDialog(null, "No hay partidas");
                            } else {
                                Cargarpartida();
                            }
                            break;
                            
                        case 6:
                            if (jugadores.size() < 1) {
                                JOptionPane.showMessageDialog(null, "No hay jugadores en la lista");
                            } else {
                                JOptionPane.showMessageDialog(null,listajugadores());
                            }

                            break;
                        case 7:
                            aux = JOptionPane.showConfirmDialog(null, "¿Desea terminar el juego?");
                            salida = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Esta opcion no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);

                            break;

                    }//Fin del menu
                    
                } while (aux == 1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error, se reiniciara el programa");
                salida = true;
            }
        } while (salida);

    }//Fin del main

    public static int menu() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "--Menu--\n"
                + "1.Creacion de guerrros  \n"
                + "2. Eliminacion de guerreros \n"
                + "3. Registro de jugadores \n"
                + "4. Inicio de partida\n"
                + "5. Cargar partidas\n"
                + "6. Lista de jugadores\n"
                + "7. Salir"));

        return op;
    }

    public static int menuguerreros() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "--Menu--\n"
                + "1. Magos  \n"
                + "2. Elfos \n"
                + "3. Dragones \n"
                + "4. Arqueros \n"
                + "5. Brujas\n"
        ));
        return op;

    }

    public static void Creacionguerreros() {
        JOptionPane.showMessageDialog(null, "Creacion de guerreros");

        switch (menuguerreros()) {
            case 1:
                Mago gm = new Mago();
                do {
                    gm.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
                    gm.setEdad(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                    gm.setLugarNacimiento("Ingrese el lugar de nacimiento: ");
                    gm.setCosto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo del guerrero")));
                    gm.setPoderAtaque(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el poder ataque  del guerrero (no mayor a 50)")));

                    gm.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la salud del guerrero (entre 100 y 200)")));
                    gm.setElementoFavorito(JOptionPane.showInputDialog(null, "Ingrese el elemento favorito"));
                    gm.setTipoMagia(JOptionPane.showInputDialog(null, "Ingrese el tipo de magia"));
                } while (!validarSalud(gm.getSalud()) || !validarCosto(gm.getCosto()) || !validarCosto(gm.getCosto()));
                guerreros.add(gm);
                break;
            case 2:
                Elfo ge = new Elfo();
                do {
                    ge.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
                    ge.setEdad(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                    ge.setCosto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo del guerrero")));
                    ge.setLugarNacimiento("Ingrese el lugar de nacimiento: ");

                    ge.setPoderAtaque(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el poder ataque  del guerrero (no mayor a 50)")));
                    ge.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la salud del guerrero  (entre 100 y 200)")));
                    ge.setRangoMilitat(JOptionPane.showInputDialog(null, "Ingrese un rango militar"));
                    ge.setTipoArma(JOptionPane.showInputDialog(null, "Ingrese el tipo de arma"));
                } while (!validarSalud(ge.getSalud()) || !validarCosto(ge.getCosto()) || !validarCosto(ge.getCosto()));
                guerreros.add(ge);
                break;
            case 3:
                Dragon gd = new Dragon();
                do {
                    gd.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
                    gd.setEdad(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                    gd.setCosto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo del guerrero")));
                    gd.setLugarNacimiento("Ingrese el lugar de nacimiento: ");
                    gd.setPoderAtaque(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el poder ataque  del guerrero (no mayor a 50)")));
                    gd.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la salud del guerrero  (entre 100 y 200)")));
                    gd.setRaza(JOptionPane.showInputDialog(null, "Ingrese raza"));
                } while (!validarSalud(gd.getSalud()) || !validarCosto(gd.getCosto()) || !validarCosto(gd.getCosto()));
                guerreros.add(gd);

                break;

            case 4:
                Arquero ga = new Arquero();
                do {
                    ga.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
                    ga.setEdad(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                    ga.setCosto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo del guerrero")));
                    ga.setLugarNacimiento("Ingrese el lugar de nacimiento: ");
                    ga.setPoderAtaque(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el poder ataque  del guerrero (no mayor a 50)")));
                    ga.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la salud del guerrero  (entre 100 y 200)")));
                    ga.setMaterialArco(JOptionPane.showInputDialog(null, "Ingrese el material del arco"));
                    ga.setMaterialArmadura(JOptionPane.showInputDialog(null, "Ingrese el material de la armadura"));
                } while (!validarSalud(ga.getSalud()) || !validarCosto(ga.getCosto()) || !validarCosto(ga.getCosto()));
                guerreros.add(ga);
                break;
            case 5:
                Bruja gb = new Bruja();
                do {
                    gb.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
                    gb.setEdad(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                    gb.setCosto(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo del guerrero")));
                    gb.setLugarNacimiento("Ingrese el lugar de nacimiento: ");
                    gb.setPoderAtaque(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el poder ataque  del guerrero (no mayor a 50)")));
                    gb.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la salud del guerrero  (entre 100 y 200)")));
                    gb.setLugarResidencia(JOptionPane.showInputDialog(null, "Ingrese el lugar de residencia"));
                    gb.setSigloNacimiento(JOptionPane.showInputDialog(null, "Ingrese el siglo de nacimiento"));
                } while (!validarSalud(gb.getSalud()) || !validarCosto(gb.getCosto()) || !validarCosto(gb.getCosto()));
                guerreros.add(gb);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esta opcion no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;

        }//Fin switch
        JOptionPane.showMessageDialog(null, "El guerrero ha sido agregado con exito");

    }//Fin del metodo cr3acion guerreos

    public static void Eliminarguerreos() {
        String s = "";
        for (Guerrero t : guerreros) {
            s += "" + guerreros.indexOf(t) + "" + "- " + t + "\n";

        }
        int eli = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija el guerrero a eiminar" + s));

        guerreros.remove(eli);
        JOptionPane.showMessageDialog(null, "El guerrero ha sido eliminado con exito");

    }//Eliminar guerreros

    public static void iniciopartida() {
        String nombrePartida = JOptionPane.showInputDialog(null, "Ingrese el nombre de la partida");
        Partida pp = new Partida(nombrePartida);
        partidas.add(pp);
        Ataque J1 = new Ataque();
        Ataque J2 = new Ataque();
        String s = "";
        for (Jugador t : jugadores) {
            s += "" + jugadores.indexOf(t) + "" + "- " + t + "\n";

        }

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, s + "Elija el jugador 1: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, s + "Elija el jugador 2: "));
        boolean fin = true;
        int cc = 0;
        while (fin) {

            JOptionPane.showMessageDialog(null, "Empieza turno del jugador 1");
            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija\n"
                    + "1. Atacar\n"
                    + "2. Guardar\n"));

            if (op1 == 1) {
                jugadores.get(num1).getGuerrero().Atacar(jugadores.get(num2).getGuerrero());
                InformeSalud(num1, jugadores.get(num1), 1);
                pp.ataques.add(new Ataque(cc + " ", jugadores.get(num1), jugadores.get(num2), num1, num2));
                cc++;
            } else if (op1 == 2) {
                JOptionPane.showMessageDialog(null, "Ha guardado");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Esta opcion no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }

            if (jugadores.get(num2).getGuerrero().getSalud() < 1) {
                jugadores.get(num2).getGuerrero().setSalud(0);
                fin = false;
                JOptionPane.showMessageDialog(null, "Fin de la partida\nA ganado el jugador 1");
                jugadores.get(num1).setPuntos(jugadores.get(num1).getPuntos()+3);
                break;
            }
            ////////////////////////-JUgadro 2_______""""///////////////////////
            JOptionPane.showMessageDialog(null, "Empieza turno del jugador 2");
            int op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija\n"
                    + "1. Atacar\n"
                    + "2. Guardar\n"));
            if (op2 == 1) {
                jugadores.get(num1).getGuerrero().Atacar(jugadores.get(num1).getGuerrero());
                InformeSalud(num2, jugadores.get(num2), 2);
                pp.ataques.add(new Ataque(cc + " ", jugadores.get(num1), jugadores.get(num2), num1, num2));
                cc++;
            } else if (op2 == 2) {
                JOptionPane.showMessageDialog(null, "Ha guardado");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Esta opcion no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }
            if (jugadores.get(num1).getGuerrero().getSalud() < 1) {
                jugadores.get(num1).getGuerrero().setSalud(0);
                fin = false;
                JOptionPane.showMessageDialog(null, "Fin de la partida\nA ganado el jugador 2");
                jugadores.get(num2).setPuntos(jugadores.get(num2).getPuntos()+3);
            }

            ///////////Fin/////////
        }//Fin del whike

    }//Fin del metodo 

    public static void registrojugadores() {
        Jugador JJ = new Jugador();
        JJ.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre: "));
        int dinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dinero"));
        JJ.setDinero(dinero);
        String jugadores1 = "";
        for (Guerrero k : guerreros) {
            jugadores1 += guerreros.indexOf(k) + " - " + k + "\n";
        }
        int opa = Integer.parseInt(JOptionPane.showInputDialog(null, jugadores1 + "Ingrese la posicion del guerrero a agregar: "));
        if (dinero < guerreros.get(opa).getCosto()) {
            JOptionPane.showMessageDialog(null, "No tiene dinero suficiente para comparlo");
        } else {
            
            
            JJ.setGuerrero(guerreros.get(opa));
            guerreros.remove(opa);
            jugadores.add(JJ);
            JOptionPane.showMessageDialog(null, "Ha creado un jugador");
        }

    }

    public static void InformeSalud(int num, Jugador jj, int nn) {
        JOptionPane.showMessageDialog(null, "Informe de salud\n"
                + "\nNombre: " + jj.getNombre()
                + "\nNumero jugador: " + nn
                + "\nSalud del guerrero: " + jugadores.get(num).getGuerrero().getSalud());

    }

    public static String listajugadores() {
        String jugador = "";
        for (Jugador d : jugadores) {
            jugador += "" + jugadores.indexOf(d) + "" + "- " + d + "\n";
        }
        return jugador;
    }

    public static String listaGuerreros() {
        String jugador = "";
        for (Guerrero d : guerreros) {
            jugador += "" + guerreros.indexOf(d) + "" + "- " + d + "\n";
        }
        return jugador;
    }

    public static boolean validarPoderAtaque(int poder) {
        if (poder < 0 || poder > 50) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validarSalud(int salud) {
        if (salud < 100 || salud > 200) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validarCosto(int costo) {
        if (costo < 0 || costo > 300) {
            return false;
        } else {
            return true;
        }
    }

    public static void Cargarpartida() {
        String acum = "";
        for (Partida pp : partidas) {

            acum += "" + partidas.indexOf(pp) + "" + "- " + pp + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null, acum + "Ingrese el numero de partida a cargar"));
        String xx = "";
        for (Ataque aa : partidas.get(pos).ataques) {
            xx += "" + partidas.get(pos).ataques.indexOf(aa) + "" + "- " + aa + "\n";
        }
        int posAtaque = Integer.parseInt(JOptionPane.showInputDialog(null, xx + "Ingrese el numero de turno: "));

        Partida pp = partidas.get(pos);
        int num1 = partidas.get(pos).ataques.get(posAtaque).getPosJ1();
        int num2 = partidas.get(pos).ataques.get(posAtaque).getPosJ2();
        boolean fin = true;
        int cc = 0;
        while (fin) {

            JOptionPane.showMessageDialog(null, "Empieza turno del jugador 1");
            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija\n"
                    + "1. Atacar\n"
                    + "2. Guardar\n"));

            if (op1 == 1) {
                jugadores.get(num1).getGuerrero().Atacar(jugadores.get(num2).getGuerrero());
                InformeSalud(num1, jugadores.get(num1), 1);
                pp.ataques.add(new Ataque(cc + " ", jugadores.get(num1), jugadores.get(num2), num1, num2));
                cc++;
            } else if (op1 == 2) {
                JOptionPane.showMessageDialog(null, "Ha guardado");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Esta opcion no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }

            if (jugadores.get(num2).getGuerrero().getSalud() < 1) {
                jugadores.get(num2).getGuerrero().setSalud(0);
                fin = false;
                JOptionPane.showMessageDialog(null, "Fin de la partida\nA ganado el jugador 1");
                jugadores.get(num1).setPuntos(jugadores.get(num1).getPuntos()+3);
                break;
            }
            ////////////////////////-JUgadro 2_______""""///////////////////////
            JOptionPane.showMessageDialog(null, "Empieza turno del jugador 2");
            int op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija\n"
                    + "1. Atacar\n"
                    + "2. Guardar\n"));
            if (op2 == 1) {
                jugadores.get(num1).getGuerrero().Atacar(jugadores.get(num1).getGuerrero());
                InformeSalud(num1, jugadores.get(num2), 2);
                pp.ataques.add(new Ataque(cc + " ", jugadores.get(num1), jugadores.get(num2), num1, num2));
                cc++;
            } else if (op2 == 2) {
                JOptionPane.showMessageDialog(null, "Ha guardado");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Esta opcion no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }
            if (jugadores.get(num1).getGuerrero().getSalud() < 1) {
                jugadores.get(num1).getGuerrero().setSalud(0);
                fin = false;
                JOptionPane.showMessageDialog(null, "Fin de la partida\nA ganado el jugador 2");
                jugadores.get(num2).setPuntos(jugadores.get(num2).getPuntos()+3);
            }

            ///////////Fin/////////
        }//Fin del whike
    }
}//FIn de la clase
