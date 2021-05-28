package exercicios;

import java.util.Scanner;

public class Exercicio04 {
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            double sal, prest, val, taxa;
            taxa = 0.3;

            // INPUT
            System.out.print("Digite o salário bruto: R$ ");
            sal = entrada.nextDouble();
            System.out.print("Qual o valor da prestação: R$ ");
            prest = entrada.nextFloat();

            // PROCESSING
            val = sal * taxa;
            System.out.println();

            if (prest <= val) {
                System.out.println("O emprestimo pode ser concedido!");
            } else {
                System.out.printf("O valor máximo da sua prestação deve ser R$ %.2f\n", val);
            }

            entrada.close();
        }
}