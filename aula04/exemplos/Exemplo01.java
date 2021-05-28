package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {        
        linha();
        System.out.println("Aplicação v0.1");
        linha(); // chamada do método
        System.out.println("Menu");
        linha2(4);
        int tam = 10;
        linha2(tam);
        linha3(10, '*');
        linha3(20, '#');
    }

    // Estrutura do método - Método "void" não tem retorno.
    static void linha() {
        System.out.println("--------------");
    }

    static void linha2(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int size, char symbol) {
        for (int i = 1; i <= size; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}