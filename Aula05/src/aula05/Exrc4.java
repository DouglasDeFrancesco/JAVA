
package aula05;

import java.util.Scanner;


public class Exrc4 {


    public static void main(String[] args) {
        
        
        String letra;
        
        Scanner entrada= new Scanner (System.in);
        
        
        System.out.println("insira letra: ");
        letra = entrada.next();
        
        if(letra.equalsIgnoreCase("a")|| 
           letra.equalsIgnoreCase("e")||             
           letra.equalsIgnoreCase("i")||
           letra.equalsIgnoreCase("o") ||
           letra.equalsIgnoreCase("u"))
                
            System.out.println("vogal");
        
        
        else
           System.out.println("consoante");

        
    }
    
}
