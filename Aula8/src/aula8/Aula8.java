
package aula8;


public class Aula8 {


    public static void main(String[] args) {

        Carro carrinha = new Carro();
        
        carrinha.marca = "Fiat;";
        carrinha.modelo = "127";
        carrinha.numPassageiros = 5;
        carrinha.capCombustivel = 45;
        carrinha.cunCombustivel = 9.0;
        
        
        
        System.out.println(" Marca " + carrinha.marca);
        System.out.println(carrinha.modelo);
        System.out.println(carrinha.numPassageiros);
        System.out.println(carrinha.capCombustivel);
        System.out.println(carrinha.cunCombustivel);
        
        
        //criar segundo tipo  carro
        
        Carro c = new Carro();
        
        c.marca = "Audi";
        c.modelo = "a pilha ";
        c.numPassageiros = 5;
        c.capCombustivel = 45;
        c.cunCombustivel = 9;
        
        System.out.println(c.marca);
        System.out.println(c.modelo);
        
        
        c.mostrarAutonomia();
        System.out.println();
        
        
        double autonomia = c.obterAutonomia();
        System.out.println("autonomia " +autonomia);
        
        
                
        
        
        
        
        
        
    }
    
}
