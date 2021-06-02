package exercicios.exercicio03.modelo;

public class ContaEspecial extends Conta{
    
    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean setWithdraw(double valor) {
        if ((getSaldo() + limite) >= valor ) {
            return super.setWithdraw(valor);
        }
        return false;
    }
}