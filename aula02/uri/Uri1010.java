package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // int prodCode1, prodQtt1, prodCode2, prodQtt2;
        int prodQtt1, prodQtt2;
        float prodPrice1, prodPrice2, total;

        // INPUT
        // prodCode1 = entrada.nextInt();
        entrada.nextInt();
        prodQtt1 = entrada.nextInt();
        prodPrice1 = entrada.nextFloat();
        // prodCode2 = entrada.nextInt();
        entrada.nextInt();
        prodQtt2 = entrada.nextInt();
        prodPrice2 = entrada.nextFloat();

        // PROCESSING
        total = ((prodPrice1 * prodQtt1) + (prodPrice2 * prodQtt2));

        // OUTPUT        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        entrada.close();
    }
}
