package exemplos.exemplo02;

import java.security.Principal;

public class Escrita implements Printable, Principal { //Herança múltipla
    @Override
    public void print() {
        System.out.println("Hello");
    }
}
