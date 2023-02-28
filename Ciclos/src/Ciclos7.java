import java.util.Scanner;

public class Ciclos7 {
    public static void main(String[] args) {
        String[] placa = new  String[5];
        String[] marca = new String[5];
        String[] nombre = new String[5];
        int[] telefono = new int[5];
        String buscar;
        String eliminar;
        int contador=0;
        int opc;
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("Bienvenido a parquedero EL GUARDIAN");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Ingreso al parqueadero");
            System.out.println("2. Retiro del parqueadero");
            System.out.println("3. Consulta vehiculo en parqueadero");
            System.out.println("4. Salir");
            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    if (contador == 5) {
                        System.out.println("¡Parqueadero lleno!");
                        break;
                    }
                    System.out.println("Ingrese las placas del vehiculo");
                    placa[contador] = sc.next();


                     if (contador == 1 && (placa[1] == placa[0] || placa[1] == placa[2] || placa[1] == placa[3] || placa[1] == placa[4])) {
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    } else if (contador == 2 && (placa[2] == placa[0] || placa[2] == placa[1] || placa[2] == placa[3] || placa[2] == placa[4])) {
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    } else if (contador == 3 && (placa[3] == placa[0] || placa[3] == placa[1] || placa[3] == placa[2] || placa[3] == placa[4] )) {
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    } else if (contador == 4 && (placa[4] == placa[0] || placa[4] == placa[1] || placa[4] == placa[2] || placa[4] == placa[3] )) {
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    }
                    System.out.println("Ingrese la marca del vehiculo");
                    marca[contador] = sc.next();
                    System.out.println("Ingrese el nombre completo");
                    nombre[contador] = sc.next();
                    System.out.println("Ingrese el numero telefonico");
                    telefono[contador] = sc.nextInt();
                    System.out.println("Vehiculo ingresado ");
                    contador++;
                    break;

                case 2:
                    System.out.println("Introduzca la placa del vehiculo que sale del parqueadero");
                    eliminar = sc.next();

                    if (eliminar.equalsIgnoreCase(nombre[0])) {
                        System.out.println("Vehiculo que sale " + placa[0]);
                        placa[0] = "";
                        marca[0] = "";
                        telefono[0] = 0;
                        nombre[0] = "";
                    } else if (eliminar.equalsIgnoreCase(placa[1])) {
                        System.out.println("Vehiculo que sale " + placa[1]);
                        placa[1] = "";
                        marca[1] = "";
                        telefono[1] = 0;
                        nombre[1] = "";
                    } else if (eliminar.equalsIgnoreCase(placa[2])) {
                        System.out.println("Vehiculo que sale " + placa[2]);
                        placa[2] = "";
                        marca[2] = "";
                        telefono[2] = 0;
                        nombre[2] = "";
                    } else if (eliminar.equalsIgnoreCase(placa[3])) {
                        System.out.println("Vehiculo que sale " + placa[3]);
                        placa[3] = "";
                        marca[3] = "";
                        telefono[3] = 0;
                        nombre[3] = "";
                    } else if (eliminar.equalsIgnoreCase(placa[4])) {
                        System.out.println("Vehiculo que sale " + placa[4]);
                        placa[4] = "";
                        marca[4] = "";
                        telefono[4] = 0;
                        nombre[4] = "";
                    } else
                        System.out.println("Vehiculo no se encuentra registrado");
                    break;

            case 3:
                    System.out.println("Introduzca la placa que desea buscar");
                    buscar = sc.next();


                    if (buscar.equalsIgnoreCase(placa[0])){
                        System.out.println("El vehiculo es: " + placa[0] + " ,nombre de conductor: " + nombre[0]);
                    }else if (buscar.equalsIgnoreCase(placa[1])){
                        System.out.println("El vehiculo es: " + placa[1] + " ,nombre de conductor: " + nombre[1]);
                    }else if (buscar.equalsIgnoreCase(placa[2])){
                        System.out.println("El vehiculo es: " + placa[2] + " ,nombre de conductor: " + nombre[2]);
                    }else if (buscar.equalsIgnoreCase(placa[3])){
                        System.out.println("El vehiculo es: " + placa[3] + " ,nombre de conductor: " + nombre[3]);
                    }else if (buscar.equalsIgnoreCase(placa[4])){
                        System.out.println("El vehiculo es: " + placa[4] + " ,nombre de conductor: " + nombre[4]);
                    }else
                        System.out.println("El Vehiculo no se encuentra registrado");
                    break;

                case 4:
                    System.out.println("Gracias por utilizar Nuestra app");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor vuelva a intentar ");
                    break;
            }
        }while (opc !=4);
    }
}

