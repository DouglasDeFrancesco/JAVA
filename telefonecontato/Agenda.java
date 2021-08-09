/*
Agenda de contactos (Telemóvel
•
Um contacto é definido pelo seu número de telefone e pelo seu nome. Considera se que
um contato é igual a outro contato se os seus nomes forem iguais.
•
Uma agenda de contactos é constituída por vários contactos.
•
Pode se criar de várias formas:
–
Indicámos nós o tamanho que vai ter;
–
Um tamanho standard: 10 contactos
Métodos a implementar
•
inserirContacto (Contacto c) insere um contacto na agenda. Caso não se consiga inserir
mais contactos na agenda, informar. Não se podem inserir contactos que já existam na
agenda, isto é, não se pode duplicar os nomes mesmo que o número de telefone seja
diferente.
6
•
•existeContactoexisteContacto(Contacto c) (Contacto c) ––indica se o contacto inserido existe ou não;indica se o contacto inserido existe ou não;
•
•listarContactolistarContacto()()--mostra todos os contactos da agenda;mostra todos os contactos da agenda;
•
•procuraContactosprocuraContactos( ( StringStringnome)nome)--procura um contacto pelo nome e mostra o numero de procura um contacto pelo nome e mostra o numero de telefone;telefone;
•
•eliminarContactoeliminarContacto(Contacto c)(Contacto c)--elimina o contacto da agenda, mostrar uma mensagem elimina o contacto da agenda, mostrar uma mensagem informativa;informativa;
•
•agendaCheiaagendaCheia()()--indica se a agenda está cheia;indica se a agenda está cheia;
•
•contactosDisponiveiscontactosDisponiveis() () ––indica quantos contactos ainda podemos inserir;indica quantos contactos ainda podemos inserir;
•
•na classe de testes fazer um menu de opções.na classe de testes fazer um menu de opções.




*/

package telefonecontato;


public class Agenda {



Contato[] contatos;

public Agenda(){

this.contatos = new Contato[10];

//indicamos nós o tamanho que vai ler

}

public Agenda (int tamanho){
    
    this.contatos = new Contato[tamanho];

}


//inserir o contato(contato c)

public void inserirContato(Contato c){
    
    boolean encontrou = false;
    
    for (int i = 0; i<contatos.length && !encontrou; i++){
    
    if (contatos[i]== null){
        
        encontrou = true;
        contatos[i] = c;
        
    }else
        
        encontrou= false;
    
    
        if (encontrou) {
            
            System.out.println("Inserido");
            
        }else
            System.out.println("não inserido");
   
}
   
    
    
    
}
    
    
}

    




    
}
