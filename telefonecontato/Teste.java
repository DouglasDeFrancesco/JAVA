
package telefonecontato;

import java.util.Scanner;


public class Teste {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int opcao;
        boolean sair = false;
        
        
        
        //criar o menu
        
        while(!sair){
            System.out.println("1 - Inserir Contatos ");
            System.out.println("2 - Listar contatos ");
            System.out.println("3 - Procurar Contatos ");
            System.out.println("4 - Existe Contato");
            System.out.println("5 - Eliminar Contato");
            System.out.println("6 - Espaço Disponível");
            
            //alterar contato
            System.out.println("7-Sair");
            
            try{
                
                System.out.println("escolha uma das opçôes");
                opcao = scan.nextInt();
                
                switch(opcao){
                    
                    case 1:
                    break;
                    
                    case 2:
                    break;
                    
                    case 3:
                    
                    case 4:
                    break;
                    
                    case 5:
                    break;
                    
                    case 6:
                    break;
                    
                    case 7:
                    sair = true;
                    break;
                    default: System.err.println("Insira numero entre 1 e 7");
                    
                    
                }
                
                        
            }catch (Exception e){
                
                System.out.println("Insira o numero");
                scan.nextInt();
                
                
            }
            
        }
        
        
        
    }
    
}
