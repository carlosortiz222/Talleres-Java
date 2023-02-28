import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Scanner;

public class Condicionales10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ingresos, retiros, consultas, cuenta, op,op2;
        String titular;
        op2=1;
        cuenta=0;

        System.out.println("Bienvenido a su Banco Fiel");
        System.out.println("Digite el nombre del titular de la cuenta");
        titular=sc.nextLine();

        do {

            System.out.println("Bienvenido sr(a) "+titular);
            System.out.println("Seleccione una Opcion");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. consultar saldo");
            op=sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Bienvenido sr(a) "+titular);
                    System.out.println("Digite la cantidad que desea Ingresar");
                    ingresos=sc.nextInt();
                    if (ingresos<0) {
                        System.out.println("Error al digitar, vuelva a intentar");
                    }else{
                            cuenta=cuenta+ingresos;
                        System.out.println("Sr(a) "+titular+" Su nuevo saldo es de: "+cuenta);
                        }
                    break;
                case 2:
                    System.out.println("Bienvenido sr(a) "+titular);
                    System.out.println("Digite la cantidad que desea retirar");
                    retiros= sc.nextInt();
                    if (cuenta<retiros){
                        System.out.println("Saldo insuficiente");
                    }else{
                        if (retiros<0){
                            System.out.println("Error al digitar, vuelva a intentar");
                        }else {
                            cuenta=cuenta-retiros;
                            System.out.println("Sr(a) "+titular+" Su nuevo saldo es de: "+cuenta);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bienvenido sr(a) "+titular);
                    System.out.println("su saldo es de: "+cuenta);
                    break;
                default:
                    System.out.println("Error al digitar, vuelva a intentar");
                    break;
            }
            System.out.println("Desea realizar otra operacion");
            System.out.println("1.Si      2.No");
            op2= sc.nextInt();
        } while (op2==1);
        System.out.println("Gracias por Visitarnos");

    }
}
