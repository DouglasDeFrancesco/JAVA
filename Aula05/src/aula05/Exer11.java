
package aula05;

import java.util.Scanner;


public class Exer11 {


    public static void main(String[] args) {
        
        String semana;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("insira o dia da semana");
        
                    
                
        
        semana = entrada.next();
        
        
        switch (semana) {

        
    case "1": System.out.println("domingo");
    break;
        
        
                
    case "2": System.out.println("segunda-feira");
    break;
                
    case "3": System.out.println("terca-feira");
    break;
                
    case "4": System.out.println("quarta-feira");
    break;
                
    case "5": System.out.println("quinta-feira");
    break;
                
    case"6": System.out.println("sexta-feira");
    break;
                
    case"7": System.out.println("sabado");
    break;
                
                default: System.out.println("invalido");
                
                
    
                
        
        
        
        
        
        
        
    }
    
    }
    
}
