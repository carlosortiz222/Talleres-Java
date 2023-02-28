import java.util.Scanner;

public class Condicionales7 {

    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        double peso, estatura, imc;

        System.out.println("Bienvenido a la secretaria de salud Municipal");
        System.out.println("Calculo de IMC (Índice de masa corporal)");

        System.out.println("Digite su peso");
        peso=sc.nextDouble();
        System.out.println("Digite su estatura(mts)");
        estatura=sc.nextDouble();

        imc=peso/Math.pow(estatura, 2);

        if (imc<18.5){
            System.out.println("su nivel de peso es BAJO su masa corporal es de: "+imc);
        }else {
            if (imc>=18.5 & imc<25){
                System.out.println("su nivel de peso es NORMAL su masa corporal es de: "+imc);
            }else {
                if (imc>=25 & imc<29.9){
                    System.out.println("su nivel de peso es SOBREPESO su masa corporal es de: "+imc);
                }else {
                    if (imc>=29.9){
                        System.out.println("su nivel de peso es OBESIDAD su masa corporal es de: "+imc);
                    }
                }
            }
        }
    }
}
