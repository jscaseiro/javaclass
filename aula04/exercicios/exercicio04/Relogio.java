package exercicios.exercicio04;

/**
 * Relogio
 */
public class Relogio {

    private int hora, minuto, segundo; // por padrão as variáveis iniciam com "0"
    // Variáveis do tipo primitivo, por padrão são inicializadas com "0"

    // Para ser possível a interação, no método construtor, torná-lo publico:
    public Relogio(int hora, int minuto, int segundo) {
        // this.hora = hora; // this se refere ao atributo e sem é o parâmetro
        setHora(hora); // A troca é para colocar uma validação, conforme o ,étodo criado.
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Métodos de alteração, deve ser público:
    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        } /* else {
            hora = 0;
            System.out.println("Hora Inválida");
        } */
    }

    public int getHora() {
        return hora;
    }    

    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0 && novoMinuto < 60) {
            minuto = novoMinuto;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0 && novoSegundo < 24) {
            hora = novoSegundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public String horaAtual() {
        return hora + " : " + minuto + " : " + segundo;
    }

}