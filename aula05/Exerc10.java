
package aula05;

import java.util.Scanner;


public class Exerc10 {


    public static void main(String[] args) {

        double c;
        
        double f;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("insira o valor da temperatura em celsius");
        c = input.nextDouble();
        
        f = (c*1.8 + 32);
        
        System.out.println("");
        
        System.out.println("f: "+ f );


        
    }
    
}
