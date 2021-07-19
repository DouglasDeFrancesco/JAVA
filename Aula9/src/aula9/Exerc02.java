
package aula9;


import java.util.Scanner;


public class Exerc02 {


    public static void main(String[] args) {
        
        //pedir dados
        Scanner entrada = new Scanner(System.in);
        
        //criar isntancia
        
        Aluno aluno = new Aluno();
        
        System.out.println("O nome do aluno");
        aluno.nome = entrada.next();
        
        
        System.out.println("Nome do curso");
        aluno.curso = entrada.next();
        
        System.out.println("matricula");
        aluno.matricula =  entrada.next();
        
        // pedir as disciplinas
        
        for(int i=0; i<aluno.nomeDisciplinas.length; i++){
        
        System.out.println("nome da disciplinas");
         aluno.nomeDisciplinas[i] = entrada.next();
        }    
       
            
       
        //pedir notas das disciplinas
        
        for(int i=0; i<aluno.notasDisciplinas.length;i++){
            
        System.out.println("inserir notas da didsciplina "
        + aluno.notasDisciplinas[i]);
        
 
        
        
        for (int j=0; j<aluno.notasDisciplinas.length;j++){
            
        System.out.println("insira a nota " + (j+i));
        aluno.notasDisciplinas[i][j] = entrada.nextDouble();
         
        }
        
        }
        
        aluno.mostrarInfo();
        
        
  }
    
}
