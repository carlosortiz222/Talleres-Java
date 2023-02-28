import java.util.Scanner;

public class Ciclos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        String nombre="";

        do {
            System.out.println("Menu de usuario");
            System.out.println("1. Captura Nombre");
            System.out.println("2. Saludar Persona");
            System.out.println("3. Salir del sistema");
            opc=sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Escriba su nombre");
                    sc.nextLine();
                    nombre=sc.nextLine();
                    break;
                case 2:
                    System.out.println("Hola "+nombre+" ¿Como estas?");
                    break;
                case 3:
                    System.out.println("Gracias por utilizar nuestra app");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor vuelva a intentar");
                    break;
            }
            System.out.println("");
        }while(opc!=3);
    }
}
