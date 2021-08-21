
package interfaces;

/**
 *
 * @author Douglas Graça
 */
public class Operacao implements Inter1, Inter2 {

    @Override
    public void multplicar() {
      
        System.out.println("a multiplicar");
        
    }

    @Override
    public void dividir() {
        System.out.println("a dividir");
        
    }

    @Override
    public void somar() {
        System.out.println("a somar");
    
    }

    @Override
    public void subtrair() {
        System.out.println("a subtrair");
    
    }
    
    
    
    
    
}
