package exercicios.exercicio03.modelo;

public class ContaCorrente extends Conta{
    private final double DEPOSIT_FEE = 0.1;
    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public boolean setWithdraw(double valor) {
        if (getSaldo() >= valor) {
            return super.setWithdraw(valor); // Informar que é da SuperClass
        }
        return false; // sem saldo suficiente
    }

    @Override
    public boolean setDeposit(double valor) {
        return super.setDeposit(valor - DEPOSIT_FEE); // Taxa de depósito
    }
}