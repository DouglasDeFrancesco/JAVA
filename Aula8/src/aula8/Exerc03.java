
package aula8;


public class Exerc03 {


    public static void main(String[] args) {

        LivroDaLivraria  livro = new LivroDaLivraria();
                
         livro.nome  = "Minha Vida ";
         livro.autor ="Douglas Graça ";
         livro.categoria ="JAVA ";
         livro.isbn = "05041961";
         livro.preco = 25;
         livro.codigo = "dh1961";
         
         System.out.println("Nome do Livro: "+livro.nome);
         System.out.println(" Nome do autor: " +livro.autor);
         System.out.println("Categoria: "+livro.categoria);
         System.out.println("isbn: "+livro.isbn);
         System.out.println("Qual o preco: "+livro.preco);
         System.out.println("qual o codigo: "+livro.codigo);
         
         
         
                
        
        
    }
    
}
