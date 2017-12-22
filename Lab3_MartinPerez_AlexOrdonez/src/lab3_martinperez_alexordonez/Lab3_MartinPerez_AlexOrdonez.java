package lab3_martinperez_alexordonez;

import ClasesA.Juguetes;
import ClasesA.Locales;
import ClasesA.Productos;
import ClasesA.comida;
import ClasesA.ropa;
import ClasesA.Quiosco;
import ClasesA.local_comida;
import ClasesA.tienda;
import ClasesM.Clientes;
import ClasesM.Empleados;
import ClasesM.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Ordonez
 */
public class Lab3_MartinPerez_AlexOrdonez {

    private static ArrayList<String> users = new ArrayList();
    private static ArrayList<String> ids = new ArrayList();
    static ArrayList<Locales> listlocales = new ArrayList();
    static ArrayList<Personas> listpersonas = new ArrayList();
    static ArrayList<Productos> listproductos = new ArrayList();

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido socio al sistema de centros comerciales");

        int re = 0;
        do {
            switch (menu()) {
                case 1:
                    registro();
                    break;
                case 2:
                    Locales();
                    break;
                case 3:
                    agregar_productos();
                    break;
                case 5:
                    Eli();
                    break;
                case 6:
                    crear_productos();
                    break;
                case 4:
                    log();
                    break;

            }//Fin del switch

            re = JOptionPane.showConfirmDialog(null, "Desea salir del sistema?", "Advertencia", JOptionPane.YES_NO_OPTION);

        } while (re == 1);

    }//Fin del metodo main

    public static int menu() {
        int opcion = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "---Menu---\n"
                + "1. Agregar Clientes o Empleados\n"
                + "2. Agregar Locales\n"
                + "3. Agregar producto\n"
                + "4. Log in Cliente\n"
                + "5. Eliminar\n"
                + "6. Crear Producto"));

        return opcion;
    }

    public static void Locales() {
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja lo siguiente a agragar: \n"
                + "1. Tiendas\n"
                + "2. Locales de comida\n"
                + "3. Quioscos"));

        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        int piso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el piso en el que se encuentra: "));



        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un empleado para el locales: \n"
                + recorrerP()));



        switch (aux) {
            case 1:
                int tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño, no mayor a 18 metros cuadrados: "));
                while (tamano < 0 || tamano > 18) {
                    tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Error tamaño invalido\nIngrese el tamaño, no mayor a 18 metros cuadrados: "));
                }


               

                //String nombre, String empleado_actual, int piso, ArrayList<Empleados> empleados, ArrayList<Productos> productos
                listlocales.add(new tienda(tamano, nombre, listpersonas.get(op).getNombrec(), piso));

                break;
            case 2:
                //String nombre_ex, String nombre, String empleado_actual, int piso
                String nombree = JOptionPane.showInputDialog(null, "Ingrese el nombre del quiosco: ");
                listlocales.add(new Quiosco(nombree, nombre, listpersonas.get(op).getNombrec(), piso));
            case 3:
                int cont = 0;
                int p1 = 0,
                 p2 = 0,
                 p3 = 0,
                 p4 = 0;
                //String nombre, String empleado_actual, int piso
                listlocales.add(new local_comida(nombre, listpersonas.get(op).getNombrec(), piso));

            //listlocales.add(new local_comida().getEmpleados().add(new Empleados()));
        }//Fin del switch
    }

    public static String recorrerP() {

        String s = "";
        for (Personas t : listpersonas) {

            s += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

        }
        return s;
    }   

    //Fin del metodo locales
    public static void crear_productos() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo\n" + "1.ropa" + "2.juguetes" + "3.comida"));
        switch (op) {
            case 1:
                String des = JOptionPane.showInputDialog("Ingrese la descripcion");
                String mar = JOptionPane.showInputDialog("Ingrese la marca");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
                int decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
                int talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla"));
                String sex = JOptionPane.showInputDialog("Ingrese el sexo");
                listproductos.add(new ropa(talla, sex, des, mar, decuento, precio));
                break;
            case 2:
                des = JOptionPane.showInputDialog("Ingrese la descripcion");
                mar = JOptionPane.showInputDialog("Ingrese la marca");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
                decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo");
                listproductos.add(new Juguetes(tipo, des, mar, decuento, precio));
                break;
            case 3:
                des = JOptionPane.showInputDialog("Ingrese la descripcion");
                mar = JOptionPane.showInputDialog("Ingrese la marca");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
                decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
                String fecha_ca = JOptionPane.showInputDialog("Ingrese el sexo");
                listproductos.add(new comida(fecha_ca, des, mar, decuento, precio));
                break;
        }
    }

    public static void agregar_productos() {
        int loc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del local"));
        int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo\n" + "1.ropa" + "2.juguetes" + "3.comida"));
        switch (op) {
            case 1:
                if (listlocales.get(loc) instanceof local_comida) {
                    JOptionPane.showMessageDialog(null, "no se puede agregar ropa");
                } else {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posision del producto"));
                    listlocales.get(loc).getProductos().add(listproductos.get(pos));
                    listproductos.remove(pos);
                }
                break;
            case 2:
                if (listlocales.get(loc) instanceof local_comida) {
                    JOptionPane.showMessageDialog(null, "no se puede agregar juguetes");
                } else {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posision del producto"));
                    listlocales.get(loc).getProductos().add(listproductos.get(pos));
                    listproductos.remove(pos);
                    break;
                }
            case 3:
                if (listlocales.get(loc) instanceof tienda) {
                    JOptionPane.showMessageDialog(null, "no se puede agregar comida");
                } else {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la posision del producto"));
                    listlocales.get(loc).getProductos().add(listproductos.get(pos));
                    listproductos.remove(pos);
                    break;
                }
        }
    }


    //Fin del metodo locales
    
    
    
    public static void log(){
        String contra=JOptionPane.showInputDialog(null, "Ingrese su contraseña");
        String usuario=JOptionPane.showInputDialog(null, "Ingrese su usuario");
        
         String se = "";
        for (Locales t : listlocales) {

            se += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

        }
        
        JOptionPane.showMessageDialog(null, se);
        String ser = "";
        for (Productos t : listproductos) {

            ser += "" + listproductos.indexOf(t) + "" + "- " + t + "\n";

        }
        JOptionPane.showMessageDialog(null, ser);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Eli(){
         String s = "";
        for (Personas t : listpersonas) {

            s += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

        }
        
        int op=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las personasa a eliminar: "+s));
        listpersonas.remove(op);
        
         String se = "";
        for (Locales t : listlocales) {

            se += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

        }
        
        
        int ope=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el local a eliminar: "+se));
        listlocales.remove(ope);
        
        String ser = "";
        for (Productos t : listproductos) {

            ser += "" + listproductos.indexOf(t) + "" + "- " + t + "\n";

        }
        int opr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el producto a eliminar: "+ser));
        listproductos.remove(opr);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void productos() {
        int loc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del local"));
        int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo\n" + "1.ropa" + "2.juguetes" + "3.comida"));
        switch (op) {
            case 1:
                int talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla"));
                String sex = JOptionPane.showInputDialog("Ingrese el sexo");

        }
    }

    public static void registro() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que desea agregar\n" + "1.cliente\n" + "2.empleado"));
        switch (op) {
            case 1:
                String user = JOptionPane.showInputDialog("Ingrese el usuario");
                while (usuario(user) == true) {
                    user = JOptionPane.showInputDialog("Ingrese el usuario");
                }
                String pasword = JOptionPane.showInputDialog("Ingrese la contrasena");
                String correo = JOptionPane.showInputDialog("Ingrese el correo");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                String id = JOptionPane.showInputDialog("Ingrese el ID");
                while (ID(id) == true) {
                    id = JOptionPane.showInputDialog("Ingrese el id");
                }
                String nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
                double dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresar dinero disponible"));
                listpersonas.add(new Clientes(dinero, user, pasword, correo, nombre, id, nacimiento));
                break;
            case 2:
                user = JOptionPane.showInputDialog("Ingrese el usuario");
                while (usuario(user) == true) {
                    user = JOptionPane.showInputDialog("Ingrese el usuario");
                }
                pasword = JOptionPane.showInputDialog("Ingrese la contrasena");
                correo = JOptionPane.showInputDialog("Ingrese el correo");
                nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                id = JOptionPane.showInputDialog("Ingrese el ID");
                while (ID(id) == true) {
                    id = JOptionPane.showInputDialog("Ingrese el id");
                }
                nacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
                String horario = JOptionPane.showInputDialog("Ingresar dinero disponible");
                listpersonas.add(new Empleados(horario, 0, user, pasword, correo, nombre, id, nacimiento));

                String s = "";
                for (Locales t : listlocales) {

                    s += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

                }
                
                int opr=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la tienda a la que desea agregar el cliente: "+s));
         
                
                //listlocales.get(opr).setEmpleados(empleados);

                break;
        }
    }

    public static boolean usuario(String user) {
        boolean o = false;
        for (String p : users) {
            if (p.equals(user)) {
                o = true;
                JOptionPane.showMessageDialog(null, "usuario ya ingresado");
            }
        }
        return o;
    }

    public static boolean ID(String id) {
        boolean o = false;
        for (String p : ids) {
            if (p.equals(id)) {
                o = true;
                JOptionPane.showMessageDialog(null, "id ya ingresado");
            }
        }
        return o;
    }
    
    

}//Fin de la clase
