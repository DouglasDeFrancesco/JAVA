
package Heranca;


public class Aluno extends Pessoa {
    

    
    
    private String aluno;
    private double[] notas;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
    public double calcularMedia(){
        
        return 0;
        
    }

//return true/ false --> porque declarei
    
    public boolean verificarAprovado(){
        
        return true;
        
    }
    
}
