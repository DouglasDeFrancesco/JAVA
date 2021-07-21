/*
3
O índice de massa corporal (IMC) é uma medida internacional usada para verificar se uma pessoa está no peso
ideal.
O autor do método é Lambert
Quételet que no fim do século XIX apresentou uma fórmula fácil e rápida para
avaliar o nível de gordura de cada pessoa, ou seja, é um indicador internacional de obesidade adotado pela
Organização Mundial da Saúde (OMS).
O IMC é determinado fazendo a divisão da massa do indivíduo pelo quadrado de sua altura, em que a massa
está em quilogramas e a altura em metros. A fórmula é a seguinte:
// vamos calcular o IMC
double
imc = peso / (altura * altura);
Escreva um programa Java que
leia o peso e a altura de uma
pessoa e retorna oseu IMC classificado de acordo com a
tabela acima.

*/

package aval02;

import java.util.Scanner;


public class Exer1 {


    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o peso");
        peso = scanner.nextDouble();
        
        System.out.println("Digite a latura");
        altura = scanner.nextDouble();
        
        System.out.println("Digite a IMC");
        imc = scanner.nextDouble();
        
        
        if (imc <=18.5) {
            System.out.println("a baixo do peso");
        }
            
        if (imc>=18.6&& imc<=24.9) {
            System.out.println("peso ideal(Parabéns)");
        }
            
          if (imc>=25.0&& imc<=29.9) {
            System.out.println("levemente acima do peso");
        }      
          
         
        
          if (imc>=30.0&& imc<=34.9) {
            System.out.println("obesidade grau 1");
        }      
               
          if (imc>=35.0&& imc<=39.9) {
            System.out.println("obesidade grau 2(severa)");
        }      
          
              
          if (imc>=40) {
            System.out.println("obesidade grau 3 (mórbida)");
        }      
          
                
    
    

    
    }
}
