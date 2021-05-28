package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, qtt;

        n = input.nextInt();
        System.out.println(n);
        if (n > 0 && n < 1000000) {
            qtt = n / 100;
            System.out.printf("%d nota(s) de R$ 100,00\n", qtt);
            n = n % 100;
            qtt = n / 50;
            System.out.printf("%d nota(s) de R$ 50,00\n", qtt);
            n = n % 50;
            qtt = n / 20;
            System.out.printf("%d nota(s) de R$ 20,00\n", qtt);
            n = n % 20;
            qtt = n / 10;
            System.out.printf("%d nota(s) de R$ 10,00\n", qtt);
            n = n % 10;
            qtt = n / 5;
            System.out.printf("%d nota(s) de R$ 5,00\n", qtt);
            n = n % 5;
            qtt = n / 2;
            System.out.printf("%d nota(s) de R$ 2,00\n", qtt);
            n = n % 2;
            qtt = n / 1;
            System.out.printf("%d nota(s) de R$ 1,00\n", qtt);
        }
        input.close();
    }
}
