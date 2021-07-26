
package Exerc2;


public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;//relaçao 1.1 --> curso 1.1
    private Aluno[] alunos;// a classe aluno

    /*public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }*/

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    



    
}
