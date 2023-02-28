import java.util.Scanner;

public class Condicionales9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float triangulo, rectangulo, trapecio, base, altura, basemenor,basemayor;
        int n;

        System.out.println("Figuras Geometricas");
        System.out.println("Calculo de área");
        System.out.println("Seleccione una figura geometrica");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        n= sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Ingrese las medidas");
                System.out.println("base en Metros");
                base=sc.nextFloat();
                System.out.println("Altura en Metros");
                altura=sc.nextFloat();
                rectangulo=base*altura;
                System.out.println("El area del rectangulo es de: "+rectangulo+" Mts^2");
                break;

            case 2:
                System.out.println("Ingrese las medidas");
                System.out.println("base en Metros");
                base=sc.nextFloat();
                System.out.println("Altura en Metros");
                altura=sc.nextFloat();
                triangulo=(base*altura)/2;
                System.out.println("El area del triangulo es de: "+triangulo+" Mts^2");
                break;
            case 3:
                System.out.println("Ingrese las medidas");
                System.out.println("base menor en Metros");
                basemenor=sc.nextFloat();
                System.out.println("base mayor en Metros");
                basemayor=sc.nextFloat();
                System.out.println("Altura en Metros");
                altura=sc.nextFloat();
                trapecio=((basemenor+basemayor)*altura)/2;
                System.out.println("El area del Trapecio es de: "+trapecio+" Mts^2");
                break;
            default:
                System.out.println("opcion invalida, vuelva a intentar");
                break;
        }

        System.out.println("Gracias por utilizar nuestra App");

    }
}
