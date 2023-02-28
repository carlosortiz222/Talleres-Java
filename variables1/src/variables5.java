import java.util.Scanner;

public class variables5 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String nombremascota;
        String tipomascota;
        int edadmascota;
        String nombrepersona;

        System.out.println("Ingrese su nombre completo");
        nombrepersona = sc.nextLine();

        System.out.println("Ingrese el nombre de la mascota");
        nombremascota = sc.nextLine();

        System.out.println("Ingrese el tipo de mascota");
        tipomascota = sc.nextLine();

        System.out.println("Ingrese la edad de la mascota");
        edadmascota = sc.nextInt();



        System.out.println(nombremascota+" Es un(a) "+tipomascota+" el cual, tiene "+edadmascota+" años de edad y "+nombrepersona+" Es actualmente su dueño.");
    }
}
