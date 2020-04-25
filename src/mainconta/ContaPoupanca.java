package mainconta;
public class ContaPoupanca extends Conta {
    private double SaldoPou;

    
    //CONSTRUTOR
     public ContaPoupanca(String nome_titular, String CPF) {
        super(nome_titular, CPF);
    }
    
    
    
    
    
    // GETS SETS
    public double getSaldoPou() {
        return SaldoPou;
    }

    public void setSaldoPou(double SaldoPou) {
        this.SaldoPou = SaldoPou;
    }
       
    @Override
    public void status(){
        System.out.println("****Conta Poupança****");
        System.out.println("Titular da conta: "+getNome());
        System.out.println("Saldo em conta: "+getSaldo());
    }
    
    public void reajustar(double percentual){        
        double reajuste = this.getSaldo() * percentual;
        //this.depositar(reajuste); 
        setSaldoPou(reajuste);
        
    }
    
    @Override
    public String sacar(double saque){
        
        return "";
    }
}
