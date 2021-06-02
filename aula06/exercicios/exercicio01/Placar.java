package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;
    
    public Placar () { // construtor "vazio"
        time1 = "Time da casa";
        time2 = "Visitante";
        // this("Time da casa","Visitante"); // chamada ao construtor da própria classe
    }

    public Placar (String time1, String time2) { // construtor Gols = 0
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = 0;
        this.golsTime2 = 0;
        // this(time1, time2, 0,0) --> Outra forma para declarar os parâmetros acima utilizando o outro construtor abaixo
    }

    public Placar (String time1, String time2, int golsTime1, int golsTime2) { // construtor Gols = 0
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public String getPlacar() {
        return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2 + ";)";
    }
}