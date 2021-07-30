
package aula13;


public class Agenda {

private String nome;

// uma agenda tem verios contatos 
private Contato[]contatos;


//contruir com o atributo nome

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    
    public String obterInfo(){
        
        String info = "nome = " + nome;
        
        //caso nos esqueçamos de atribuir ao contato
        
        if(contatos !=null){
            
            for (Contato contato : contatos) {
                info+= contato.obterInfo()+" \n";
                
            }
    
        }
        
        
        return info;
        
    }

    
}
