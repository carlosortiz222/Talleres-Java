import java.util.Scanner;

public class Condicionales8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sabor, decoraciones;
        int n = 0, m, pedidos, venta, porciones;
        pedidos = 0;
        venta = 0;


            System.out.println("Bienvenido a la pasteleria Don Carlos");
            System.out.println("La mejor pasteleria de la ciudad");

        while (n != 5) {
            System.out.println("Elija una de las siguientes opciones");
            System.out.println("1. Realizar Pedido");
            System.out.println("2. Ver tortas disponibles");
            System.out.println("3. Ver cantidad de pedidos ");
            System.out.println("4. Ver cantidad de Ventas realizadas");
            System.out.println("5. Salir");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Vamos a preparar tu torta");
                    System.out.println("sabor de torta");
                    sabor = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Decoracion de la torta");
                    decoraciones = sc.nextLine();
                    System.out.println("Cantidad de Porciones");
                    porciones = sc.nextInt();
                    System.out.println(" ");

                    System.out.println("confirmemos tu pedido");
                    System.out.println("Torta sabor a " + sabor + " Cantidad de prociones " + porciones + " Con decoracion de " + decoraciones);
                    pedidos++;
                    venta++;
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Estas son las tortas disponibles");
                    System.out.println("Escoja la que mas le guste");
                    System.out.println("1.Torta de chocolate, 8 porciones, Decoracion en Crema de Chocolate");
                    System.out.println("2.Torta de Vainilla, 8 porciones, Decoracion en Drip cakes");
                    System.out.println("3.Torta de Naranja, 12 porciones, Decoracion en Crema de mantequilla");
                    m = sc.nextInt();

                    switch (m) {
                        case 1:
                            System.out.println("Confirmemos tu torta");
                            System.out.println("Torta de chocolate, 8 porciones, Decoracion en Crema de Chocolate");
                            venta++;
                            System.out.println(" ");
                            break;
                        case 2:
                            System.out.println("Confirmemos tu torta");
                            System.out.println("Torta de Vainilla, 8 porciones, Decoracion en Drip cakes");
                            venta++;
                            System.out.println(" ");
                            break;
                        case 3:
                            System.out.println("Confirmemos tu torta");
                            System.out.println("Torta de Naranja, 12 porciones, Decoracion en Crema de mantequilla");
                            venta++;
                            System.out.println(" ");
                            break;
                        default:
                            System.out.println("Opcion invalida, intente de nuevo");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Esta es la cantidad de Pedidos: " + pedidos);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Esta es la cantidad de ventas realizadas: " + venta);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
                    break;

            }

        }

    }
}
