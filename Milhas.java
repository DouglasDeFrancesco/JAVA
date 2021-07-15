/*
converter

formula da conversão: 1 milha = 1.609 Km.
*/



package aula7;

import java.util.Scanner;


public class Milhas {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int milhas;
        int Km;
        
        System.out.println("digite em mlhas: ");
        milhas = scan.nextInt();
        
        Km = milhas * 1609;
        
        
       

        Km = milhas * 1852;
        System.out.println(milhas +" milhas náuticas correspondem a " + Km + " km.");
        
        
        
        

        
        
        
        
        
    }
    
}
