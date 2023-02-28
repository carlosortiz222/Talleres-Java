import java.util.Scanner;

public class Condicionales6 {

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n;
    System.out.println("Taller de motos ¡EL Maquinista!");
    System.out.println("Digite una de las siguientes opciones");
    System.out.println("1. Registro de ingreso");
    System.out.println("2. Registro de salida");
    System.out.println("3. Arreglos realizado por el mecanico");
    n = sc.nextInt();

    switch (n){
        case 1:
            System.out.println("Observaciones por parte del cliente");
            break;
        case 2:
            System.out.println("Escriba las novedades para la entrega de la motocicleta");
            break;
        case 3:
            System.out.println("Repuestos cambiados en la motocicleta");
            break;
        default:
            System.out.println("Error al seleccinoar una opcion, intente de nuevo");
            break;

    }


}

}
