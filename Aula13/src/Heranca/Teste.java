
package Heranca;



public class Teste {
    
    public static void main(String[] args) {
        
        //declarar e instanciar a classe aluno
        
        Aluno aluno = new Aluno();
       
        aluno.setNome("Douglas");
        aluno.setEndereco("Braga");
        aluno.getNome();
        aluno.setTelemovel ("919815105");
        aluno.getTelefone();
        
        Professor professor = new  Professor();
        
        professor.setNome("Ricardo");
        professor.setEndereco("Lisboa");
        professor.getNome();
        professor.setTelefone("919820564");
        professor.getTelefone();
        
        
        Pessoa pessoa = new Pessoa();
        
        
    }


    
}
