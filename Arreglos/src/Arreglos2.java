import java.util.ArrayList;

public class Arreglos2 {
    public static void main(String[] args) {
        int numero;
        int [] numeros = new int[20];
        ArrayList pares = new ArrayList<>();
        ArrayList impares = new ArrayList();
        int contador=0;

        while (contador<20){
            numero = (int) (Math.random() * 100 + 1);
            numeros[contador]=numero;
            contador++;
        }

        for (int i=0; i<numeros.length;i++){
            if ( numeros[i]%2==0){
                pares.add(numeros[i]);
            }else
               impares.add(numeros[i]);
        }


        System.out.println("numeros pares: "+pares.toString());

        System.out.println("numeros impares: "+impares.toString());


    }
}
