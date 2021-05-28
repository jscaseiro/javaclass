package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, odd = 0, evenSum = 0;
        final int LIMIT = 10;

        System.out.println();
        for (int i = 1; i <= LIMIT; i++) {
            System.out.printf("Digite o %do. número: ", i);
            n = input.nextInt();
            if (n % 2 == 0) {
                evenSum +=  n;
            } else {
                odd++;
            }
        }
        System.out.println();
        System.out.println("A média dos pares é " + evenSum/(LIMIT - odd));
        System.out.println();
        System.out.printf("A porcentagem de impares é %.2f%%\n", (((double)odd/LIMIT)*100));
        System.out.println();
        input.close();
    }
}
