package exemplos.exemplo01;

public class Gerente extends Funcionario{
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        // this.nome -> Para acessar a variável diretamente, deve se usar a declaração do tipo: "protected" na Super Class.
        super(nome, salario); // chamada ao construtor da superclass = 'FUNCIONARIO'
        this.nFuncionarios = nFuncionarios;
    }

    @Override // Convenção para informar o polimorfismo de override
    public String imprimir() {
        return super.imprimir() + " : " + nFuncionarios;
    }

    @Override
    public void aumentarSalario(double perc) {
        super.aumentarSalario(perc + 0.2);
    }

    @Override
    public String toString() {
        return super.toString() + " : " + nFuncionarios;
    }
    
}
