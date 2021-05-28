package bin;
import java.util.Scanner;
public class tbltest {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    System.out.print("Digite o número: ");
    n = input.nextInt();

    if (n % 2 == 0) {
        System.out.println("even");
    } else {
        System.out.println("odd");
    }
   } 
}
