package exercicios.exercicio03;

public class Veiculo {
    // atributos
    private String modelo, marca;
    private double consumo;

    // métodos
    Veiculo(String model, String brand, double consumo){
        modelo = model;
        marca = brand;
        this.consumo = consumo; // this se refere ao atributo
    }

    public void exibir() {
        System.out.printf("Esse é o carro: %s - %s", marca, modelo);
    }
    // Convenção de nome para consulta
    public double getConsumo() {
        return consumo;
    }
    // Convenção de nome para alteração
    public void setConsumo(double novoConsumo) {
        if (novoConsumo > 0) {
             consumo = novoConsumo;        
        }

    }

}
