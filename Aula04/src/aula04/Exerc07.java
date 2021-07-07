package aula04;




import java.util.Scanner;


public class Exerc07 {


    public static void main(String[] args) {

        double area;
        double lado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("lado ? ");
        lado = entrada.nextDouble();
        
        area = Math.pow(lado, 2);
        double dobroArea = 2*area;
        
        System.out.println("area: " + area);
        System.out.println();
        System.out.println("o dobro da area e:" + dobroArea);





    }
    
}
