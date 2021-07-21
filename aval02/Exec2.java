/*
Faça
um programa que peça para n pessoas a sua idade,
no final o programa deve verificar se a média de idade da
turma varia entre 0 e 25 26 e 60 e maior que 60 e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média
calculada
*/





package aval02;

import java.util.Scanner;


public class Exec2 {


    public static void main(String[] args) {

        int totalPessoas=0;
        int idade;
        double media=0;
        double soma=0;
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite quantidade de  pessoas ");
        totalPessoas = scanner.nextInt();
        
        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite idade ");
        idade = scanner.nextInt();
        soma = soma + idade;
        }
        
        media= soma / totalPessoas;
        
          if (media>=0&& media<=25.0) {
            System.out.println(media +" turma jovem ");
        }      
               
          if (media>=26.0&& media<=60.0) {
            System.out.println(media + " turma adulta ");
        }      
          
              
          if (media>60.0) {
            System.out.println(media + " turma idosa ");
        }      
        
        
        
        
        
        
        
        
    }
    
}
