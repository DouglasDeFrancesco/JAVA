


package acading;



public class Professor extends Pessoa{
    private double salario;
    private boolean fixo;        
    private int antiguidade;

    public Professor() {
    }

    public Professor(double salario, boolean fixo, int antiguidade, String nome, int NIF) {
        super(nome, NIF);
        this.salario = salario;
        this.fixo = fixo;
        this.antiguidade = antiguidade;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFixo() {
        return fixo;
    }

    public void setFixo(boolean fixo) {
        this.fixo = fixo;
    }

    @Override
    public String toString() {
        return "nome= " + super.getNome()+" "+ "NIF= " + super.getNIF()+" "+ "salario= " + salario + ", fixo=" + fixo + ", antiguidade=" + antiguidade;
    }

    public double calcular(double retencaoIRS,double salario, int antiguidade){
        
        salario = salario-(( salario * (retencaoIRS / 100)) +(antiguidade* 50));
   
   return salario;
    }
}
