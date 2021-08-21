
package acading;


public abstract class Pessoa {
    
    private String nome;
    private int NIF;

    public Pessoa() {
    }
    
    

    public Pessoa(String nome, int NIF) {
        this.nome = nome;
        this.NIF = NIF;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }
    
    
    
    
    
}
