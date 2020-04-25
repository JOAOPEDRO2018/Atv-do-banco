package mainconta;
public class ContaEspecial extends Conta{
    private double limite; 

    public ContaEspecial(String nome_titular, String CPF, double limite) {
        super(nome_titular, CPF);
        this.limite = limite;
    }
    
    @Override
    public void status(){
        System.out.println("****Conta Especial****");
        System.out.println("Titular da conta: "+getNome());
        System.out.println("Saldo em conta: "+getSaldo());
    }
    
    @Override
    public String sacar(double sacar){
        if(sacar > getSaldo()){
            setSaldo(getSaldo() - sacar);
            this.limite -= sacar;
        return "Saldo atual: "+getSaldo()+" Limite atual: "+this.limite;
        }
        else if(sacar <= getSaldo()){
            setSaldo(getSaldo()- sacar); 
        return "Saque realizado. Saldo atual: "+getSaldo();
        }
   return ""; 
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
}
