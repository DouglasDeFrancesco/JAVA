
package aula9;


public class Lampada {
 
    
    double preco;
    int potencia;
    String marca;
    String cor;
    String modelo;
    
    boolean ligada;
    
    //metodo de ligar lampada.
    
    void ligar(){
    
    ligada = true; // lampada acesa.
    }
    
    //medtdo para desligar a lampada
    
    void desligar(){
    
    ligada = false;
    
}
    void mostrarEstado(){
        
        
        
        if(ligada){
            
            System.out.println("a lampada esta ligada");
            
        }else{
            System.out.println("a lampada esta desligada");
    }
        
        
        
    }
    
//metodo para mudar o estado da lampada

    void mudarEstado(){
    if(ligada){
    desligar();

}else{
      ligar();
    }
   
} 



}

