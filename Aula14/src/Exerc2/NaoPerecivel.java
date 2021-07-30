
package Exerc2;


public class NaoPerecivel extends Produto {

private String tipo;

    public NaoPerecivel(String tipo, double preco, String nome) {
        super(preco, nome);
        this.tipo = tipo;
    }



    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo=" + tipo + '}';
    }



   

   

   


}
