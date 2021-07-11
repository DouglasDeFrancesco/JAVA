package aula01;

import java.util.Scanner;


public class Aula01 {

    public static void main(String[] args) {
       
        String nome;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("digite o nome");
        nome = entrada.next();
        System.out.println("nome "+nome);
    }
    
}
