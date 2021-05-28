package uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x;
        float y, vel;

        // INPUT
        x = entrada.nextInt();
        y = entrada.nextFloat();
        
        // PROCESSING
        vel = (x / y);

        // OUTPUT        
        System.out.printf("%.3f km/l\n", vel);

        entrada.close();
    }
}
