package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Up!", "VW", 12.5);
        Veiculo v1 = new Veiculo("Corsa", "Ford", 10.1);

        v.exibir();
        v1.exibir();

        // v.consumo = -12;
        // mantem a rastreabilidade.
        v.setConsumo(13);
        v1.setConsumo(13);

        System.out.println("Consumo " + v.getConsumo());
        System.out.println("Consumo " + v1.getConsumo());
    }

}
