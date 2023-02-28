import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {

            int edad;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su edad");
            edad = sc.nextInt();

            if (edad<18) {
                System.out.println("Usted aún es un niño(a).");
            }

    }
}