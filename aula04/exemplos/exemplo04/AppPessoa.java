package exemplos.exemplo04;

public class AppPessoa {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa(); //Objeto
        Pessoa p2 = new Pessoa(); //Objeto

        System.out.println();
        p.nome = "Persona";
        p.telefone = 12345678;
        p.apresentar();
        System.out.println("Meu telefone é " + p.obterTelefone());

        System.out.println();

        p2.nome = "Carlos";
        p2.telefone = 87654321; 
        p2.apresentar();
        System.out.println("Meu telefone é " + p2.obterTelefone());
        System.out.println();
    }
}