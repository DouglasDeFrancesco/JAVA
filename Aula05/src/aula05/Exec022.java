
package aula05;

import java.util.Scanner;


public class Exec022 {


    public static void main(String[] args) {

        int numero;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira numero");
        
        numero = entrada.nextInt();
        
        if(numero%2 ==0)
            System.out.println("par");
        else System.out.println("impar");
        
        
        
    }
    
}
