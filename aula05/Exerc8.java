
package aula05;

import java.util.Scanner;


public class Exerc8 {


    public static void main(String[] args) {

        //declarar variaveis
        double p1;
        double p2;
        double p3;
        double maisbarato =0;
        
        
        
        
        //decalarar classe de scaner
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("digite preço do produto1: ");
        p1 = entrada.nextDouble();
        
        System.out.println("digite preço do produto2: ");
        p2 = entrada.nextDouble();
        
        System.out.println("digite preço do produto2: ");
        p3 = entrada.nextDouble();
        
        
        
               
        
        //pedir e ler valores
        
    if(p1<=p2 && p1<= p3){
        maisbarato = p1;
    }else if(p2<=p1 && p2<=p3){
            maisbarato = p2;
    }else{
        
    maisbarato = p3;
    
    
    
    }
            
     System.out.printf("O mais barato  e o produto com preco: %.2f",maisbarato);  
        
    }
    
}
