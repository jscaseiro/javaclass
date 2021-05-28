package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro;
        // double nro; // Solucao 1
        double metade;

        // INPUT
        System.out.print("Digite um numero inteiro: ");
        nro = entrada.nextInt();

        // PROCESSING
        if ( nro > 20) {
            System.out.println("Numero maior que 20!");
            // metade = nro / 2; // Solucao 1: converter o tipo de variável.
            // metade = nro / 2.0; // Solucao 2: conversao implicita.
            metade = (double)nro / 2; // casting = conversão de tipos
            System.out.printf("Sua metade é %.2f\n", metade );
            // System.out.println("Sua metade é " + ((double)nro / 2)); // Solucao 4: remocao de variaveis
        }

        entrada.close();
    }    
}
