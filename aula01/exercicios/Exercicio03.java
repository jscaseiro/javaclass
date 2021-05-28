package exercicios;

import java.util.Scanner;

public class Exercicio03 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double salario, aumento;
       aumento = 0.25;

       /* ENTRADA */
       System.out.println("Você recebeu um mérito pela suas entregas!");
       System.out.print("Digite o seu salário atual: ");
       salario = entrada.nextDouble();

       /*PROCESSAMENTO*/
       salario = salario * (1 + aumento);

       /* SAIDA */
       System.out.println("Parabéns pelo Mérito!");
       System.out.println("Seu novo salário será: " + salario);
       
       entrada.close();
   } 
}
