import java.util.Scanner;

public class Condicionales5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Bienvenido a Drogeria mi salud");
        System.out.println("Localidad Suba");
        System.out.println("Digite una de las siguientes opciones");
        System.out.println("1. Compra de producto");
        System.out.println("2. Consultar de precios por producto");
        System.out.println("3. Devoluciones");
        n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Digite el nombre del producto que desea comprar");
                break;
            case 2:
                System.out.println("Digite el nombre del producto que desea consultar");
                break;
            case 3:
                System.out.println("escriba brevemente el daño que presenta el producto");
                break;
            default:
                System.out.println("Error al digitar una opcion, por favor vuelva a intentar");
                break;
        }
    }
}
