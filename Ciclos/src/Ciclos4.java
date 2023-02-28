import java.util.Scanner;

public class Ciclos4 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int r,x,y;

        System.out.println("Indique la tabla que desea crear");
        y= sc.nextInt();

        for (x=1;x<=10;x++){
            r=y*x;
            System.out.println(y+" x "+x+" = "+r);
        }



    }
}
