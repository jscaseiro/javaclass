package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Narnia", "C.S.L.", 300);

        livro1.getCapa();
        livro1.avancarPagina();
        System.out.println("Página atual: " + livro1.getPagina());
        livro1.retrocederPagina();
        livro1.retrocederPagina();
        livro1.retrocederPagina();
        System.out.println("Página atual: " + livro1.getPagina());
        livro1.irParaPagina(150);
        System.out.println("Página atual: " + livro1.getPagina());
    }
}
