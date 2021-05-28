package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a, b, c, avrg;

        // INPUT
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        // PROCESSING
        avrg = (a*2 + b*3 + c*5) / 10;

        // OUTPUT        
        System.out.printf("MEDIA = %.1f\n", avrg);

        entrada.close();
    }
}
