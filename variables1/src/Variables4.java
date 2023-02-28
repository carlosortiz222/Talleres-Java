import java.util.Scanner;

public class Variables4 {

    public static void main ( String[] args){

        Scanner sc = new Scanner(System.in);
        String ciudad;
        String pais;


        System.out.println("Escriba el nombre de la ciudad");
        ciudad = sc.nextLine();

        System.out.println("Escriba el nombre del pais");
        pais = sc.nextLine();

        System.out.println("La ciudad "+ciudad+" Es la capital del pais "+pais);
    }
}
