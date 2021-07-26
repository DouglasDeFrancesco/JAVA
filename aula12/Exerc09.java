
package aula12;

import java.util.Scanner;


public class Exerc09 {


    public static void main(String[] args) {

        int base ;
        int pot;
        
        
 
        
        Scanner   scan = new Scanner(System.in);
        
        System.out.println("insira o numero");
        base = scan.nextInt();
        
        
        System.out.println("insira a potencia");
        
        pot = scan.nextInt();
        
        int resultado = base;
        
        for(int i=1; i<pot; i++){
            
         resultado *= base;
            
            System.out.println(" resultado: " + resultado);
        }
        
        
        
                
        
        
    }
    
}
