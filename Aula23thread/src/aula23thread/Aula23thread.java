/* Douglas Graça */
package aula23thread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Aula23thread {


    public static void main(String[] args) {

            //thread.start();
            
            //colocar a thread para dormir um bocadinho
           
           
            
            
            //varias threads---->multithreading
            //declarar e isntanciar mais threads
            
            
            
        MinhaThread thread = new MinhaThread("thread #1",600);
        MinhaThread thread2 = new MinhaThread("thread #2",900);
        MinhaThread thread3 = new MinhaThread("thread #3",900);
            
            
            
       
        
    }
    
}
