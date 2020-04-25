package mainconta;
public class Conta {
    
    private String CPF;
    private String nome_titular;
    private double saldo;
    
//Construtor

    public Conta(String nome_titular, String CPF){
        setNome(nome_titular);  
        setCPF(CPF);
        
    }
   
//STATUS
    public void status(){
        System.out.println("****Conta corrente****");
        System.out.println("Titular da conta: "+getNome());
        System.out.println("Saldo em conta: "+getSaldo());
    }
//Gets Sets
    
     public void setNome(String nome_ti){
         this.nome_titular = nome_ti;
     }
     public String getNome(){
         return this.nome_titular;
     }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     
    
    
    
    
// Metodos 
    public String sacar(double valor){
        if(getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
        return "Saque realizado\n Saldo atual: "+this.saldo;
        }
        else if(getSaldo()<= valor) {
            return "Saldo insuficiente\n Saldo atual: "+this.saldo; 
        }
        return "";
    }
    
    public String depositar(double valor){
        if(valor <= 0){
            return "Somente valores maiores que 0";
        }
        else{
            this.saldo += valor; 
            return "Saldo: "+this.saldo;
        }
    }
    
    
}
