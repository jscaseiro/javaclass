package exercicios;

import java.util.Scanner;

public class Exercicio05 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n, even, odd;
       final int LIMIT = 10; // Constante = Não é possível alterar o valor.

       even = 0;
       odd = 0;
       System.out.println();
       for (int i = 1; i <= LIMIT; i++) {
           System.out.printf("Digite o %do. número: ", i);
           n = input.nextInt();
           if (n % 2 == 0) {
               even++;
           } else {
               odd++;
           }
       }
       System.out.println();
       System.out.println("O total de pares é " + even);
       System.out.println();
       System.out.println("O total de impares é " + odd);
       System.out.println();
       input.close();
   } 
}
