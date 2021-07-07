
package aula05;


public class Exerc15 {

    public static void main(String[] args) {
           //declarar variaveis
           int num1;
           int num2;
           
           

        //declarar a classe do scanner
        Scanner entradas = new Scanner(System.in);

        
        //pedir e ler dados de entrada-->  num1 e num2
        
        System.out.println("numero 1?");
        num1 = entradas.nextInt();
        
        System.out.println("numero 2?");
        num2 = entradas.nextInt();
       
        
        /* se numero 1> numero 2
        imprimir mensagem (o maior é o numero 1;
        senão 
        imprime mensagem ( o maior é o numero 2;
        
        //num1 --2
        num2 --3
        2>3? -- F -- salta para o else
               
        //num1--5
        //num2 -- 3
        //5>3 -- entra no if
        
        */
       if(num1 > num2){
           
           System.out.println("o maior é o numero 1: " + num1);
           
       }else
            System.out.println("o maior  é o mnumero 2: " + num2);
        
        
        System.out.println("");
                
        
        
        
    }
    
}
