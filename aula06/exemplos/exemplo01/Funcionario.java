package exemplos.exemplo01;

public class Funcionario {
    // protected String nome; <- Exemplo para a declaração direta na classe filha.
    private String nome;
    private double salario;

    public Funcionario(String nome) { //construtor
        this.nome = nome;
        this.salario = 0;
    }

    //Overload - polimorfismo
    public Funcionario(String nome, double salario) { // construtor
        this.nome = nome;
        this.salario = salario;
    }

    public String imprimir() {
        return nome + " : " + salario;
    }

    public void aumentarSalario(double perc){
        salario = salario + salario * perc;
    }

    @Override
    public String toString() {
        return nome + " : " + salario;
    }
    
}
