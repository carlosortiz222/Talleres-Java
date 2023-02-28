import java.util.Scanner;

public class Arreglos5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[11][11];
        int i,j,leerFila,leerColumna;


        for (int a=0;a<10;a++) {
            System.out.print("     "+a);
        }
        System.out.println("");

        for ( i=0;i<10;i++){
            System.out.print(i+"  ");
            for ( j=0;j<10;j++){
                tabla[i][j]=(i+1)*(j+1);
                System.out.print(" "+(j+1)+"x"+(i+1)+"  ");
            }
            System.out.println("");
        }

        System.out.println("\nIntroduzca el numero de la columna");
        leerFila=sc.nextInt();
        System.out.println("Introduzca el numero de la fila");
        leerColumna=sc.nextInt();

        for (int  x=0;x<10;x++){
            for ( int y=0;y<10;y++){
                if (x==leerFila && y==leerColumna){
                    System.out.println("----------------------------");
                    System.out.println("El resultado de la operacion"+
                            "\n"+(leerFila+1)+"x"+(leerColumna+1)+" = "+tabla[x][y]);
                    System.out.println("----------------------------");
                }

            }

        }






    }
}
