package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        try {
            //numero = input.nextInt();
            numero = Integer.parseInt(input.nextLine());
            System.out.println("Você digitou " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida.");
        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
            System.out.println("Msg: " + e.getMessage());
        } catch (Exception e) { // A mensage de erro genérica deve sempre estar por último!
            System.out.println("Erro: " + e.getMessage());
        } finally {
            input.close();
            System.out.println("Conexão exncerrada...");
        }
        System.out.println("Final...");
    }
}