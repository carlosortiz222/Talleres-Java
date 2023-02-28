import java.util.Scanner;

public class Ciclos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,b,m,l;
        float c,d;

        System.out.println("Escriba el numero de pisos de la piramide");
        n = sc.nextInt();
        m=n+1;
        l=n*2;
       while (n > 0) {
            for (a=n; a>0; a--) {
                System.out.print(" ");
            }
            for (b=n; b<m; b++) {
                System.out.print("*");

            }
            System.out.println("");
            n=n-1;
            m=m+1;
        }
        while (l > 0) {
            for (c=l/3; c>=0; c--) {
                System.out.print(" ");
            }
            for (d=l/3; d>0; d--) {
                System.out.print("*");
            }
            System.out.println("");
            l=l-100;
        }



    }
}
