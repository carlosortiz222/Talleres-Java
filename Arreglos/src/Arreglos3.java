public class Arreglos3 {

    public static void main(String[] args) {

        for (int i = 0; i<1000; i++) {
            int contador=0;
            int j=1;
            while (j<=i) {
                if (i % j == 0) {
                contador++;
                    }
                j++;
            }

            if (contador==2){
            System.out.println(i);
            }

        }
    }
}


