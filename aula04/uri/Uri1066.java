package uri;

import java.io.IOException;
import java.util.Scanner;

/**
 * Uri1066 - Even, Odd, Positive and Negative
 */
public class Uri1066 {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int value, evenCount = 0, oddCount = 0, posCount = 0, negCount = 0;

        for (int i = 0; i < 5; i++) {
            value = input.nextInt();
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (value > 0) {
                posCount++;
            } else {
                if (value < 0) {
                    negCount++;
                }
            }
        }
        System.out.println(evenCount + " valor(es) par(es)");
        System.out.println(oddCount + " valor(es) impar(es)");
        System.out.println(posCount + " valor(es) positivo(s)");
        System.out.println(negCount + " valor(es) negativo(s)");
        input.close();
    }
}