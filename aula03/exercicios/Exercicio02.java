package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, cont;
        cont=0;

        System.out.print("Gostaria da tabuada de que número? ");
        nro = entrada.nextInt();

        System.out.println("Tabuada do " + nro);
        while (cont < 11) {
            System.out.println(nro + " x " + cont + " = " + (nro * cont));
            cont++;
        }
        entrada.close();
    }
    
}