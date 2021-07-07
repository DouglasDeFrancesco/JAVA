
package aula02;

import java.util.Scanner;


public class Aula02 {
              
            


    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        
        //declaracao das variaveis
        String nome = "Douglas";
        int idade = 60;
        
        
        String nomeAnimalEstimacao= "Juju";
        System.out.println("idade: " + idade);
        System.out.println("O meu nome é: " + nome);
        System.out.println("O nome do animal é: " + nomeAnimalEstimacao);
        
        int num1 = 2;
        int num2 = 5;
        int soma = 0;
        int n1 = 5;
        int n2 = 6;
        int n3 = 7;
        int n4 = 8;
        int diferenca;
        int multiplicacao;
        double divisao;
        double media;   
                
                
        Scanner entrada = new Scanner (System.in);
        
        soma = num1 + num2;
        diferenca = num2 - num1;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        media = (n1 + n2 + n3 + n4)/4;

        
        
        System.out.println(soma);
        
        System.out.println();
        
        System.out.println("a soma e: " +soma);
        
        System.out.println();
        
        System.out.println("A soma de "+num1+ "  " +num2 + " é: " +soma);
        System.out.println("");
        
        
        
        System.out.println("Introduza numero 1");
        n1 = entrada.nextInt();
        
        System.out.println("Introduza numero 2");
        n2 = entrada.nextInt();
        
        System.out.println("Introduza numero 3");
        n3 = entrada.nextInt();
        
        System.out.println("Introduza numero 4");
        n4 = entrada.nextInt();

        soma = n1 + n2;
        diferenca = n2 - n1;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("Qual a diferenca" +diferenca);
        
        System.out.println("Qual o resultado da multiplicacao" +multiplicacao);
        

         
        
        
        
        

        


        
        
                
        
                    
                
     //declarcao de operacao
                
                
        
        
        
                
        
        
        
        
        
        
        



    }
    
}
