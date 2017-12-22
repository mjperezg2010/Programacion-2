/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2_martinperez_11711267;

import Clases.Alumnos;
import Clases.Clasesad;
import Clases.Maestros;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author mjper
 */
public class Lab_2_MartinPerez_11711267 {

    static Scanner sca = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int op = 0;

        //Opciones interiores
        int opm = 0;
        do {
            ArrayList maestros = new ArrayList();
            ArrayList clases = new ArrayList();
            ArrayList Alumnos = new ArrayList();
        
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n"
                    + "1. Administracion\n"
                    + "2. Matricula\n"
                    + "3. Log in\n"
            ));
            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Administracion");
                opm = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Maestro\n2. Clases"));
                if (opm == 1) {
                    JOptionPane.showMessageDialog(null, "Maestros");
                    Maestros m = new Maestros();
                    int resp = 0;
                    do {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese su Nombre");
                        String titulo = JOptionPane.showInputDialog(null, "Ingrese su Titulo");
                        String maestria = JOptionPane.showInputDialog(null, "Ingrese su Maestria");
                        String salario = JOptionPane.showInputDialog(null, "Ingrese su Salario");
                        String usuario = JOptionPane.showInputDialog(null, "Ingrese su Usuario");
                        String contraseña = JOptionPane.showInputDialog(null, "Ingrese su Nueva Contraseña");
                        String cantclases = JOptionPane.showInputDialog(null, "Ingrese la cantidad maxima de clases");
                        //Agregar maestro
                        maestros.add(nombre);
                        

                        m.setnombre(nombre);
                        m.settitulo(titulo);
                        m.setmaestria(maestria);
                        m.setsalario(salario);
                        m.setusuario(usuario);
                        m.setcontraseña(contraseña);
                        m.setcantidadclases(cantclases);

                        System.out.println(m.toString());
                        System.out.println(" ");

                        resp = JOptionPane.showConfirmDialog(null, "¿Estan corectos los datos?");
                    } while (resp == 1);//Fin del do de ingresar nombres delk maestro

                }//Fin opcion de los maestros 
                else if (opm == 2) {
                    JOptionPane.showMessageDialog(null, "Clases");
                    Clasesad clas = new Clasesad();
                    int resp = 0;
                    do {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre");
                        int seccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Seccion"));
                        int cantalum = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad maxima de alumnos"));
                        String maestro = JOptionPane.showInputDialog(null, "Ingrese el maestro");
                        int unidadesv = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las unidades valorativas"));

                        clas.setnombre(nombre);
                        clas.setseccion(seccion);
                        clas.setscantidadalumnos(cantalum);
                        clas.setmaestro(maestro);
                        clas.setunidadesvalorativas(unidadesv);

                        //LIsta
                        Alumnos al = new Alumnos();
                        Maestros m = new Maestros();
                        
                        m.lista(seccion);
                        al.lista(seccion);

                        System.out.println(clas.toString());
                        
                        clas.lista(nombre);

                        resp = JOptionPane.showConfirmDialog(null, "¿Estan corectos los datos?");
                    } while (resp == 1);//Fin del do de ingresar clases uuudf

                }//Fin opcion clases

            }//Fin opcion administrascion
            //MAtruula
            else if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Matricula");
                JOptionPane.showMessageDialog(null, "Ingresar datos de alumno");
                Alumnos al = new Alumnos();
                int resp = 0;
                do {
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre");
                    int numcuen = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta"));
                    String carrera = JOptionPane.showInputDialog(null, "Ingrese la carrera");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
                    int dinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dinero desponible"));
                    String usuario = JOptionPane.showInputDialog(null, "Ingrese un usuario");
                    String contra = JOptionPane.showInputDialog(null, "Ingrese una contraseña");
                    String buzon = JOptionPane.showInputDialog(null, "Ingrese para el buzon");

                    al.setnombre(nombre);
                    al.setnumcuenta(numcuen);
                    al.setcarrera(carrera);
                    al.setedad(edad);
                    al.setedad(edad);
                    al.setdinero(dinero);
                    al.setusuario(usuario);
                    al.setcontraseña(contra);
                    al.setbuzon(buzon);

                    //Ingresar para la lista
                    Clasesad clas = new Clasesad();
                    clas.lista(nombre);

                    System.out.println(al.toString());

                    resp = JOptionPane.showConfirmDialog(null, "¿Estan corectos los datos?");
                } while (resp == 1);//Fin del do de ingresar alumno
                Clasesad clas = new Clasesad();
                
                 JOptionPane.showMessageDialog(null, "Estimado alumno\nA continuacion se le presentara unsa serie de clasespara que elija cual matricular");
                 clas.listadeclases();
                 String clase= JOptionPane.showInputDialog(null, "Elija clases a matricular");
            
           

            }//Fin opcion matricula
            else if(opcion==3){
                JOptionPane.showMessageDialog(null, "Log in");
                opm = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Maestro\n2. Alumnos"));
                if (opm == 1) {
                    JOptionPane.showMessageDialog(null, "Maestros");
                    int dec=Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones\n1. Modificar datos\n2. Ver secciones"));
                    if (dec==1){
                        String nombre = JOptionPane.showInputDialog(null, "Modificar su Nombre");
                        String titulo = JOptionPane.showInputDialog(null, "Modificar su Titulo");
                        String maestria = JOptionPane.showInputDialog(null, "Modificar su Maestria");
                        String salario = JOptionPane.showInputDialog(null, "Modificar su Salario");
                        String usuario = JOptionPane.showInputDialog(null, "Modifica su Usuario");
                        String contraseña = JOptionPane.showInputDialog(null, "Modificar su Nueva Contraseña");
                        
                        //Clase
                        Maestros m = new Maestros();
                        
                        m.setnombre(nombre);
                        m.settitulo(titulo);
                        m.setmaestria(maestria);
                        m.setsalario(salario);
                        m.setusuario(usuario);
                        m.setcontraseña(contraseña);
                        
                        
                    }
                        
                    
                else if (opm==2){
                    JOptionPane.showMessageDialog(null, "Alumnos");
                    int dec=Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones\n1. Modificar datos\n2. Retirar Clases\n3. Adicionar clase\n4. Mensajeria"));
                    if (dec==1){
                        String nombre = JOptionPane.showInputDialog(null, "Modificar su Nombre");
                        String titulo = JOptionPane.showInputDialog(null, "Modificar su Titulo");
                        String maestria = JOptionPane.showInputDialog(null, "Modificar su Maestria");
                        String salario = JOptionPane.showInputDialog(null, "Modificar su Salario");
                        String usuario = JOptionPane.showInputDialog(null, "Modifica su Usuario");
                        String contraseña = JOptionPane.showInputDialog(null, "Modificar su Nueva Contraseña");
                        
                }else if (dec==4){
                        System.out.println("Proximamente");
                }else if(dec==3){
                    JOptionPane.showMessageDialog(null, "Ingrese las clases a retirar");
                }
                else if (dec==2){
                    JOptionPane.showMessageDialog(null, "Adicionar clases");
                }
                    
                    
            }//Fin opcion maestros
            
           
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //Fin del issitema

            op = JOptionPane.showConfirmDialog(null, "Desea salir dl sistema");
        } while (op == 1);

    }//Fin dle metodo main

}//Fin de laclse
