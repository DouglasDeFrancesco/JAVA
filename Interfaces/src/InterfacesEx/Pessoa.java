
package InterfacesEx;

/**
 *
 * @author Douglas Graça
 */
public abstract class Pessoa implements Inter{
    
    @Override
    public abstract void comunicar();
    
    static void falar(Inter p){
      
        p.comunicar();
        
      
        
    }
    
    
    
    
}
