import javax.swing.*;
import java.util.Scanner;

public class Condicionales3 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre, apellido;

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese sus Apellidos");
        apellido = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println(nombre + " " + apellido + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }

        if (edad < 18) {
                System.out.println(nombre + " " + apellido + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }

    }
}
