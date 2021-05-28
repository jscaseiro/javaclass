package exercicios;

import java.util.Scanner;

public class Exercicio06 {
        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            double a, b, c;

            // INPUT
            System.out.print("Digite os três comprimentos de lados de um triangulo: ");
            a = entrada.nextDouble();
            b = entrada.nextDouble();
            c = entrada.nextDouble();

            // PROCESSING
            if ( (a > (b + c)) && (b > (a + c)) && (c > (b + a)) ) {
                System.out.println("Esses valores não compõe um triangulo!");
            } else {
                if (a  == b && b == c && c == a) { 
                    System.out.println("Esse triangulo é equilátero!");
                } else {
                    if (a  == b || b == c || c == a) { 
                        System.out.println("Esse triangulo é isósceles!");
                    } else { 
                        System.out.printf("Esse triangulo é escaleno!");
                    }
            }

            entrada.close();
        }
    }
}