
package Exerc2;


public class Produto {
    
    private double preco;
    private String nome;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "preco = " + preco + ", nome=" + nome + '}';
    }
    
    public double calcular(int quantidade){
        return preco*quantidade;
        
        
    }

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }
    
    
    
}
