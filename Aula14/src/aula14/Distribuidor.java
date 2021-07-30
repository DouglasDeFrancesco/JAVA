
package aula14;


public class Distribuidor extends Empregado {
    
    private String zona;

    public Distribuidor(String zona, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.zona = zona;
    }
    
    

    @Override
    public boolean plus() {
        if(super.getIdade()<25 && this.zona.equalsIgnoreCase("zona 3")){
        
        double novoSalario = super.getSalario()+ super.Plus;
        
        super.setSalario(novoSalario);
        
        System.out.println("acrescido o plus ao empregado " + super.getNome());
        return true;
        
                
        
        
    }
   
    return false;
    
    }


    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "zona=" + zona + '}';
    }
    
    
    
}
