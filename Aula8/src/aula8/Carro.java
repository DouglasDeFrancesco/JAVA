/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author Pc
 */
public class Carro {
    
    String marca;
    String  modelo;
    int numPassageiros;
    double capCombustivel;
    double cunCombustivel;
    
    void mostrarAutonomia(){
    System.out.println("autonomia do carro: "+ capCombustivel * cunCombustivel + "Km");
    }
    
    double obterAutonomia(){
    return(capCombustivel * cunCombustivel);
    
    
}
    
    
}
