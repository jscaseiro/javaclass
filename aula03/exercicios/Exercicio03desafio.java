package exercicios;

import java.util.Scanner;

public class Exercicio03desafio {
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
            if (cont <= n / 2) {
                System.out.print(cont + ", ");
            } else {
                System.out.print(cont);
            }
            cont *= 2; // mesmo que: cont = cont * 2 e serve para cont = cont + 1 = "cont += 1;"
        }
        
        System.out.println();
        teclado.close();
    }
    
}