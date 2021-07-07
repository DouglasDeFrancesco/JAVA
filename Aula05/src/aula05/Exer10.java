
package aula05;

import java.util.Scanner;


public class Exer10 {


    public static void main(String[] args) {

       String turno;
       
        Scanner entrada = new Scanner (System.in);
        
        
        //pedir  e ler
        
        System.out.println("insira o turno: ");
        turno = entrada.next();
        
        
        switch(turno){
        
        case "m":
        case "M" : System.out.println("bom dia !!!");
        break;
        
        case "t":
        case "T" : System.out.println("boa tarde !!!");
        break;
        
        case "n":
        case "N": System.out.println("boa noite !!!");
        break;
        
        default: System.out.println("valor invalido");
       
        
    }
        
      
        
        
    }
    
}
