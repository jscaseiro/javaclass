package exemplo;

/**
 * Exemplo01
 */
public class Exemplo02 {

    public static void main(String[] args) {
        int cont, soma;

        soma = 0; //Marcação do ponto de debug: breakpoint => colocar oo mouse em cima do número da linha e clicar em Debug
        cont = 0;
        while (cont < 5) {
            System.out.print(cont + " + ");
            soma = soma + cont;
            cont++;
        }
        System.out.println(" = " + soma);
    }
}