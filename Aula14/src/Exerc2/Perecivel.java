
package Exerc2;


public class Perecivel extends Produto{
    
    private int diasCaducar;

    public Perecivel(int diasCaducar, double preco, String nome) {
        super(preco, nome);
        this.diasCaducar = diasCaducar;
    }

    

    

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    @Override
    public String toString() {
        return "Perecivel{" + "diasCaducar=" + diasCaducar + '}';
    }

    @Override
    public double calcular(int quantidade) {
        
        
double precoFinal = super.calcular(quantidade);
switch (diasCaducar){
    
    case 1: precoFinal/=4;
    break;
    
    case 2: precoFinal/=3;
    break;
    
    case 3: precoFinal/=2;
    break;
      
    
    
}
return precoFinal;

    }
    
   
    
    
}





