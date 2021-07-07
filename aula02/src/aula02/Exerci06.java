
package aula02;

import java.awt.BorderLayout;
import java.util.Scanner;


public class Exerci06 {


    public static void main(String[] args) {
        
        double raio;
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println(" Digite o raio: ");
        raio = entrada.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        
        
        System.out.println("Mostra a area = " + area);
         
        System.out.printf("area = %.2f " , area);
        
         System.out.printf("area = %.3f " , area);
        
        
        
        
        
        
    }
    
}
