package exercicios.exercicio02;

public class AppCurso {
    
    public static void main(String[] args) {
        
        Pessoa person1 = new Pessoa("Fulano", "11 98232-4567");
        Professor person2 = new Professor("Emerson", "11 99887-0987" , 5000);
        Estudante person3 = new Estudante("John", "11 98765-5432", "Java");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
