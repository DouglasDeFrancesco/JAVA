





package Exerc2;

import java.util.Scanner;


public class Teste {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("nome do curso ? ");
        String nome = scan.nextLine();
        
        System.out.println("horario do curso ? ");
        String horario = scan.nextLine();
        
        System.out.println("nome do professor? ");
        String prof = scan.nextLine();
        
        System.out.println("departamento do professor ?");
        String departamento = scan.nextLine();
        
        System.out.println("email do professor ? ");
        String email = scan.nextLine();
        
        
        
        
        //declarar a instacia a classe 
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setDepartamento(departamento);
        professor.setEmail(email);
        
        //atribuir ao professor o curso
        
        curso.setProfessor(professor);
        
        //falta as informações dos alunos
        
        System.out.println("------Alunos------");
        
        
        //declarar e isntanciar o array de alunos
        Aluno[] aluno = new Aluno[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("nome do aluno ?");
            String nomeAluno = scan.nextLine();
            
            System.out.println("matricula  ?");
            String matAluno = scan.nextLine();
            
            // declarar um array para guardar as notas dos alunos
            double[] notas = new double[4]; 
            for (int j = 0; j < 4; j++) {
                
                System.out.println("nota: " + (j+1));
                notas[j] = scan.nextDouble();
                
            }
            
            Aluno aluno1 = new Aluno();
            aluno1.setNome(nomeAluno);
            aluno1.setMatricula(matAluno);
            aluno1.setNota(notas);
            
            aluno[i] = aluno1;
            
        
            
        }
        
        curso.setAlunos(aluno);
        
        System.out.println(curso.obterInfo());
        
        
        
        
        
        
        
    }
    
}
