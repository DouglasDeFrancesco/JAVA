/*2
. Vamos fazer a gestão de alguns produtos. Os produtos têm os seguintes atributos: nome e preço;
Temos dois tipos de produtos:
Perecíveis
: tem um atributo chamado dias a caducar
Não
perecíveis : tem um atributo chamado tipo
Temos uma função chamada
calcular que dependendo da classe terá um comportamento diferente, vamos
passar um numero que é a quantidade de produtos:
Em
perecíveis: multiplica o preço pela quantidade de produtos passados;
Em
não perecíveis : além do que faz o produto
o preço diminuirá dependendo dos dias a caducar:
Se
falta 1 dia para caducar , reduz se 4 vezes do preço final
Se
falta 2 dias para caducar , reduz se 3 vezes do preço final
Se
falta 3 dias para caducar , reduz se para metade do preço final
Nos não perecíveis faz
se a mesma coisa que no produto .
Criar
uma classe de teste e criar um array de produtos , mostrar o preço total ao vender se 5 produtos de cada
um.
*/
package Exerc2;


public class Teste {


    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];
        
        
        
        
        produtos[0] = new Produto(10, "produto 1");
        produtos[1] = new Perecivel(1, 20, "Produto 2");
        produtos[2] = new NaoPerecivel("tipo 1", 5, "produto 3");

            double total  = 0;
                       
 for (int i = 0; i < produtos.length; i++) {
     total += produtos[i].calcular(5);
     
            
        }
        
        System.out.println("total é: " +total);   
        
    }
    
}
