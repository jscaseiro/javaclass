package exemplos;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exemplo03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nro;

        System.err.print("Digite um número para saber se é Par: ");
        nro = input.nextInt();

        evenOrNot(nro);
        input.close();
    }

    static void evenOrNot (int nro) {
        
        if (nro % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }

    static boolean ehPar(int nro) {
        return (nro % 2 == 0);
    }
}