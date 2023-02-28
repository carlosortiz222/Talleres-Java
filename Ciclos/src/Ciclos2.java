import java.util.Scanner;

public class Ciclos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b,m;

        System.out.println("Escriba el numero de pisos de la piramide");
        n = sc.nextInt();
        m=n+1;

        while (n > 0) {
            for (a=n; a>0; a--) {
                System.out.print(" ");
            }
            for (b=n; b<m; b++) {
                System.out.print("*");
            }
            System.out.println("");
            n=n-1;
            }
    }
}
