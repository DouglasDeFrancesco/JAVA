


import java.util.Scanner;


public class Calcul01 {


    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite a operacao");
        String operacao = entrada.next();
        
        
        System.out.println("insira o numero1");
        num1 = entrada.nextInt();
        
        System.out.println("insira o numero2");
        num2 = entrada.nextInt();

        double resultado = 0;
        
        
   

        switch(operacao){
            
            case "+": resultado = num1 + num2;
            System.out.println("resultado "+resultado);
            break;
            
            case "-": resultado = num1 - num2;
            System.out.println("resultado "+resultado);
            break;
            
            case "/" : resultado = num1/num2;
            System.out.println("resultado "+resultado);
            break;
            
            case"*": resultado = num1 * num2; 
            System.out.println("resultado "+resultado);
            break;
            
            default:
                System.out.println("operacao invalida");
            
            
        }        
        
    }
    
}
