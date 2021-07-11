
import java.util.Scanner;




public class Exec01 {


    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        
        boolean notaValida = false;
        
        double nota; 
        
        do{
            System.out.println("nota ?");
            nota = scan.nextDouble();
            
            
            double nota = scan.nextDouble();
            
            if(nota >=0 && nota <=10){
                notaValida = true;
                
                System.out.println("nota inserida: " + nota);
            }
            }else
                System.out.println("nota invalida, digite novamente.");
    }
            
        
        }while (!notaValida);
      
        
         
        
    }
    
}
