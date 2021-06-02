package exercicios.exercicio03;

import java.util.Scanner;

import exercicios.exercicio03.modelo.Conta;
import exercicios.exercicio03.util.GerenciaContas;

public class AppConta {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int menu, numeroConta;
        double valor, limite;

        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("\033[H\033[2J"); //Limpa tela
            System.out.println();
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Saque");
            System.out.println("5-Depósito");
            System.out.println("6-Saldo");
            System.out.println("7-Sair");
            System.out.println();
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Informe o número da conta: ");
                    numeroConta = input.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.print("Informe o número da conta: ");
                    numeroConta = input.nextInt();
                    System.out.print("Informe o limite: ");
                    limite = input.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.print("Informe o número da conta: ");
                    numeroConta = input.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.print("Informe o número da conta: ");
                    numeroConta = input.nextInt();
                    System.out.print("Qual o valor do saque? ");
                    valor = input.nextDouble();
                    if (contas.setWithdraw(numeroConta, valor)) {
                        System.out.println("Saque realizado");
                    } else {
                        System.out.println("Falha na operação!");
                    }
                    break;

                case 5:
                    System.out.print("Informe o número da conta: ");
                    numeroConta = input.nextInt();
                    System.out.print("Qual valor do depósito? ");
                    valor = input.nextDouble();
                    if (contas.setDeposit(numeroConta, valor)) {
                        System.out.println("Depósito realizado");
                    } else {
                        System.out.println("Falha na operação!");
                    }
                    break;

                case 6:
                    System.out.print("Informe o número da conta: ");
                    numeroConta = input.nextInt();
                    Conta conta = contas.getConta(numeroConta); // Retornar uma refência do objeto
                    if (conta != null) {
                        System.out.println(conta);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 7:
                    break;

                default: // caso contrário
                    System.out.println("Opção Inválida!");    
            }
            System.out.println("Tecle ENTER para continuar...");
            input.nextLine();
            input.nextLine();

        } while (menu != 7);

        input.close();
    }
}
