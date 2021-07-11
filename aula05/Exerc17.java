/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Exerc17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int ano;
		Scanner input = new Scanner(System.in);
                
                
                
                System.out.println("digite ano ");
		ano = input.nextInt();
		
		if(ano % 4 == 0){
			System.out.println(ano + " é um ano Bissexto!");
		}
		else{
			System.out.println(ano + " não é um ano Bissexto!");
		}
    }
    
}
