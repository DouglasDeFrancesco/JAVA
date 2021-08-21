
package Ficheiros;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Douglas Graça
 */
public class Ficheiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //criar um ficheiro simples de texto
        
        
        
        //nome e caminho do ficheiro
        String nomeFicheiro = "C:\\lixo\\teste.txt";
        
        System.out.println(nomeFicheiro);
        
        //
        File fich = new File(nomeFicheiro);
        
        //criar um ficheiro
        
        try {
                    fich.createNewFile();

            
        } catch (IOException ex) {
            
            System.out.println("erro!!"+ fich.getPath());
            
            
        }
        
        
    }
    
}
