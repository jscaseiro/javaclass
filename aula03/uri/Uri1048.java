package uri;

import java.util.Scanner;
import java.io.IOException;

// Salary increase
public class Uri1048 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float sal;

        sal = input.nextFloat();

        if (sal > 0 && sal <= 400.00) {
            System.out.printf("Novo salario: %.2f\n", (sal * 1.15));
            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.15));
            System.out.println("Em percentual: 15 %");
        } else {
            if (sal > 400.00 && sal <= 800.00) {
                System.out.printf("Novo salario: %.2f\n", (sal * 1.12));
                System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.12));
                System.out.println("Em percentual: 12 %");
            } else {
                if (sal > 800.00 && sal <= 1200.00) {
                    System.out.printf("Novo salario: %.2f\n", (sal * 1.10));
                    System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.10));
                    System.out.println("Em percentual: 10 %");
                } else {
                    if (sal > 1200.00 && sal <= 2000.00) {
                        System.out.printf("Novo salario: %.2f\n", (sal * 1.07));
                        System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.07));
                        System.out.println("Em percentual: 7 %");
                    } else {
                        if (sal > 2000.00) {
                            System.out.printf("Novo salario: %.2f\n", (sal * 1.04));
                            System.out.printf("Reajuste ganho: %.2f\n", (sal * 0.04));
                            System.out.println("Em percentual: 4 %");
                        }
                    }
                }
            }
        }
        input.close();           
    }
}
