
package Exerc2;


public class Aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNota(double[] notas) {
        this.notas = notas;
    }
    
    public String obterInfo(){
        
        String info = "nome do aluno: " + nome + ";";
        info+= " matricula: " + matricula +";";
        info += "notas: " ;
        
        double soma  = 0;
        
        for(double nota: notas){
            
            soma+=nota;
            
            info+= nota + " ";
            
        }
        
        double media = soma/4;
        
        info+="\n" + "media = " + media + "-";
        
        
        if(media >=10){
          
            info+= "aprovado !! ";
        }else{
            
        info+= "reprovado !"; 
    }
            
        return info;
    }
    
    public double obterMedia(){
        
        double soma= 0;
        
        for(double nota: notas){
            
            
            
            soma +=nota;
            
        }
        return soma/4;
        
        
    }
    
    
}
