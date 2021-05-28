package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n, qtt100, qtt50, qtt20, qtt10, qtt5, qtt2, qtt1, remainder;

        // INPUT
        n = entrada.nextInt();

        // PROCESSING        
        if (n > 0 && n < 1000000) {
            System.out.println(n);
            // 100
            if (n >= 100) {
                qtt100 = n / 100;
                System.out.printf("%d nota (s) de R$ 100,00\n", qtt100);
                remainder = n % 100;
                // 50
                if (remainder >= 50) {
                    qtt50 = remainder / 50;
                    System.out.printf("%d nota (s) de R$ 50,00\n", qtt50);
                    remainder = remainder % 50;
                    // 20
                    if (remainder >= 20) {
                       qtt20 = remainder / 20;
                       System.out.printf("%d nota (s) de R$ 20,00\n", qtt20); 
                       remainder = remainder % 20;
                       // 10
                       if (remainder >= 10) {
                           qtt10 = remainder / 10;
                           System.out.printf("%d nota (s) de R$ 10,00\n", qtt10);
                           remainder = remainder % 10;
                           // 5
                           if (remainder >= 5) {
                               qtt5 = remainder / 5;
                               System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
                               remainder = remainder % 5;
                               // 2
                               if (remainder >= 2) {
                                   qtt2 = remainder / 2;
                                   System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                   remainder = remainder % 2;
                                   if (remainder != 0) {
                                       qtt1 = 1;
                                       System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                   } else {
                                       qtt1 =0;
                                       System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                   }
                               // 2 ELSE  
                               } else {
                                   qtt2 = 0;
                                   System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                   qtt1 = 1;
                                   System.out.printf("%d nota (s) de R$ 1,00\n", qtt1); 
                               } // FIM
                           // 5 ELSE     
                           } else {
                               // 2
                               if (remainder >=2) {
                                   qtt5 = 0;
                                   System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
                                   qtt2 = remainder / 2;
                                   System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                   remainder = remainder % 2;
                                   if (remainder != 0) {
                                       qtt1 = 1;
                                       System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                   } else {
                                       qtt1 =0;
                                       System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                    }
                               // 2 ELSE     
                               } else {
                                   qtt2 = 0;
                                   System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                   qtt1 = 1;
                                   System.out.printf("%d nota (s) de R$ 1,00\n", qtt1); 
                               } // FIM
                           }
                        // 10 ELSE  
                        } else {
                           // 5
                           qtt10 = 0;
                           System.out.printf("%d nota (s) de R$ 10,00\n", qtt10);
                           if (remainder >= 5) {
                            qtt5 = remainder / 5;
                            System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
                            remainder = remainder % 5;
                            // 2
                            if (remainder >= 2) {
                                qtt2 = remainder / 2;
                                System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                remainder = remainder % 2;
                                if (remainder != 0) {
                                    qtt1 = 1;
                                    System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                } else {
                                    qtt1 =0;
                                    System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                }
                            // 2 ELSE  
                            } else {
                                qtt2 = 0;
                                System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                qtt1 = 1;
                                System.out.printf("%d nota (s) de R$ 1,00\n", qtt1); 
                            } // FIM
                        // 5 ELSE     
                        } else {
                            // 2
                            if (remainder >=2) {
                                qtt5 = 0;
                                System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
                                qtt2 = remainder / 2;
                                System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                remainder = remainder % 2;
                                if (remainder != 0) {
                                    qtt1 = 1;
                                    System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                } else {
                                    qtt1 =0;
                                    System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                                 }
                            // 2 ELSE     
                            } else {
                                qtt2 = 0;
                                System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                                qtt1 = 1;
                                System.out.printf("%d nota (s) de R$ 1,00\n", qtt1); 
                            } // FIM 
                    // 20   
                    } else {
                        if (remainder < 20 && remainder >= 10) {
                            

                        } else {
                            
                        }
                    }
                // 50    
                } else {
                    qtt50 = 0;
                    System.out.printf("%d nota (s) de R$ 50,00\n", qtt50);
                    if (remainder >= 5) {
                        qtt5 = remainder / 5;
                        System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
                        remainder = remainder % 5;
                        if (remainder >= 2) {
                            qtt2 = remainder / 2;
                            System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                            remainder = remainder % 2;
                            if (remainder != 0) {
                                qtt1 = 1;
                                System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                            } else {
                                qtt1 =0;
                                System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                            } 
                        } else {
                            qtt2 = 0;
                            System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                            qtt1 = 1;
                            System.out.printf("%d nota (s) de R$ 1,00\n", qtt1); 
                        } 
                    } else {
                        if (remainder >=2) {
                            qtt5 = 0;
                            System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
                            qtt2 = remainder / 2;
                            System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                            remainder = remainder % 2;
                            if (remainder != 0) {
                                qtt1 = 1;
                                System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                            } else {
                                qtt1 =0;
                                System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);
                             }
                        } else {
                            qtt2 = 0;
                            System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
                            qtt1 = 1;
                            System.out.printf("%d nota (s) de R$ 1,00\n", qtt1); 
                        }
                }
            // 100    
            } else {
                // 50
                if (n >= 50) {
                    qtt100 = 0;
                    System.out.printf("%d nota (s) de R$ 100,00\n", qtt100);
                    qtt50 = n / 50;
                    System.out.printf("%d nota (s) de R$ 50,00\n", qtt50);
                    remainder = n % 50;

                // 50    
                } else {

                }
            }
        } else {
            System.out.println("Número fora do range permitido."); 
        }
        
        // OUTPUT
        
        
         
        System.out.printf("%d nota (s) de R$ 20,00\n", qtt20);
        System.out.printf("%d nota (s) de R$ 10,00\n", qtt10);
        System.out.printf("%d nota (s) de R$ 5,00\n", qtt5);
        System.out.printf("%d nota (s) de R$ 2,00\n", qtt2);
        System.out.printf("%d nota (s) de R$ 1,00\n", qtt1);

        entrada.close();
    }
}
