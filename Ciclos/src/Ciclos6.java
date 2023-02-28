import java.util.Scanner;

public class Ciclos6 {
    public static void main(String[] args) {
        String[] nombre = new String[3];
        int[] telefono = new int[3];
        String[] organizacion = new String[3];
        String buscar;
        String eliminar;
        int contador=0;
        int opc;
        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("Contactos telefonicos");
            System.out.println("1. Añadir contactos");
            System.out.println("2. Buscar contactos");
            System.out.println("3. Eliminar contactos");
            System.out.println("4. Salir ");
            opc= sc.nextInt();

            switch (opc) {

                case 1:
                    if (contador==3){
                        System.out.println("¡Agenda lleva!");
                        break;
                    }
                    System.out.println("Ingrese el nombre completo del contacto");
                    nombre[contador] = sc.next();
                    System.out.println("Ingrese el numero telefonico");
                    telefono[contador] = sc.nextInt();
                    if (contador==0 && (telefono[0]==telefono[1] || telefono[0]==telefono[2])){
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    }else if (contador==1 && (telefono[1]==telefono[0] || telefono[1]==telefono[2])){
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    }else if (contador==2 && (telefono[2]==telefono[0] || telefono[2]==telefono[1])){
                        System.out.println("EL numero del telefono ya se encuentra registrado");
                        break;
                    }
                    System.out.println("Ingrese el nombre de la organizacion");
                    organizacion[contador] = sc.next();
                    contador++;
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del contacto que desea buscar");
                    buscar = sc.next();


                    if (buscar.equalsIgnoreCase(nombre[0])){
                        System.out.println("El nombre del contacto es: " + nombre[0] + " ,Telefono: " + telefono[0] + " ,Organizacion: " + organizacion[0]);
                    }else if (buscar.equalsIgnoreCase(nombre[1])) {
                        System.out.println("El nombre del contacto es: " + nombre[1] + " ,Telefono: " + telefono[1] + " ,Organizacion: " + organizacion[1]);
                    }else if (buscar.equalsIgnoreCase(nombre[2])) {
                        System.out.println("El nombre del contacto es: "+nombre[2]+" ,Telefono: "+telefono[2]+" ,Organizacion: "+organizacion[2]);
                    }else
                        System.out.println("El nombre no corresponde a ningun contacto registrado");
                    break;

                case 3:
                    System.out.println("Introduzca el nombre del contacto que desea Eliminar");
                    eliminar =sc.next();

                    if (eliminar.equalsIgnoreCase(nombre[0])) {
                        System.out.println("Contacto Eliminado: " + nombre[0]);
                        nombre[0] = "";
                        telefono[0] = 0;
                        organizacion[0] = "";
                    }else if (eliminar.equalsIgnoreCase(nombre[1])) {
                        System.out.println("Contacto Eliminado: " + nombre[1]);
                        nombre[1]="";telefono[1]=0;organizacion[1]="";
                    }else if (eliminar.equalsIgnoreCase(nombre[2])) {
                        System.out.println("Contacto Eliminado: "+nombre[2]);
                        nombre[2]="";telefono[2]=0;organizacion[2]="";
                    }else
                        System.out.println("El contacto que desea eliminar no esta registrado");
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
