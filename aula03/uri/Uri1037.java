package uri;

import java.io.IOException;
import java.util.Scanner;

// Interval
public class Uri1037 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float nr;

        nr = input.nextFloat();

        if (nr >= 0.0 && nr <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else {
            if (nr > 25.0 && nr <= 50.0) {
                System.out.println("Intervalo (25,50]");
            } else {
                if (nr > 75 && nr <= 100) {
                    System.out.println("Intervalo (75,100]");
                } else {
                    System.out.println("Fora de intervalo");
                }
            }
        }
        input.close();
    }
}
