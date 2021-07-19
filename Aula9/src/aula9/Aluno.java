
package aula9;


public class Aluno {
    
   String nome;
   String matricula;
   String curso;
   String[] nomeDisciplinas = new String [3];// guarda o nome de tres disciplinas
   double[][] notasDisciplinas = new double [3][3]; // guarda as notas e disciplicas
   
    
    //metodo para mostrar a informacao dos dados
   
   void mostrarInfo(){
       
       System.out.println("nome: "+ nome);
       System.out.println("matricula: " + matricula);
       System.out.println("nome do curso: " + curso);
       
       for(int i=0; i<notasDisciplinas.length; i++){
           
           
       

       for(int j=0; j<notasDisciplinas.length; j++){
           
       System.out.println(notasDisciplinas [i][j] + " ");// imprimi as tres notas
        
       }    
           
       }
       
       System.out.println();   
       
   }
    
}
