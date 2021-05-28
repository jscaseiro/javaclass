package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        System.out.println("2 + 3");
        System.out.println(2 + 3);
        System.out.println("2 + 3 = " + 2 + 3); // O interpretador assume tudo com o primeiro termo.
        System.out.println("2 + 3 = " + (2 + 3)); // Solução para separar corretamente o interpretador.
    }    
}
