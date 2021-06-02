package exercicios.exercicio03.modelo;

// public abstract class Conta { - Restringir novos instanciamentos.
public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return numero + " : " + saldo; // Não vincular a impressão orientada ao console
    }

    public boolean setDeposit(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean setWithdraw(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}