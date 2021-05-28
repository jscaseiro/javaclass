package exemplos.exemplo04;

public class AppPessoaconstrutor {
    
    public static void main(String[] args) {
        Pessoaconstrutor p = new Pessoaconstrutor("Persona", 12345678); //Objeto
        Pessoaconstrutor p2 = new Pessoaconstrutor("Carlos", 87654321); //Objeto

        System.out.println();
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