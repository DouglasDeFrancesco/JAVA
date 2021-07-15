/*
10. B[i]= A[i]%2


*/
package aula7;

import java.util.Scanner;


public class Exerc10 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        //pedir dados
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println(" o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = vetorA[i] % 2;
        }
 // mostrar valores do vetor A
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        // mostrar dados do vetor B
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
    
}
 