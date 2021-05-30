package exercicios.exercicio05;

public class Ebook {
    // atributos
    private String titulo, autor;
    private int totalPaginas, paginaAtual;
    
    // Primeiro passo é definir o construtor
    public Ebook(String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        paginaAtual = 0;
    }

    // segundo passo criar estruturas de métodos necessários;
    // terceiro passo é definir as restrições básicas dos métodos;
    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }        
    }

    public void irParaPagina(int pagina) {
        if (pagina >=0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public int getPagina() {
        return paginaAtual;
    }

    public void getCapa() {
        System.out.printf("Livro: %s - %s (%d)\n", titulo, autor, totalPaginas);        
    }
    
}
