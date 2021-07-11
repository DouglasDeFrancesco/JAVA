
package aula05;

import java.util.Scanner;



public class Exerc3 {


    public static void main(String[] args) {
        
        String letra;
        
          
        
        Scanner entrada =  new Scanner(System.in);
        
        System.out.println("Insira uma letra (f - M))") ;
        
        letra = entrada.next();
        
        if(letra.equalsIgnoreCase("f")) {
            
            System.out.println("f - feminino");
        
        }else if(letra.equalsIgnoreCase("m")){
            
            System.out.println("m - masculino");
            
        }else
            System.out.println("genero invalido");
        
        
        
    }
    
}
