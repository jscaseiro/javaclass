package exercicios;

import java.util.Scanner;

public class Exercicio05 {
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            double sal;

            // INPUT
            System.out.print("Digite o salário bruto: R$ ");
            sal = entrada.nextDouble();

            // PROCESSING
            if (sal <= 600) {
                System.out.println("O emprestimo pode ser concedido!");
            } else {
                if (sal > 600 && sal <= 1200) { 
                    System.out.println("O emprestimo pode ser concedido!");
                } else {
                    if (sal > 1200 && sal <= 2000) { 
                        System.out.println("O emprestimo pode ser concedido!");
                    } else { 
                        System.out.printf("O valor máximo da sua prestação deve");
                    }
            }

            entrada.close();
        }
    }
}