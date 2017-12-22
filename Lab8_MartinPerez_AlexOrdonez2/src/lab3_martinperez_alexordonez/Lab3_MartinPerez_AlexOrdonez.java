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
        boolean fin = true;
        while (fin) {
            try {
                JOptionPane.showMessageDialog(null, "Bienvenido socio al sistema de centros comerciales");

                int re = 0;
                do {
                    switch (menu()) {
                        case 1:
                            if (listlocales.size() == 0) {
                                JOptionPane.showMessageDialog(null, "No hay tiendas");
                            } else {
                                registro();
                            }

                            break;
                        case 2:
                            Locales();
                            break;

                        case 5:
                            Eliminar();
                            break;
                        case 3:
                            if (listlocales.size() == 0) {
                                JOptionPane.showMessageDialog(null, "No hay tiendas");
                            } else {
                                crear_productos();
                            }

                            break;
                        case 4:
                            login_cliente();
                            break;
                        case 7:
                            if (listlocales.size() == 0) {
                                JOptionPane.showMessageDialog(null, "No puede modificar");
                            } else if (listproductos.size() == 0) {
                                JOptionPane.showMessageDialog(null, "No puede modificar");
                            } else if (listpersonas.size() == 0) {
                                JOptionPane.showMessageDialog(null, "No puede modificar");
                            } else {
                                Modificar();
                            }

                            break;
                        case 8:
                            if (listlocales.size() == 0) {
                                JOptionPane.showMessageDialog(null, "No hay tiendas");
                            } else {
                                facturacion();
                            }

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion Invalida");
                            break;
                    }//Fin del switch

                    re = JOptionPane.showConfirmDialog(null, "Desea salir del sistema?", "Advertencia", JOptionPane.YES_NO_OPTION);

                } while (re == 1);
                fin = false;
            } catch (Exception e) {
                fin = true;
                JOptionPane.showMessageDialog(null, "Ocurrio un error se reinciara el sistema");
            }
        }

    }//Fin del metodo main

    public static int menu() {
        int opcion = 0;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "---Menu---\n"
                + "1. Agregar Clientes o Empleados\n"
                + "2. Agregar Locales\n"
                + "3. Crear Producto\n"
                + "4. Log in Cliente\n"
                + "5. Eliminar\n"
                + "7. Modificar\n"
                + "8. Facturacion tiendas"));

        return opcion;
    }

    public static void Locales() {
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja lo siguiente a agragar: \n"
                + "1. Tiendas\n"
                + "2. Locales de comida\n"
                + "3. Quioscos"));

        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        int piso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el piso en el que se encuentra: "));

        // int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un empleado para el locales: \n"
        //  + recorrerP()));
        switch (aux) {
            case 1:
                int tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño, no mayor a 18 metros cuadrados: "));
                while (tamano < 0 || tamano > 18) {
                    tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Error tamaño invalido\nIngrese el tamaño, no mayor a 18 metros cuadrados: "));
                }
                //int tamano, String nombre, int piso
                //String nombre, String empleado_actual, int piso, ArrayList<Empleados> empleados, ArrayList<Productos> productos
                listlocales.add(new tienda(tamano, nombre, piso));

                break;
            case 2:
                //String nombre_ex, String nombre, String empleado_actual, int piso
                String nombree = JOptionPane.showInputDialog(null, "Ingrese el nombre tienda existente del quiosco: ");
                listlocales.add(new Quiosco(nombree, nombre, piso));
            case 3:
                int cont = 0;
                int p1 = 0,
                 p2 = 0,
                 p3 = 0,
                 p4 = 0;
                //String nombre, String empleado_actual, int piso
                listlocales.add(new local_comida(nombre, piso));

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
                //int decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
                int talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla"));
                String sex = JOptionPane.showInputDialog("Ingrese el sexo");
                ropa rop = new ropa(talla, sex, des, mar, 0, precio);

                String s = "";
                for (Locales t : listlocales) {

                    s += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

                }

                int opr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la tienda a la que desea agregar el producto: " + s));
                if (listlocales.get(opr) instanceof Quiosco) {
                    rop.setPrecio(precio / 2);

                } else if (listlocales.get(opr) instanceof local_comida) {
                    int res = JOptionPane.showConfirmDialog(null, "¿Es este el producto del dia?", "Opcion", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        rop.setDescuento(50);
                        double total = (precio / 100) * 50;
                        rop.setPrecio(total);
                    }

                } else {

                }

                listlocales.get(opr).getProductos().add(rop);
                JOptionPane.showMessageDialog(null, "Producto asiganado con exito");
                listproductos.add(rop);

                break;
            case 2:
                des = JOptionPane.showInputDialog("Ingrese la descripcion");
                mar = JOptionPane.showInputDialog("Ingrese la marca");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
                //decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
                String tipo = JOptionPane.showInputDialog("Ingrese el tipo");
                Juguetes juguete = new Juguetes(tipo, des, mar, 0, precio);
                
                String s1 = "";
                for (Locales t : listlocales) {

                    s1 += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

                }

                int opr1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la tienda a la que desea agregar el producto: " + s1));
                if (listlocales.get(opr1) instanceof Quiosco) {
                    juguete.setPrecio(precio / 2);

                } else if (listlocales.get(opr1) instanceof local_comida) {
                    int res = JOptionPane.showConfirmDialog(null, "¿Es este el producto del dia?", "Opcion", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        juguete.setDescuento(50);
                        double total = (precio / 100) * 50;
                        juguete.setPrecio(total);
                    }

                } else {

                }

                listlocales.get(opr1).getProductos().add(juguete);
                listproductos.add(juguete);
                JOptionPane.showMessageDialog(null, "Producto asiganado con exito");

                break;
            case 3:
                des = JOptionPane.showInputDialog("Ingrese la descripcion");
                mar = JOptionPane.showInputDialog("Ingrese la marca");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
                //decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
                String fecha_ca = JOptionPane.showInputDialog("Ingrese la fecha de caducidad");
                comida comida = new comida(fecha_ca, des, mar, 0, precio);

                String s2 = "";
                for (Locales t : listlocales) {

                    s2 += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

                }

                int opr2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la tienda a la que desea agregar el producto: " + s2));
                if (listlocales.get(opr2) instanceof Quiosco) {
                    comida.setPrecio(precio / 2);

                } else if (listlocales.get(opr2) instanceof local_comida) {
                    int res = JOptionPane.showConfirmDialog(null, "¿Es este el producto del dia?", "Opcion", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        comida.setDescuento(50);
                        double total = (precio / 100) * 50;
                        comida.setPrecio(total);
                    }

                } else {

                }

                listproductos.add(comida);
                JOptionPane.showMessageDialog(null, "Producto asiganado con exito");
                listlocales.get(opr2).getProductos().add(comida);
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
    public static void login_cliente() {
        int temp = 0;
        String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario");
        boolean existe = false;

        for (Personas l : listpersonas) {
            if (l instanceof Clientes) {
                if (l.getUsername().equals(usuario)) {
                    existe = true;
                    temp = listpersonas.indexOf(l);
                    break;
                }

            }

        }//fin for

        if (existe) {
            String contra = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
            if (contra.equals(listpersonas.get(temp).getPassword())) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + listpersonas.get(temp).getNombrec());

                clienteactividad(listpersonas.get(temp));
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario incorrecto o no existe");
        }

    }//Fin  metodo login cliente

    public static void clienteactividad(Personas cliente) {
        String se = "";
        for (Locales t : listlocales) {
            if (t instanceof tienda) {
                se += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";
            }

        }

        int electienda = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una tienda\n"
                + se));

        //
        String re = "";
        for (Productos r : listlocales.get(electienda).getProductos()) {
            re += "" + listlocales.get(electienda).getProductos().indexOf(r) + "" + "- " + r + "\n";
        }
        if (listlocales.get(electienda).getProductos().size() == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos");

        } else {
            int elecproducto = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija unj producto a comprar\n"
                    + re));

            //cliente
            if (((Clientes) cliente).getDinero() < listlocales.get(electienda).getProductos().get(elecproducto).getPrecio()) {
                JOptionPane.showMessageDialog(null, "No puede realizar la compra");

            } else {

                ((Clientes) cliente).setDinero(((Clientes) cliente).getDinero() - listlocales.get(electienda).getProductos().get(elecproducto).getPrecio());
                ((Clientes) cliente).getLista().add(listlocales.get(electienda).getProductos().get(elecproducto));
                JOptionPane.showMessageDialog(null, "Compra realizada");
                listlocales.get(electienda).getFacturacion().add(listlocales.get(electienda).getProductos().get(elecproducto).toString());
                listlocales.get(electienda).getProductos().remove(elecproducto);
            }
        }

    }//Fin metodo cliente actividad

    public static void Eliminar() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija que desea eliminar\n"
                + "1. Personas\n"
                + "2. Locales\n"
                + "3. Productos"));

        if (menu == 1) {
            String s = "";
            for (Personas t : listpersonas) {

                s += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

            }

            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las personasa a eliminar: " + s));
            listpersonas.remove(op);

        } else if (menu == 2) {
            String se = "";
            for (Locales t : listlocales) {

                se += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

            }

            int ope = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el local a eliminar: " + se));
            listlocales.remove(ope);

        } else if (menu == 3) {
            String ser = "";
            for (Productos t : listproductos) {

                ser += "" + listproductos.indexOf(t) + "" + "- " + t + "\n";

            }
            int opr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el producto a eliminar: " + ser));
            listproductos.remove(opr);

        } else {
            JOptionPane.showMessageDialog(null, "No existe");
        }

    }//Fin metodo elimianr

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
                Clientes cli = new Clientes(dinero, user, pasword, correo, nombre, id, nacimiento);
                listpersonas.add(cli);
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
                Empleados emp = new Empleados(horario, 0, user, pasword, correo, nombre, id, nacimiento);
                listpersonas.add(emp);

                String s = "";
                for (Locales t : listlocales) {

                    s += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

                }

                int opr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la tienda a la que desea agregar el cliente: " + s));
                listlocales.get(opr).getEmpleados().add(emp);
                JOptionPane.showMessageDialog(null, "Empleado asiganado con exito");
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

    public static void Modificar() {
        int menuinicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion del elementos a modificar: \n"
                + "1.Locales\n"
                + "2. Personas\n"
                + "3. Productos\n"
                + ""));

        switch (menuinicial) {
            case 1:
                ModificarLocales();
                break;
            case 2:
                ModificarPersona();
                break;
            case 3:
                ModificarProductos();
            default:
                break;

        }//Fin sitch

    }//Fin metodo midifciar

    public static void ModificarLocales() {
        String se = "";
        for (Locales t : listlocales) {

            se += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

        }

        int ope = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el local a modificar: " + se));

        if (listlocales.get(ope) instanceof tienda) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
            int piso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el piso en el que se encuentra: "));

            // int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un empleado para el locales: \n"
            //         + recorrerP()));
            int tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un tamaño \n"));

            if (listpersonas.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay personas para agregar al local");
            } else {
                String ser = "";
                for (Personas t : listpersonas) {

                    ser += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

                }
                int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una persona para el empleado actual\n" + ser));

                if (listpersonas.get(eleccion) instanceof Clientes) {
                    JOptionPane.showMessageDialog(null, "Esta persona no es un empleado");
                } else {
                    ((tienda) listlocales.get(ope)).setNombre(nombre);
                    ((tienda) listlocales.get(ope)).setPiso(piso);
                    ((tienda) listlocales.get(ope)).setEmpleado_actual(listpersonas.get(eleccion).getNombrec());
                    ((tienda) listlocales.get(ope)).setTamano(tamano);
                }

            }

        } else if (listlocales.get(ope) instanceof Quiosco) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
            int piso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el piso en el que se encuentra: "));

            //int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un empleado para el locales: \n"
            //   + recorrerP()));
            String nombreex = JOptionPane.showInputDialog(null, "Ingrese el nombre tienda existente:");

            if (listpersonas.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay personas para agregar al local");
            } else {
                String ser = "";
                for (Personas t : listpersonas) {

                    ser += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

                }
                int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una persona para el empleado actual\n" + ser));

                if (listpersonas.get(eleccion) instanceof Clientes) {
                    JOptionPane.showMessageDialog(null, "Esta persona no es un empleado");
                } else {
                    ((Quiosco) listlocales.get(ope)).setNombre(nombre);
                    ((Quiosco) listlocales.get(ope)).setPiso(piso);
                    ((Quiosco) listlocales.get(ope)).setEmpleado_actual(listpersonas.get(eleccion).getNombrec());
                    ((Quiosco) listlocales.get(ope)).setNombre_ex(nombreex);
                    //((Quiosco) listlocales.get(ope))
                }

            }

        } else if (listlocales.get(ope) instanceof local_comida) {

            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
            int piso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el piso en el que se encuentra: "));

            // int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un empleado para el locales: \n"
            //      + recorrerP()));
            if (listpersonas.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay personas para agregar al local");
            } else {
                String ser = "";
                for (Personas t : listpersonas) {

                    ser += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

                }
                int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una persona para el empleado actual\n" + ser));

                if (listpersonas.get(eleccion) instanceof Clientes) {
                    JOptionPane.showMessageDialog(null, "Esta persona no es un empleado");
                } else {
                    ((local_comida) listlocales.get(ope)).setNombre(nombre);
                    ((local_comida) listlocales.get(ope)).setPiso(piso);
                    ((local_comida) listlocales.get(ope)).setEmpleado_actual(nombre);
                }

            }

        }//Else if comida

    }//Fin  metodo modificar locales

    public static void ModificarPersona() {
        String se = "";
        for (Personas t : listpersonas) {

            se += "" + listpersonas.indexOf(t) + "" + "- " + t + "\n";

        }

        int ope = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el local a modificar: " + se));

        if (listpersonas.get(ope) instanceof Clientes) {

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
            ((Clientes) listpersonas.get(ope)).setUsername(user);
            ((Clientes) listpersonas.get(ope)).setPassword(pasword);
            ((Clientes) listpersonas.get(ope)).setCorreo(correo);
            ((Clientes) listpersonas.get(ope)).setNombrec(nombre);
            ((Clientes) listpersonas.get(ope)).setId(id);
            ((Clientes) listpersonas.get(ope)).setDinero(dinero);
            ((Clientes) listpersonas.get(ope)).setId(id);
            ((Clientes) listpersonas.get(ope)).setFecha(nacimiento);

        } else if (listpersonas.get(ope) instanceof Empleados) {

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
            String horario = JOptionPane.showInputDialog("Ingresar dinero disponible");

            ((Empleados) listpersonas.get(ope)).setUsername(user);
            ((Empleados) listpersonas.get(ope)).setPassword(pasword);
            ((Empleados) listpersonas.get(ope)).setCorreo(correo);
            ((Empleados) listpersonas.get(ope)).setNombrec(nombre);
            ((Empleados) listpersonas.get(ope)).setId(id);
            ((Empleados) listpersonas.get(ope)).setFecha(se);
            ((Empleados) listpersonas.get(ope)).setHorario(horario);

        }

    }//Fin metodo perosna

    public static void ModificarProductos() {
        //listproductos
        String ser = "";
        for (Productos t : listproductos) {

            ser += "" + listproductos.indexOf(t) + "" + "- " + t + "\n";

        }
        int opr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el producto a modificar: " + ser));

        if (listproductos.get(opr) instanceof ropa) {
            String des = JOptionPane.showInputDialog("Ingrese la descripcion");
            String mar = JOptionPane.showInputDialog("Ingrese la marca");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
            // int decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
            int talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla"));
            String sex = JOptionPane.showInputDialog("Ingrese el sexo");

            ((ropa) listproductos.get(opr)).setDescripcion(des);
            ((ropa) listproductos.get(opr)).setMarca(mar);
            ((ropa) listproductos.get(opr)).setPrecio(precio);
            //((ropa) listproductos.get(opr)).setDescuento(decuento);
            ((ropa) listproductos.get(opr)).setTalla(talla);
            ((ropa) listproductos.get(opr)).setSexo(sex);

        } else if (listproductos.get(opr) instanceof Juguetes) {
            String des = JOptionPane.showInputDialog("Ingrese la descripcion");
            String mar = JOptionPane.showInputDialog("Ingrese la marca");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
            //int descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
            String tipo = JOptionPane.showInputDialog("Ingrese el tipo");

            ((Juguetes) listproductos.get(opr)).setDescripcion(tipo);
            ((Juguetes) listproductos.get(opr)).setMarca(mar);
            ((Juguetes) listproductos.get(opr)).setPrecio(precio);
            //((Juguetes) listproductos.get(opr)).setDescuento(descuento);
            ((Juguetes) listproductos.get(opr)).setTipo(tipo);

        } else if (listproductos.get(opr) instanceof comida) {
            String des = JOptionPane.showInputDialog("Ingrese la descripcion");
            String mar = JOptionPane.showInputDialog("Ingrese la marca");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
            // int decuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el descuanto"));
            String fecha_ca = JOptionPane.showInputDialog("Ingrese la fecha de caducidad");

            ((comida) listproductos.get(opr)).setDescripcion(des);
            ((comida) listproductos.get(opr)).setMarca(mar);
            ((comida) listproductos.get(opr)).setPrecio(precio);
            //((comida) listproductos.get(opr)).setDescuento(decuento);
            ((comida) listproductos.get(opr)).setFecha_ca(fecha_ca);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrecto");
        }

    }//Fn productos

    public static void facturacion() {
        String s = "";
        for (Locales t : listlocales) {

            s += "" + listlocales.indexOf(t) + "" + "- " + t + "\n";

        }

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una tienda para ver su facturacion\n" + s));

        if (listlocales.get(opcion) instanceof tienda) {
            String se = "";
            for (String t : listlocales.get(opcion).getFacturacion()) {

                se += "" + listlocales.get(opcion).getFacturacion().indexOf(t) + "" + "- " + t + "\n";

            }

            JOptionPane.showMessageDialog(null, "Lista de los productos comprados\n" + se);
        } else {
            JOptionPane.showMessageDialog(null, "No es una tienda");
        }

    }//Fin metodo facturacion

}//Fin de la clase
