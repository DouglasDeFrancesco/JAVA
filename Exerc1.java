/*1
Criar um vetor A com 5 elementos inteiros.
Construir um vetor B do mesmo tipo e tamanho e com os "mesmos" elementos
do vetor A, ou seja,
B[i] = A[i].
*/


package aula7;

import java.util.Scanner;


public class Exerc1 {


    public static void main(String[] args) {

        
        //criar um vetor A com 5 elementos inteiros
        int[] vetorA = new int[5];
        
        //construir um vetor B do mesmo tipo e tamanho
        
        //
        
        Scanner entrada = new Scanner(System.in);
        
        int[] vetorB = new int[vetorA.length];
        
        
        for(int i=0; i< vetorA.length; i++){
            System.out.println("numero ? ");
            
            vetorA[i] = entrada.nextInt();
            
            
            vetorB[i] = vetorA[i];
            
            
        }
        
        
        System.out.println("vetor A e B: ");
        
        for(int i=0; i< vetorA.length; i++){// -> vetor[0] = 14
                                            // -> vetor [1] =23    
        //mostra os valores dos array
        
        System.out.println(vetorA[i]+ " ");
        
        
        System.out.println(vetorB[i]+ "  ");
        
        
        
        
        }
        System.out.println();
        
        }
        
                
    }
    
        
        
        
        
        
        
        
        
        
        
    
    

