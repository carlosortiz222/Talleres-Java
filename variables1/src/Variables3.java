import java.util.Scanner;

public class Variables3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        String nombrepadre;
        String apellidopadre;
        String nombremadre;
        String apellidomadre;

        System.out.println("Escriba su nombre");
        nombre = sc.nextLine();

        System.out.println("Escriba su apellido");
        apellido = sc.nextLine();



        System.out.println("Escriba el nombre de su padre");
        nombrepadre = sc.nextLine();

        System.out.println("Escriba el apellido de su padre");
        apellidopadre = sc.nextLine();


        System.out.println("Escriba el nombre de su Madre");
        nombremadre=sc.nextLine();

        System.out.println("Escriba el apellido de su madre");
        apellidomadre=sc.nextLine();

        System.out.println("Yo "+nombre+" "+apellido+" Soy hijo de "+nombremadre+" "+apellidomadre+" y "+nombrepadre+" "+apellidopadre);

    }
}
