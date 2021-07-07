
package aula02;

import java.util.Scanner;


public class Exerc05 {


    public static void main(String[] args) {

        double metro;
        double cm;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Insira O valor em Metros: ");
        
        metro = scan.nextDouble();
        
        cm = 100*metro;
        
        
        
        

        System.out.println("cm");
        System.out.println();
        
        System.out.println(metro + " metros " + " corresponde a " + cm);




    }
    
}
