import java.util.Scanner;

public class Condicionales4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Bienvenido a Video tienda Barrio Porvenir");
        System.out.println("Digite una de las siguientes opciones");
        System.out.println("1. Alquilar Pelicula");
        System.out.println("2. Consultar Peliculas Disponibles");
        System.out.println("3. Recibir pelicula en video Tienda");
        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Digite el nombre de la pelicula de que desea alquilar");
                break;
            case 2:
                System.out.println("Estas son las peliculas que tenemos diponibles");
                break;
            case 3:
                System.out.println("escriba solo si la pelicula presenta algin tipo de daño");
                break;
            default:
                System.out.println("Error al digitar una opcion, por favor vuelva a intentar");
                break;
        }
    }
}
