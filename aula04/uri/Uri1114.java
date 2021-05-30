package uri;

import java.io.IOException;
import java.util.Scanner;

// Fixed Password

public class Uri1114 {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int passwd;
        boolean flag = true;

        while (flag == true) {
            passwd = input.nextInt();
            if (passwd == 2002) {
                flag = false;
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }
        input.close();
    }
}
