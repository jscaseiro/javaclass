package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a, b, soma;

        // INPUT
        a = entrada.nextInt();
        b = entrada.nextInt();

        // PROCESSING
        soma = a + b;

        // OUTPUT        
        System.out.println("SOMA = " + soma);

        // Resource leak
        entrada.close();
    }
}
