/*4.
Criar um vetor A com 10 elementos inteiros. Construir um vetor B do mesmo
tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respetivo
elemento de A multiplicado pela sua posição (ou índice), ou seja:
B[i] = A[i] * i
*/





package aula7;

import java.util.Scanner;


public class Exerc4 {


    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
        
             //criar um vetor A com 5 elementos inteiros
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        
        //construir um vetor B do mesmo tipo e tamanho
        
        //
        
       
        
        int[] vetorB = new int[vetorA.length];
        
        int[] vetorA = new int[vetorB.length];
        
        
        for(int i=0; i< vetorA.length; i++){
            System.out.println("numero ? ");
            
            vetorA[i] = entrada.nextInt();
            vetorB[i] = entrada.nextInt();
            
           vetorB[i] = vetorA[i] * i;
            
            
            
        }
        
        
        System.out.println("vetor A e B: ");
        
        for(int i=0; i< vetorA.length; i++){// -> vetor[0] = 14
                                            // -> vetor [1] =23    
        //mostra os valores dos array
        
        System.out.println(vetorA[i]+ " ");
        
        }
        
          for(int i=0; i< vetorB.length; i++){// -> vetor[0] = 14
                                            // -> vetor [1] =23   
        
        System.out.println(vetorB[i]+ "  ");
        
        
        
        
        
        
    }
    }
}


