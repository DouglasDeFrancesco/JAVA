/*2
Criar um vetor A com 8 elementos inteiros. Construir um vetor B do mesmo
tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja:
B
[i] = A[i] * 2
*/

package aula7;

import java.util.Scanner;


public class Exerc2 {


    public static void main(String[] args) {
 
            //criar um vetor A com 5 elementos inteiros
        int[] vetorA = new int[8];
        
        //construir um vetor B do mesmo tipo e tamanho
        
        //
        
        Scanner entrada = new Scanner(System.in);
        
        int[] vetorB = new int[vetorA.length];
        
        
        for(int i=0; i< vetorA.length; i++){
            System.out.println("numero ? ");
            
            vetorA[i] = entrada.nextInt();
            
            
            vetorB[i] = vetorA[i]*2;
            
            
        }
        
        
        System.out.println("vetor A e B: ");
        
        for(int i=0; i< vetorA.length; i++){// -> vetor[0] = 14
                                            // -> vetor [1] =23    
        //mostra os valores dos array
        
        System.out.println(vetorA[i]+ " ");
        vetorA[i] = entrada.nextInt();
        
        System.out.println(vetorB[i]+ "  ");
        vetorB[i] = entrada.nextInt();
        
        
    
        
        
    }
    
    }
}
