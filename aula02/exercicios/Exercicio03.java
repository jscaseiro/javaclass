package exercicios;

import java.util.Scanner;

public class Exercicio03 {
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            float nro1, nro2;

            // INPUT
            System.out.println("Digite o primeiro numero: ");
            nro1 = entrada.nextFloat();
            System.out.println("Digite a segundo numero: ");
            nro2 = entrada.nextFloat();

            // PROCESSING
            if (nro1 > nro2) {
                System.out.printf("Ordem decrescente: %.2f %.2f\n", nro1, nro2);
            } else {
                System.out.printf("Ordem decrescente: %.2f %.2f\n", nro2, nro1);
            }

            entrada.close();
        }
}
