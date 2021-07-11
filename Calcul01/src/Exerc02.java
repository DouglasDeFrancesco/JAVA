
import java.util.Scanner;




public class Exerc02 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean infoValidas = false;
        String nomeUser;
        String senha;
        
        
        do{
            System.out.println("nome do utilizador: ");
            nomeUser = scan.next();
            
            System.out.println("senha? ");
            senha = scan.next();
            
            if(nomeUser.equalsIgnoreCase(senha)){
                
            System.out.println("senha igual ao nome de utulizador, digite novamente");
            }else{
                infoValidas = true;
                System.out.println("senha e nome de utilizador validos.");
                
            }while (!infoValidas);
     
                 
