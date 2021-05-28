package exercicios;

import java.util.Scanner;

public class Exercicio04 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n, soma;
       
       n = 1;
       soma = 0;
       System.out.println();

       while (n != 0) {
           System.out.print("Digite o número para somatória: ");
           n = input.nextInt();
           soma = soma + n;
       }
       System.out.println();
       System.out.println("O valor total da somatória: " + soma);
       System.out.println();
       input.close();
   } 
}
