package exercicios;

import java.util.Scanner;

public class Exercicio02 {
   private static final String SUA_MÉDIA = "Sua média: ";

public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double nota1, nota2, media;

       /* ENTRADA */
       System.out.print("Digite a primeira nota: ");
       nota1 = entrada.nextDouble();
       System.out.print("Digite a segunda nota: ");
       nota2 = entrada.nextDouble();

       /*PROCESSAMENTO*/
       media = (nota1 + nota2) / 2;

       /* SAIDA */
       System.out.println("Nota da primeira prova: " + nota1);
       System.out.println("Nota da segunda prova: " + nota2);
       System.out.println(SUA_MÉDIA + media);
       
       entrada.close();
   } 
}
