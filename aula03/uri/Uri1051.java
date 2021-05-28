package uri;

import java.util.Scanner;
import java.io.IOException;

// Taxes
public class Uri1051 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        float sal;
        double tax;

        sal = input.nextFloat();

        if (sal > 0 && sal <= 2000.00) {
            System.out.println("Isento\n");
        } else {
            if (sal > 2000.00 && sal <= 3000.00) {
                System.out.printf("R$ %.2f\n", ((sal - 2000.00) * 0.08));
            } else {
                double sal_aux;
                if (sal > 3000.00 && sal <= 4500.00) {
                    sal_aux = sal - 3000.00;
                    tax = sal_aux * 0.18;
                    tax += ((sal - sal_aux) - 2000.00) * 0.08;
                    System.out.printf("R$ %.2f\n", tax);
                } else {
                    if (sal > 4500.00) {
                        float sal_aux2 = sal - 4500;
                        tax = sal_aux2 * 0.28;
                        sal_aux = (sal - sal_aux2) - 3000.00;
                        tax +=  sal_aux * 0.18;
                        sal_aux = (sal - sal_aux - sal_aux2) - 2000.00;
                        tax += sal_aux * 0.08;
                        System.out.printf("R$ %.2f\n", tax);
                    }
                }
            }
        }
        input.close();
    }
}
