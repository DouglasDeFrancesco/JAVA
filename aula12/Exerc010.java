/*10.
Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/


package aula12;

import java.util.Scanner;


public class Exerc010 {


    public static void main(String[] args) {
        int num;
        int pares = 0;
        int impares = 0;
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite o numero");
        
         for(int i=0; i<10; i++);
        
        num = scan.nextInt();
        
        if(num % 2==0){
            pares++;
            
        }else 
            impares++;
        
        System.out.println("pares:" + pares);
        
        
        System.out.println("impares " + impares);
        
        
        
        
        
        
    }
    
}
