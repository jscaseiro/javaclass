package exercicios;
import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nro1, nro2, nro3;

        System.err.print("Digite três números para saber qual é o menor: ");
        nro1 = input.nextInt();
        nro2 = input.nextInt();
        nro3 = input.nextInt();

        lower(nro1, nro2, nro3);
        input.close();
    }

    // Errado, pois não retorna o menor valor.
    static void lower (int nro1, int nro2, int nro3) {
        
        if (nro1 <= nro2 && nro1 <= nro3) {
            System.out.println("O número " + nro1 + " é o menor!");
        } else {
            if (nro2 <= nro1 && nro2 <= nro3) {
                System.out.println("O número " + nro2 + " é o menor!");
            } else {
                //if (nro3 <= nro1 && nro3 <= nro2) {
                    System.out.println("O número " + nro3 + " é o menor!");
                //} 2a solução
            }
        }
    }
}