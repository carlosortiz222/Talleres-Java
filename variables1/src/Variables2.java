import java.util.Scanner;

public class Variables2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        float estatura;

        System.out.println("Escriba su nombre");
        nombre = sc.nextLine();

        System.out.println("Escriba su apellido");
        apellido = sc.nextLine();

        System.out.println("Digite su edad");
        edad = sc.nextInt();

        System.out.println("Digite su estatura");
        estatura = sc.nextFloat();


    }
}
