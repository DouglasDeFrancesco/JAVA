
package aula14;


public class Comercial extends Empregado {

    
    private double comissao;

    public Comercial(double comissao, String nome, int idade, double salario) {
        super(nome, idade, salario);
        
        this.comissao = comissao;
                
    }

    @Override
    public String toString() {
     return super.toString() + "comissao=" + comissao + '}';
    }
    
    
    
    
    
    @Override
    public boolean plus() {
        if( super.getIdade()>30 && this.getComissao()>200){
            
            super.setSalario(super.getSalario()+super.Plus);
            
            System.out.println("acrescido o plus ao empregado: " + super.getNome());
            return true;
        }else{
            return false;
        }
   
        
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }




    
}
