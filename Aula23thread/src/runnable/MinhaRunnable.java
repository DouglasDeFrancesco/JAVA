
package runnable;

/**
 *
 * @author Douglas graça
 */
public class MinhaRunnable implements Runnable {
    
    private String nome;
    private int tempo;

    public MinhaRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

      
    
 
    @Override
    public void run() {
        
        
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
