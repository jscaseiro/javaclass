package exemplos.exemplo04;

// Modelo
public class Pessoaconstrutor {
    // atributos
    String nome;
    int telefone;

    // Método construtor - Tem o mesmo nome da classe - criado de forma padrão implicitamente
    Pessoaconstrutor(String n, int t){
        nome =n;
        telefone =t;
    }

    // métodos
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    int obterTelefone() {
        return telefone;
    }

}
