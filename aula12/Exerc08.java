
package aula12;

import java.util.Scanner;


public class Exerc08 {


    public static void main(String[] args) {

                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o numero pra tabuada ");
        int num;
        num  = scan.nextInt();
        
        System.out.println("tabuada de " + num + " + ");
        
        for(int i=0; i<=10; i++)
        
        System.out.println(num + "*" + i+ " = " + num * i);
        
        
        
        
        
    }
    
}
