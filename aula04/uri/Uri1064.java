package uri;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * Uri1064 - Positives and Average
 */

public class Uri1064 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        float value, posSum = 0;
        int count = 0;

        for (int i = 0; i < 6; i++) {
            
            value = input.nextFloat();
            if (value > 0) {
                count++;
                posSum += value;
            }
            
        }
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", (posSum / count));

        input.close();
    }
 
}