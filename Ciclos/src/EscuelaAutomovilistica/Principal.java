package EscuelaAutomovilistica;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nombre, aprobacion;
        int contadorUsuarios = 0, cedula;
        int opc;

        Scanner sc = new Scanner(System.in);
        ArrayList<Usuarios> listaUsuario = new ArrayList<>(7);


        do {
            System.out.println("\nEscuela Automovilistica !El Maestro¡ " +
                    "\n Selecciona una de las opciones" +
                    "\n 1. Registrar Usuarios" +
                    "\n 2. Registro de Prueba" +
                    "\n 3. Resultados de Usuario" +
                    "\n 4. Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    if (contadorUsuarios == 8) {
                        System.out.println("\n¡No hay cupos disponibles!");
                        break;
                    } else {
                        System.out.println("Ingrese el nombre del nuevo usuario");
                        nombre = sc.next();
                        System.out.println("ingrese numero de Cedula");
                        cedula = sc.nextInt();

                        Usuarios crearUsuario = new Usuarios();
                        crearUsuario.setNombre(nombre);
                        crearUsuario.setCedula(cedula);
                        listaUsuario.add(crearUsuario);
                        contadorUsuarios++;
                        break;
                    }

                case 2:
                    System.out.println("Escriba el numero de cedula del usuario");
                    int registrar = sc.nextInt();
                    boolean encontrado = false;

                    Iterator<Usuarios> it = listaUsuario.iterator();

                    while (it.hasNext()) {
                        Usuarios u = it.next();
                        if (u.getCedula() == registrar) {
                            encontrado = true;
                            System.out.println("Usuario: " +
                                    "\nEl usuario aprobó la prueba?" +
                                    "\nEscriba si o no");
                                    String verificacion = sc.next();
                            if (verificacion.equalsIgnoreCase("si")) {
                                u.setAprobacion(verificacion);
                                    System.out.println("El registro se realizo satisfactoriamente");
                            } else if (verificacion.equalsIgnoreCase("no")) {
                                u.setAprobacion(verificacion);
                                    System.out.println("El registro se realizo satisfactoriamente");
                            } else
                                    System.out.println("respuesta no valida");
                                break;
                            }
                    }
                        if (encontrado) {
                            System.out.println(" ");
                        }else{
                            System.out.println("Usuario no se encuentra en la base de datos");
                        }
                        break;

                case 3:
                    System.out.println("Escriba el numero de cedula del usuario que busca");
                    int buscar = sc.nextInt();
                    boolean encontrado2 = false;

                    Iterator<Usuarios> ip = listaUsuario.iterator();

                    while (ip.hasNext()) {
                        Usuarios u = ip.next();
                        if (u.getCedula() == buscar) {
                            System.out.println(u.toString());
                            encontrado2 = true;
                            break;
                        }
                    }
                        if (encontrado2) {
                            System.out.println(" ");
                        }else{
                            System.out.println("Usuario no se encuentra en la base de datos");
                        }
                        break;

                default:
                    System.out.println("Opcion Incorrecta, porfa farvor vuelva a intentar");

                }

        }while (opc != 4) ;
            System.out.println("Gracias por utilizar nuestra app");


        }
    }
