
package Polimorfismo;

import interfaces.Crianca;

/**
 *
 * @author Douglas Graça
 */
public class Teste {

    public static void main(String[] args) {

        //criar instancia do tipo mulher
        Mulher m1 = new Mulher();
        Pessoa.falar(m1);

        //criar uma instancia do tipo homem
        Homem h1 = new Homem();
        Pessoa.falar(h1);
        
        Crianca c1 = new Crianca();
        
        Pessoa.falar(c1);
     
      
    }
    
}
