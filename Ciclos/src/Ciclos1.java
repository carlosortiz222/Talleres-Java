import java.util.Scanner;

public class Ciclos1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.println("Escriba el numero de pisos de la piramide");
        n=sc.nextInt();

        for (int a=0;a<n;a++){
            for (int b=0;b<=a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}