/*1
. Vamos fazer um programa para fazer a gestão dos empregados . Estes têm como atributos: nome
idade salário.
Temos também uma constante chamada
plus que terá um valor de 300€.
Temos 2 tipos de empregados: distribuidor e comercial.
O comercial
além dos atributos anteriores tem mais um chamado comissão.
O distribuidor além
dos atributos anteriores tem mais um chamado zona ( string
Criar os construtores, modificadores/acesso, e
tostring (pensar como vamos aproveitar a
Não se
podem criar objetos do tipo empregado (classe mã e ), mas sim das classes filhas
As classes vão ter um método chamado
plus , com uma implementação diferente em cada classe.
Este
método basicamente vai aumentar o salario do empregado.
O comercial se tem mais de 30 anos e cobra uma comissão de mais de 200€ aplica
se o plus
O distribuidor se tem menos de 25 anos e distribui na zona 3 vai receber o
plus
Podemos fazer com que este método devolva um
boolean ou não devolva nada, fica ao vosso
critério.*/


package aula14;


public class Aula14 {


    public static void main(String[] args) {

        //verificar que não conseguimos criar e instanciar
        //declarar  e instanciar a classe  empregado
        
       // Empregado e = new Empregado
       
       Comercial c1 = new Comercial(100, "Douglas" , 27, 1000);
       Distribuidor d1 = new Distribuidor( "zona 1", "Isabela", 20, 900);
       
      c1.plus();
      d1.plus();
       
        System.out.println(c1);
        System.out.println(d1);
        
             
        
        
        

        
        
        
        
        
        
    }
    
}
