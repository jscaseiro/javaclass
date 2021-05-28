package exemplos.exemplo04;

// Modelo
public class Pessoa {
    // atributos
    String nome;
    int telefone;

    // métodos
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    int obterTelefone() {
        return telefone;
    }

}
