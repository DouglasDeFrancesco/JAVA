package aula23thread;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Douglas Graça
 */
public class MinhaThread extends Thread {
    
    private String nome;
    private int tempo;
    
    

    public MinhaThread(String nome, int tempo ) {
        
        
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    MinhaThread(String thread_2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void run(){
        
        try {
            
            
            for (int i = 0; i < 6; i++) {
            
            System.out.println(nome + " contador " +i);
            Thread.sleep(tempo);
            
            }
        } catch (Exception e) {
                   
               System.out.println(e);
        }
        
         System.out.println(nome + " ternimou a execução ");

    
         
         
         
         
         
         
     
       
    }
   
}
