/*7
C[i]= A[i]-B[I]

*/


package aula7;

import java.util.Scanner;


public class Exerc7 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int vetorA[i] = new int[10];
        int vetorB[i] = new int [vetorA.length];
        int vetorC[i] = new int [vetorA.length];
        
     for(int i=0, i<vetortA.length; i++);{
        System.out.print("valor do vetor na posicao: "+i);
        vetorA[i] = scan.nextInt()
    }
        System.out.println();
     
     for(int i=0,i<vetorB.length; i++);{
        System.out.print("valor do vetor na posicao: "+i);
        vetorB[i] = scan.nextInt();
    }
    System.out.println();
        
    for(int i=0; i<vetorC.length; i++){
         System.out.println("valor do vetor"); 
     
     }
        System.out.print();
        
    for(int i=0; vetorC.length; i++);{
       vetorC[i] = vetorA[i] - vetorB[i];
    }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

    }
    
}
        
        