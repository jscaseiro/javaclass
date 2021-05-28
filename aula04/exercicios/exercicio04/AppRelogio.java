package exercicios.exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio(15, 30, 25);

        // Aceita qualquer coisa pois é inteiro, para restringir, tornar os atributos privados na classe.
        // r.hora = -76;

        System.out.println(r.getHora());
        System.out.println(r.getMinuto());
        System.out.println(r.getSegundo());

        System.out.println("Hora atual: " + r.horaAtual());
    }
}
