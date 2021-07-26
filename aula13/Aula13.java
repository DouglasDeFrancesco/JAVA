
package aula13;

import java.util.Scanner;


public class Aula13 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("nome da agenda ?");
        String nome = scan.nextLine ();
        
        Agenda agenda = new Agenda(nome);
        
        //Agenda agenda = new Agenda();
        //agenda.setNome(nome);
        
        
        Contato[] contatos = new Contato[3];
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("inserir as informacoes " + (i+1));
            
            
            //fazer teste com a declaração
            Contato c = new Contato();
            
            System.out.println("nome ? ");
            nome = scan.nextLine();
            c.setNome(nome);
            
            
            System.out.println("telefone ?");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("email ?");
            String email = scan.nextLine();
            c.setEmail(email);
            
            //atribuir
            
            contatos[i]= c;
            
            
            
            
      
            
            
            
           
        }
       // adicionar os contatos a agenda 
       agenda.setContatos(contatos);
       
       if(agenda !=null){
           System.out.println(agenda.obterInfo());
           
           
       }
        
        
       
        
        
           
        
        
        
        
    }
    
}
