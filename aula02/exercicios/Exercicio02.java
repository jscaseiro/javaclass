package exercicios;

import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            double nota1, nota2, avrg; // Para troca facilitada no nome da variável em todo o arquivo, selecionar a variável, F2, alterar o nome e enter.

            // INPUT
            System.out.println("Digite a primeira nota:");
            nota1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota:");
            nota2 = entrada.nextDouble();

            // PROCESSING
            avrg = (nota1*0.4 + nota2*0.6);
            
            if (avrg >= 6.0) {
                System.out.println("Aprovado! :) ");
            } else {
                System.out.println("Reprovado. :( ");
            }
            
            System.out.println("Sua nota final: " + avrg);
            entrada.close();
        }
}
