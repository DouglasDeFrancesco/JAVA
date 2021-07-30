
package aula14;


public abstract class Empregado  {

private String nome;
private int idade;
private double salario;
//declarar da constante PLUS
public final double Plus = 300; 

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
//mostra dados
    
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", idade=" + idade + 
        ", salario=" + salario + ", Plus=" + Plus + '}';
    }

        
    
//vamos declarar um metodo abstrato
    public abstract boolean plus();
    
    
    
    


    
}
