import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[5];


        for (int i=0; i<=4; i++) {
            System.out.println("Ingrese el numero en la posicion: "+i);
            numero[i] = sc.nextInt();
        }

        for (int i=0;i<numero.length;i++){
            System.out.println("["+i+"]"+" = "+numero[i]);
        }

    }
}