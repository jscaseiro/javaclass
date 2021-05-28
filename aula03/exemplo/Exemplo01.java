package exemplo;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int cont;

        cont = 1; // Inicialização = início
        while (cont < 11) { // condição, eqnato for verdadeiro repete
            System.out.println(cont);
            // cont--; 
            // passo
            cont++;
        }
        System.out.println("Fim: " + cont);
    }
}