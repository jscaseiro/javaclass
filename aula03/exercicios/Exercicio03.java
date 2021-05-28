package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, cont;
        cont=1;

        System.out.println();
        System.out.println("Sequencia: 1, 2, 4, 8, 16, 32, 64, 128, ...");
        System.out.print("Digite o número limite da sequencia: ");
        n = teclado.nextInt();

        System.out.println();
        System.out.println("Número digitado: " + n);
        
        while (cont <= n) {
            System.out.print(cont + " ");
            cont = cont * 2;
        }
        System.out.println();
        teclado.close();
    }
    
}