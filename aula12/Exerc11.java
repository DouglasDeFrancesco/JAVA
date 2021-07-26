/*11.
Faça um programa que peça um número inteiro e determine se ele é ou não
um número primo. Um número primo é aquele que só é divisível por ele mesmo
e por 1.*/

/*Os números primos são os números naturais que podem ser divididos por apenas dois fatores:
o número um e ele mesmo. Vamos conferir alguns exemplos: O número 5 tem apenas dois divisores:
o número um e ele mesmo
*/


package aula12;

import java.util.Scanner;


public class Exerc11 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("o numero ?");
        int num = scan.nextInt();
        boolean primo = true;
        
           
        
        System.out.println("nao primo divisivel por 1 - divisivel por ele mesmo: " + 1);
                
                for(int i=2; i< num; i++){
                
                    if(num % i==0){
                      primo = false; 
                    }
                    
                    
                    
                }
        
        if(primo){
            System.out.println("numero primo");
        }
        
        
        
    }
    
}
