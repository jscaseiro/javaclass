package exercicios;

import java.util.Scanner;

public class Exercicio04desafio {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n, soma, cont;
       
       n = 1;
       soma = 0;
       cont = 1;
       
       System.out.println();
       System.out.println("Programa de somatória");
       System.out.println();
       while (n != 0) {
           System.out.printf("Digite o %do número: ", cont);
           n = input.nextInt();
           soma = soma + n;
           cont++;
       }
       System.out.println();
       System.out.println("O valor total da somatória: " + soma);
       System.out.println();
       input.close();
   } 
}
