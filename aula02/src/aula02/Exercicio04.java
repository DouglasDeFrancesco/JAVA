
package aula02;

import java.util.Scanner;


public class Exercicio04 {


    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nota 1");
        nota1 = entrada.nextDouble();

        System.out.println("Digite nota 2");
        nota2 = entrada.nextDouble();

        System.out.println("Digite nota 3");
        nota3 = entrada.nextDouble();

        System.out.println("Digite nota 4");
        nota4 = entrada.nextDouble();
        
        
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("media" + media);
        
        
        
    
      
        
        
        
        
        
    }
    
}
