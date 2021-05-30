package uri;

import java.util.Scanner;

// Score Validation
public class Uri1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota = 0, notaAvrg = 0;
        int count = 0, countNotas = 0;
        while (count < 2) {
            nota = input.nextDouble();
            if (nota > 0 && nota <= 10) {
                count++;
                notaAvrg += nota;
                countNotas++;
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f\n", notaAvrg / countNotas);
        input.close();
    }
}